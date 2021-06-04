package com.example.uts_akb_if9_10118377.main;

import android.os.Bundle;

import com.example.uts_akb_if9_10118377.R;
import com.example.uts_akb_if9_10118377.main.menu.info.InfoFragment1;
import com.example.uts_akb_if9_10118377.main.menu.info.InfoFragment2;
import com.example.uts_akb_if9_10118377.main.menu.info.InfoFragment3;
import com.example.uts_akb_if9_10118377.main.menu.info.SlidePagerAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);

        getSupportActionBar().hide();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(navView, navController);

    }

}