package com.example.projetopa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private EditText User;
    private EditText Pw;
    private TextView Info;
    private Button Login;
    private int counter = 3; //counter para tentativas de login

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        User =(EditText)findViewById(R.id.editTextUser);
        Pw = (EditText)findViewById(R.id.editTextpw);
        Info = (TextView)findViewById(R.id.Attempts);
        Login = (Button)findViewById(R.id.btnLogin);

        Info.setText("Number of attempts remaining: 3");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(User.getText().toString(),Pw.getText().toString());
            }
        });
    }

    private void validate(String userName, String userPassword){
        if((userName == "Admin") && (userPassword == "1234")){
            Intent intent = new Intent(Login.this, Home.class);  //Começar ativity home
            startActivity(intent);
        }else{
            counter--; //baixar nº de tentativas quando falha o login

            Info.setText("Number of attempts remaining:" + counter);

            if(counter == 0){
                Login.setEnabled(false); // Dar disable no butao quando counter chega a 0
            }
        }
    }


}
