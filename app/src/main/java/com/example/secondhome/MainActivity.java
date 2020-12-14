package com.example.secondhome;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.secondhome.login.LoginAndSignUpActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bottomNavigationView);
       // startActivity(new Intent(MainActivity.this, LoginAndSignUpActivity.class));
       bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               switch (item.getItemId()){
                   case R.id.nav_Home:
                       Toast.makeText(MainActivity.this, "Home Selected", Toast.LENGTH_SHORT).show();
                       break;
                   case R.id.nav_Profile:
                       Toast.makeText(MainActivity.this, "Profile selected", Toast.LENGTH_SHORT).show();
                       break;
                   case R.id.nav_search:
                       Toast.makeText(MainActivity.this, "Search selected", Toast.LENGTH_SHORT).show();
                       break;


               }
               return true;
           }
       });
       bottomNavigationView.setSelectedItemId(R.id.nav_Home);

    }
}