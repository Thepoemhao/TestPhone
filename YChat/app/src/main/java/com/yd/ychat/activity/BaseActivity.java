package com.yd.ychat.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.yd.ychat.MainActivity;

/**
 * Created by DELL on 2017/4/20.
 */

public class BaseActivity extends AppCompatActivity {
    public void showTosast(String str) {
        Toast.makeText(this, str, Toast.LENGTH_LONG).show();

    }

    public void intent2Login() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void intent2Main() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
