package com.example.bookhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ResetActivity extends AppCompatActivity {
    TextView username;
    EditText pass,repass;
    Button btnconfirm;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);
        username=(TextView)findViewById(R.id.username_reset_text);
        pass=(EditText)findViewById(R.id.password_reset);
        repass=(EditText)findViewById(R.id.repassword_text);
        btnconfirm=(Button)findViewById(R.id.btnconfirm);
        DB=new DBHelper(this);
        Intent intent=getIntent();
        username.setText(intent.getStringExtra("username"));
        btnconfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=username.getText().toString();
                String password=pass.getText().toString();
                String repassword=repass.getText().toString();
                if(password.equals(repassword)) {
                    Boolean checkpasswordupdate = DB.updatepassword(user,password);
                    if (checkpasswordupdate == true) {
                        Intent intent = new Intent(getApplicationContext(), LoginActivity2.class);
                        startActivity(intent);
                        Toast.makeText(ResetActivity.this, "Password updates Succesfully", Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(ResetActivity.this, "Password not updates Succesfully", Toast.LENGTH_SHORT).show();

                    }
                }
                else
                {
                    Toast.makeText(ResetActivity.this,"Password Not Matching",Toast.LENGTH_SHORT).show();

                }
            }

        });
    }
}