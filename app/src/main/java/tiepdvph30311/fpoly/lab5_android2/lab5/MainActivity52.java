//package tiepdvph30311.fpoly.android2.demo1.demo5;
//
//import android.annotation.SuppressLint;
//import android.os.Bundle;
//import android.view.MenuItem;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.ActionBarDrawerToggle;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.view.GravityCompat;
//import androidx.drawerlayout.widget.DrawerLayout;
//import androidx.fragment.app.Fragment;
//import androidx.fragment.app.FragmentManager;
//
//import com.google.android.material.navigation.NavigationView;
//
//import tiepdvph30311.fpoly.android2.R;
//
//import tiepdvph30311.fpoly.android2.demo1.dem4.Fragment2;
//import tiepdvph30311.fpoly.android2.demo1.dem4.fragment1;
//
//
//public class MainActivity52 extends AppCompatActivity {
//
//    private DrawerLayout drawerLayout;
//    private NavigationView navigationView;
//
//    @SuppressLint("MissingInflatedId")
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main52);
//
//        drawerLayout = findViewById(R.id.drawer);
//        navigationView = findViewById(R.id.nav_view);
//
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawerLayout.addDrawerListener(toggle);
//        toggle.syncState();
//
//        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//            @SuppressLint("NonConstantResourceId")
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                Fragment selectedFragment = null;
//                switch (item.getItemId()) {
//                    case R.id.demo1:
//                        selectedFragment = new fragment1();
//                        break;
//                    case R.id.demo2:
//                        selectedFragment = new Fragment2();
//                        break;
//                    case R.id.demo3:
//                        break;
//                }
//
//                if (selectedFragment != null) {
//                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
//                    drawerLayout.closeDrawer(GravityCompat.START);
//                    return true;
//                }
//                return false;
//            }
//        });
//
//        // Set initial fragment
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new fragment1()).commit();
//            navigationView.setCheckedItem(R.id.demo1);
//        }
//    }
//
//    @Override
//    public void onBackPressed() {
//        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
//            drawerLayout.closeDrawer(GravityCompat.START);
//        } else {
//            super.onBackPressed();
//        }
//    }
//}
package tiepdvph30311.fpoly.lab5_android2.lab5;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.google.android.material.navigation.NavigationView;

import tiepdvph30311.fpoly.lab5_android2.R;
import tiepdvph30311.fpoly.lab5_android2.dem4.Fragment2;
import tiepdvph30311.fpoly.lab5_android2.dem4.fragment1;


public class MainActivity52 extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main52);

        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.nav_view);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                int itemId = item.getItemId();

                if (itemId == R.id.demo1) {
                    selectedFragment = new fragment1();
                } else if (itemId == R.id.demo2) {
                    selectedFragment = new Fragment2();
                } else if (itemId == R.id.demo3) {

                }

                if (selectedFragment != null) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, selectedFragment)
                            .commit();
                    drawerLayout.closeDrawer(GravityCompat.START);
                    return true;
                }
                return false;
            }
        });

        // Set initial fragment
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new fragment1())
                    .commit();
            navigationView.setCheckedItem(R.id.demo1);
        }
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
