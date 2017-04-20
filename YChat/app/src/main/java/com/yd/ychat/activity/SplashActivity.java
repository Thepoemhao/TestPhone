package com.yd.ychat.activity;

import android.os.Handler;
import android.os.Message;
import android.os.Bundle;
import android.view.View;

import com.hyphenate.chat.EMClient;
import com.yd.ychat.R;

public class SplashActivity extends BaseActivity {

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            //getInstance单例模式  ， 在之前是否登录过
            if (EMClient.getInstance().isLoggedInBefore()) {
                intent2Main();
            } else {
                intent2Login();
            }
            SplashActivity.this.finish();
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        handler.sendEmptyMessageDelayed(1, 3000);
        findViewById(R.id.splash_img).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //移除消息f
                handler.removeMessages(1);
                handler.sendEmptyMessage(0);
            }
        });
    }
}
