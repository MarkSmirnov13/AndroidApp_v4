package com.example.user.newshooter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FinalActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        TextView tw = (TextView) findViewById(R.id.textView);
        tw.setText("           "+SpaceShooterView.score);
    }

    public void onStartButton2(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
