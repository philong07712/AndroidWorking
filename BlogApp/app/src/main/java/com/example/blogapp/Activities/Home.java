//package com.example.blogapp.Activities;
//
//import android.os.Bundle;
//import android.view.MenuItem;
//import android.view.View;
//import android.view.Menu;
//import android.widget.ImageView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.bumptech.glide.Glide;
//import com.example.blogapp.Fragments.HomeFragment;
//import com.example.blogapp.Fragments.SettingFragment;
//import com.example.blogapp.R;
//import com.google.android.material.floatingactionbutton.FloatingActionButton;
//import com.google.android.material.snackbar.Snackbar;
//import com.google.android.material.navigation.NavigationView;
//import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.auth.FirebaseUser;
//
//import androidx.annotation.NonNull;
//import androidx.core.view.GravityCompat;
//import androidx.navigation.NavController;
//import androidx.navigation.Navigation;
//import androidx.navigation.ui.AppBarConfiguration;
//import androidx.navigation.ui.NavigationUI;
//import androidx.drawerlayout.widget.DrawerLayout;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;
//
//public class Home extends AppCompatActivity {
//
//    // custom variable
//    TextView navUserName, navUserEmail;
//    ImageView navUserPhoto;
//    FirebaseAuth mAuth = FirebaseAuth.getInstance();
//
//    private AppBarConfiguration mAppBarConfiguration;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_home2);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        // init View
//        FloatingActionButton fab = findViewById(R.id.fab);
//
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//        final DrawerLayout drawer = findViewById(R.id.drawer_layout);
//        NavigationView navigationView = findViewById(R.id.home_nav);
//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        mAppBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.nav_home, R.id.nav_setting, R.id.nav_profile)
//                .setDrawerLayout(drawer)
//                .build();
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
//        NavigationUI.setupWithNavController(navigationView, navController);
//
//        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId())
//                {
//                    case R.id.nav_setting:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new SettingFragment()).commit();
//                }
//                drawer.closeDrawer(GravityCompat.START);
//                return true;
//            }
//        });
//        // custom method
//        updateNavHeader();
//    }
//
//    private void showMessage(String message) {
//        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.home, menu);
//        return true;
//    }
//
//
//
//    @Override
//    public boolean onSupportNavigateUp() {
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
//                || super.onSupportNavigateUp();
//    }
//
//    private void updateNavHeader()
//    {
//        NavigationView navigationView = findViewById(R.id.home_nav);
//        View header = navigationView.getHeaderView(0);
//        navUserEmail = header.findViewById(R.id.nav_user_email);
//        navUserName = header.findViewById(R.id.nav_user_name);
//        navUserPhoto = header.findViewById(R.id.nav_user_photo);
//        // set data to nav header
//
//        FirebaseUser currentUser = mAuth.getCurrentUser();
//        navUserName.setText(currentUser.getDisplayName());
//        navUserEmail.setText(currentUser.getEmail());
//
//        // use glide to get image
//
//        Glide.with(this).load(currentUser.getPhotoUrl()).into(navUserPhoto);
//    }
//}
