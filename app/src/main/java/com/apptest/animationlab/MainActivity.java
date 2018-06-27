package com.apptest.animationlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button[] button;
    ImageView image;
    int resType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = new Button[6];
        for(int i = 0; i< button.length; i++){
            String buttonID = "button"+i;

            int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
            Log.i("button",String.valueOf(resID));
            button[i] = (Button) findViewById(resID);
            button[i].setOnClickListener(this);
        }
        image = findViewById(R.id.pin);
    }
    public void animation(View view, int type,ImageView img){

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),type);
        image.startAnimation(animation);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button0:
                resType = getResources().getIdentifier("blink", "anim", getPackageName());
                animation(view,resType,image);
                break;
            case R.id.button1:
                resType = getResources().getIdentifier("clockwise", "anim", getPackageName());
                animation(view,resType,image);

                break;
            case R.id.button2:
                resType = getResources().getIdentifier("fade", "anim", getPackageName());
                animation(view,resType,image);
                break;
            case R.id.button3:
                resType = getResources().getIdentifier("move", "anim", getPackageName());
                animation(view,resType,image);
                break;
            case R.id.button4:
                resType = getResources().getIdentifier("slide", "anim", getPackageName());
                animation(view,resType,image);
                break;
            case R.id.button5:
                resType = getResources().getIdentifier("zoom", "anim", getPackageName());
                animation(view,resType,image);
                break;

        }
    }
}
