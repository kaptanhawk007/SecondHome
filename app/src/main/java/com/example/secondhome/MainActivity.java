package com.example.secondhome;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.secondhome.login.LoginAndSignUpActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private FrameLayout fragment_container;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bottomNavigationView);
        fragment_container=findViewById(R.id.fragment_container);
     HomePageFragment   homepageFragment=new HomePageFragment();
     FavoriteFragment favoriteFragment=new FavoriteFragment();
     ProfileFragment profileFragment=new ProfileFragment();
     ExploreFragment exploreFragment=new ExploreFragment();
       // startActivity(new Intent(MainActivity.this, LoginAndSignUpActivity.class));
       bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
               switch (item.getItemId()){
                   case R.id.nav_Home:
                       fragmentTransaction.replace(R.id.fragment_container,homepageFragment,"HomepageFragment");
                       break;
                   case R.id.nav_Profile:
                       fragmentTransaction.replace(R.id.fragment_container,profileFragment);

                       break;
                   case R.id.nav_explore:
                       fragmentTransaction.replace(R.id.fragment_container,exploreFragment);
                       break;
                   case R.id.nav_favorite:
                       fragmentTransaction.replace(R.id.fragment_container,favoriteFragment);
                       break;
               }
               fragmentTransaction.commit();
               return true;
           }
       });
       bottomNavigationView.setSelectedItemId(R.id.nav_Home);

    }
}