package com.game.djy.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_play(View view) {
        startActivity(new Intent(MainActivity.this,GameActivity.class));
        finish();
    }

    public void btn_exit(View view) {
        finish();
    }
}
