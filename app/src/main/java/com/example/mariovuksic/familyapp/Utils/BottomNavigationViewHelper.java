package com.example.mariovuksic.familyapp.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.example.mariovuksic.familyapp.Home.HomeActivity;
import com.example.mariovuksic.familyapp.Likes.LikesActivity;
import com.example.mariovuksic.familyapp.Search.SearchActivity;
import com.example.mariovuksic.familyapp.Profile.ProfileActivity;
import com.example.mariovuksic.familyapp.R;
import com.example.mariovuksic.familyapp.Share.ShareActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by mariovuksic on 2017-10-28.
 */

public class BottomNavigationViewHelper {

    private static final String TAG = "BottomNavigationViewHelp";


    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx) {
        Log.d(TAG,"setupBottomNavigationView:Setting up BottomNavigationView");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view){
       view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {

               switch (item.getItemId()){

                   case R.id.ic_house:
                       Intent intent1 = new Intent(context, HomeActivity.class);  //Activity number 0
                       context.startActivity(intent1);
                       break;

                   case R.id.ic_search:
                       Intent intent2 = new Intent (context, SearchActivity.class); //Activity number 1
                       context.startActivity(intent2);
                       break;

                   case R.id.ic_circle:
                       Intent intent3 = new Intent (context, ShareActivity.class);  //Activity number 2
                       context.startActivity(intent3);
                       break;

                   case R.id.ic_alert:
                       Intent intent4 = new Intent(context, LikesActivity.class);   //Activity number 3
                       context.startActivity(intent4);
                       break;

                   case R.id.ic_android:
                       Intent intent5 = new Intent(context, ProfileActivity.class); //Activity number 4
                       context.startActivity(intent5);
                       break;
               }

               return false;
           }
       });
    }

}
