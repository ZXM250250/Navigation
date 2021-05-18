package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         *把xml里面设置的fragment 设置给navController进行管理
         */
        NavController navController = Navigation.findNavController(this, R.id.fragment);
        NavigationUI.setupActionBarWithNavController(this,navController);
    }

    /**
     * 此方法可以使得  导航栏的返回键起效果
     * 知道返回的是哪里
     * @return
     */
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.fragment);
        return navController.navigateUp();
    }

}