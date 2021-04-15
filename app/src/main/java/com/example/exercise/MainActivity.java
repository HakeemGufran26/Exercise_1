package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    private EditText edtuser;
    private EditText edtpw;

    Button btnlgn, btndaftar;
    String name, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlgn = findViewById(R.id.btnsignin);
        btndaftar = findViewById(R.id.btnrgs);
        edtuser = findViewById(R.id.username);
        edtpw = findViewById(R.id.pwd);



        btnlgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = edtuser.getText().toString();
                password = edtpw.getText().toString();
                String username = "admin@mail.com";
                String pwd = "123";

                if (name.isEmpty() && password.isEmpty()) {
                    Toast t = Toast.makeText(getApplicationContext(), "Masukkan Email dan Password", Toast.LENGTH_LONG);
                    edtuser.setError("Masukkan Email");
                    edtpw.setError("Masukkan Password");
                    t.show();
                }
                else if (name.isEmpty()) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Masukkan Email",
                            Toast.LENGTH_LONG);
                    edtuser.setError("Masukkan Email");
                    t.show();
                } else if (password.isEmpty()) {
                    edtpw.setError("Masukkan Password");

                } else {
                    if (name.equals(username) && password.equals(pwd)) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login Berhasil",
                                Toast.LENGTH_LONG);
                        t.show();
                        Bundle b = new Bundle();
                        b.putString("a", name.trim());
                        b.putString("b", password.trim());
                        Intent i = new Intent(MainActivity.this, Home1.class);
                        i.putExtras(b);
                        startActivity(i);
                    } else {
                        Toast t = Toast.makeText(getApplicationContext(),
                                "Email atau password salah", Toast.LENGTH_LONG);
                        t.show();
                    }
                }
            }
        });
        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Register.class);
                startActivity(i);
            }
        });
    }
}