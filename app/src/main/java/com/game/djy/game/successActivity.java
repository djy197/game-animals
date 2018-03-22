package com.game.djy.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class successActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
    }

    public void btn_exit(View view) {
        finish();
    }

    public void btn_re(View view) {
        startActivity(new Intent(successActivity.this,GameActivity.class));
        finish();
    }
}
