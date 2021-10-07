package com.example.bookhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class LoginActivity2 extends AppCompatActivity {
    EditText username,password;
    Button btnLogin;
    TextView reg2,reg3;
    DBHelper myDB;
    MediaPlayer mysong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        mysong = MediaPlayer.create(this, R.raw.ace);
        mysong.start();
        setTitle("Valopedia->Log In");
        username=(EditText)findViewById(R.id.mainID);
        password=(EditText)findViewById(R.id.mainpass);
        btnLogin=(Button) findViewById(R.id.btnlogin);
        reg2=(TextView) findViewById(R.id.reg2);
        reg3=(TextView) findViewById(R.id.reg3);
        reg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),PasswordActivity.class);
                startActivity(intent);
            }
        });
        reg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        myDB=new DBHelper(this);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=username.getText().toString();
                String pass=password.getText().toString();
                mysong.pause();

                if(user.equals("")||pass.equals(""))
                {
                    Toast.makeText(LoginActivity2.this,"Please enter the credentials",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Boolean result=myDB.checkusernamePassword(user,pass);
                    if(result==true)
                    {
                        Toast.makeText(LoginActivity2.this,"Welcome To My World!",Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(getApplicationContext(),PAGE_FIRST.class);
                        startActivity(intent);
                    }


                    else

                    {
                        Toast.makeText(LoginActivity2.this,"Incorrect Credentials",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}