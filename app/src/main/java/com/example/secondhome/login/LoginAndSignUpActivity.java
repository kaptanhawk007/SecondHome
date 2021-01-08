
package com.example.secondhome.login;

import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.secondhome.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginAndSignUpActivity extends AppCompatActivity {
    private TextInputEditText email,password;
    private Button btnLogin;
    private TextView signUpTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_and_signp);
        init();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validation();
            }
        });
        
        signUpTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: 12/14/2020 Create a fragment
            }
        });




    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    void init(){
        signUpTV=findViewById(R.id.signUpTV);
        email=findViewById(R.id.emailInputField);
        btnLogin=findViewById(R.id.btnLogin);
        password=findViewById(R.id.passwordInputField);
    }
    boolean validation(){
        if (email.getText().toString().isEmpty()){
            email.setError("Email Can not be Empty");
            return false;
        }
        if (password.getText().toString().isEmpty()){
            password.setError("Password Can not be Empty");
            return false;
        }
        if (password.getText().toString().length()<8){
            password.setError("Password Must be of 8 character");
        }
        return true;

    }
}