package com.game.djy.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    String[] Animal={"bear","bird","cat","elephant","fish","flower","giraffe","honey","house","hypo","kangaroo","leo","lion","pig","rhino","sun","tiger","wolf"};
    int[] ImgId={R.drawable.bear,R.drawable.bird,R.drawable.cat,R.drawable.elephant,R.drawable.fish,R.drawable.flower,R.drawable.giraffe,R.drawable.honey,R.drawable.house,
            R.drawable.hypo,R.drawable.kangaroo,R.drawable.leo,R.drawable.lion,R.drawable.pig,R.drawable.rhino,R.drawable.sun,R.drawable.tiger,R.drawable.wolf};

    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    Button question;
    TextView score;
    int scorenum=0;

    int ran;
    int ran1;
    int ran2;
    int ran3;
    int ran4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        img1 = (ImageView) findViewById(R.id.img_1);
        img2 = (ImageView) findViewById(R.id.img_2);
        img3 = (ImageView) findViewById(R.id.img_3);
        img4 = (ImageView) findViewById(R.id.img_4);
        question=(Button) findViewById(R.id.question);
        score = (TextView) findViewById(R.id.score);


        setImg();
    }

    private void setImg(){
        score.setText(String.valueOf(scorenum));

        Random rand = new Random();
        ran1=rand.nextInt(18);
        do{
            ran2=rand.nextInt(18);
        }while(ran2==ran1);
        do{
            ran3=rand.nextInt(18);
        }while(ran3==ran2||ran3==ran1);
        do{
            ran4=rand.nextInt(18);
        }while(ran4==ran3||ran4==ran2||ran4==ran1);

        img1.setImageResource(ImgId[ran1]);
        img2.setImageResource(ImgId[ran2]);
        img3.setImageResource(ImgId[ran3]);
        img4.setImageResource(ImgId[ran4]);

        ran = rand.nextInt(4)+1;
        if(ran==1)
        {
            question.setText(Animal[ran1]);
        }
        if(ran==2)
        {
            question.setText(Animal[ran2]);
        }
        if(ran==3)
        {
            question.setText(Animal[ran3]);
        }
        if(ran==4)
        {
            question.setText(Animal[ran4]);
        }
    }


    public void select1(View view) {
        if(ran==1)
        {
            if(scorenum<4) {
                scorenum++;
                setImg();;
            }
            else{
                startActivity(new Intent(GameActivity.this,successActivity.class));
                finish();
            }
        }
        else
        {
            startActivity(new Intent(GameActivity.this,failActivity.class));
            finish();
        }
    }

    public void select2(View view) {
        if(ran==2)
        {
            if(scorenum<4) {
                scorenum++;
                setImg();;
            }
            else{
                startActivity(new Intent(GameActivity.this,successActivity.class));
                finish();
            }
        }
        else
        {
            startActivity(new Intent(GameActivity.this,failActivity.class));
            finish();
        }
    }

    public void select3(View view) {
        if(ran==3)
        {
            if(scorenum<4) {
                scorenum++;
                setImg();;
            }
            else{
                startActivity(new Intent(GameActivity.this,successActivity.class));
                finish();
            }
        }
        else
        {
            startActivity(new Intent(GameActivity.this,failActivity.class));
            finish();
        }
    }

    public void select4(View view) {
        if(ran==4)
        {
            if(scorenum<4) {
                scorenum++;
                setImg();;
            }
            else{
                startActivity(new Intent(GameActivity.this,successActivity.class));
                finish();
            }
        }
        else
        {
            startActivity(new Intent(GameActivity.this,failActivity.class));
            finish();
        }
    }
}
