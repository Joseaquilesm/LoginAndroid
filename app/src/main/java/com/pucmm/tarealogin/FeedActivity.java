package com.pucmm.tarealogin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import static android.view.View.INVISIBLE;


public class FeedActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    DrawerLayout menuLayout;
    NavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.navigation_drawer);

        toolbar = findViewById(R.id.myToolbar);
        setSupportActionBar(toolbar);


        menuLayout = findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, menuLayout, toolbar,R.string.open_drawer,R.string.close_drawer);
        menuLayout.setDrawerListener(toggle);
        toggle.syncState();
        navView    = findViewById(R.id.nav_view);
        navView.setNavigationItemSelectedListener(this);

    }




    @Override
    public void onBackPressed(){
        if(menuLayout.isDrawerOpen(GravityCompat.START)){
            menuLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        switch(itemId){
            case R.id.home:
                Toast.makeText(getApplicationContext(),"Home", Toast.LENGTH_SHORT).show();
                break;

            case R.id.category:
                Toast.makeText(getApplicationContext(),"Category", Toast.LENGTH_SHORT).show();

                break;

            case R.id.product:
                Toast.makeText(getApplicationContext(),"Product", Toast.LENGTH_SHORT).show();

                break;

            case R.id.order:
                Toast.makeText(getApplicationContext(),"Order", Toast.LENGTH_SHORT).show();

                break;

            case R.id.orderTracking:
                Toast.makeText(getApplicationContext(),"Order Tracking", Toast.LENGTH_SHORT).show();

                break;

            case R.id.list_os:

                break;

            case R.id.help:
                Toast.makeText(getApplicationContext(),"Help", Toast.LENGTH_SHORT).show();

                break;

            case R.id.profile:
                Toast.makeText(getApplicationContext(),"Profile", Toast.LENGTH_SHORT).show();

                break;

            case R.id.logout:
               // Toast.makeText(getApplicationContext(),"Log Out", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FeedActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
                break;
        }
        menuLayout.closeDrawer(GravityCompat.START);

            return true;
    }
}