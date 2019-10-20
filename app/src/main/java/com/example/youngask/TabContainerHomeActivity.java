package com.example.youngask;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.youngask.Fragments.AnswersFragment;
import com.example.youngask.Fragments.HomeFragment;
import com.example.youngask.Fragments.ListFragment;

public class TabContainerHomeActivity extends AppCompatActivity {

    private ActionBar toolBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_container_home);

        toolBar = getSupportActionBar();
        BottomNavigationView navigationView = findViewById(R.id.bottom_navigation_view);
        navigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

//        set the default fragment to homeFragment
//        toolBar.setTitle("Home");
        loadFragment(new HomeFragment());
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment = null;
            switch (menuItem.getItemId()){
                case R.id.nav_home:
//                    toolBar.setTitle("Home");
                    selectedFragment = new HomeFragment();
                    loadFragment(selectedFragment);
                    return true;

                case R.id.nav_list:
//                    toolBar.setTitle("List");
                    selectedFragment = new ListFragment();
                    loadFragment(selectedFragment);
                    return true;

                case R.id.nav_message:
//                    toolBar.setTitle("Answers");
                    selectedFragment = new AnswersFragment();
                    loadFragment(selectedFragment);
                    return true;
            }
            return false;
        }
    };

    private void loadFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
