package com.example.hello1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText loginText,passwordText;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        loginText = (EditText) findViewById(R.id.login);
        passwordText = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.buttonLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = loginText.getText().toString();
                String password = passwordText.getText().toString();
                if(username.equals("user") && (password.equals("123456"))){
                    Toast.makeText(MainActivity2.this, "Welcome", Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);

                }else{

                    Toast.makeText(MainActivity2.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
                }



        };

    });
}

    public void launchMainActivity(View view) {
         Intent intent = new Intent(this,MainActivity.class);
         startActivity(intent);


    }
}