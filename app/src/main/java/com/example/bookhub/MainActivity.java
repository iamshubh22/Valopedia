package com.example.bookhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,password,repassword;
    Button btnSignUp;
    TextView btnSignIn,btnforgot;
    DBHelper myDB;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText)findViewById(R.id.user);
        password=(EditText)findViewById(R.id.user2);
        repassword=(EditText)findViewById(R.id.user3);

        btnSignUp=(Button)findViewById(R.id.signup);
        btnSignIn=(TextView)findViewById(R.id.signin);
        btnforgot=(TextView)findViewById(R.id.btnforgot);
        myDB=new DBHelper(this);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),LoginActivity2.class);
                startActivity(intent);
            }
        });
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=username.getText().toString();
                String pass=password.getText().toString();
                String repass=repassword.getText().toString();

                if(user.equals("")||pass.equals("")||repass.equals(""))
                {
                    Toast.makeText(MainActivity.this,"Fill in the details",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    if(pass.equals(repass))
                    {
                        Boolean usercheckResult = myDB.checkusername(user);
                        if(usercheckResult == false)
                        {
                            Boolean regResult=myDB.insertData(user,pass);
                            if(regResult==true)

                            {


                                Toast.makeText(MainActivity.this,"Registration Succesfull",Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(getApplicationContext(),LoginActivity2.class);
                                startActivity(intent);
                            }
                            else
                            {
                                Toast.makeText(MainActivity.this,"Registration filled",Toast.LENGTH_SHORT).show();
                            }
                        }
                        else
                        {
                            Toast.makeText(MainActivity.this,"User Already Exists.\n Please sign in",Toast.LENGTH_SHORT).show();
                        }
                    }

                    else {
                        Toast.makeText(MainActivity.this,"Password not Matching",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        btnforgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),PasswordActivity.class);
                startActivity(intent);


            }
        });



    }
}