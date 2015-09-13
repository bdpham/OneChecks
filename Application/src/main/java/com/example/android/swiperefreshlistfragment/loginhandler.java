package com.example.android.swiperefreshlistfragment;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by rigo on 9/13/15.
 */
public class loginhandler extends Activity {

    private Handler handler;

    // Will be called on login button press
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
        handler = new Handler();
    }
}
