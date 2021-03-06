package com.example.mariovuksic.familyapp.Home;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.mariovuksic.familyapp.R;
import com.example.mariovuksic.familyapp.Utils.BottomNavigationViewHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by mariovuksic on 2017-10-28.
 */

public class NotesActivity extends AppCompatActivity {

    private static final String TAG = "NotesActivity";
    private static final int ACTIVITY_NUM = 4;


    private Context mContext = NotesActivity.this;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        Log.d(TAG, "onCreate: started");

        setupBottomNavigationView();
    }

    //BottomNavigationView setup
    private void setupBottomNavigationView(){
        Log.d(TAG, "setupBottomNavigationView : setting up BottomNavigationView");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNavigationViewHelper.enableNavigation(mContext, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }
}
