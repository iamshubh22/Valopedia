package com.example.bookhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PasswordActivity extends AppCompatActivity {
    EditText username;
    Button reset;
    DBHelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        setTitle("Valopedia->Forgot Password");
        username = (EditText)findViewById(R.id.edit4);
        reset = (Button)findViewById(R.id.btnreset);
        myDB = new DBHelper(this);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=username.getText().toString();
                Boolean checkuser=myDB.checkusername(user);
                if(checkuser==true)
                {
                    Intent intent=new Intent(getApplicationContext(),ResetActivity.class);
                    intent.putExtra("username",user);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(PasswordActivity.this,"user does not exist",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}