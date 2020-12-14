
package com.example.secondhome.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.secondhome.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginAndSignUpActivity extends AppCompatActivity {
    private TextInputEditText email,password;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_and_signp);

        email=findViewById(R.id.emailInputField);
        btnLogin=findViewById(R.id.btnLogin);
        password=findViewById(R.id.passwordInputField);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (password.getText().toString().isEmpty()||email.getText().toString().isEmpty()){
                    email.setError("Email Empty");
                    password.setError("Password Empty");
                    Toast.makeText(LoginAndSignUpActivity.this, "Password null", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(LoginAndSignUpActivity.this, email.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}