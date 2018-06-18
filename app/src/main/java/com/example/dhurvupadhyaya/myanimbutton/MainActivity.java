package com.example.dhurvupadhyaya.myanimbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void onBlueTapped(View view){

        //Button blue = findViewById(R.id.blueButton);

        findViewById(R.id.blackBulb).animate().alpha(0).setDuration(200);
        findViewById(R.id.bluebulb).animate().alpha(1).setDuration(200);
        findViewById(R.id.greenBulb).animate().alpha(0).setDuration(200);

    }

    public void onGreenTapped(View view){

        //Button green = findViewById(R.id.greenButton);

        ImageView black = findViewById(R.id.blackBulb);
        black.animate().alpha(0).setDuration(200);
        findViewById(R.id.greenBulb).animate().alpha(1).setDuration(200);
        findViewById(R.id.bluebulb).animate().alpha(0).setDuration(200);
    }

    public void onBlackTapped(View view){

        ImageView black = findViewById(R.id.blackBulb);
        black.animate().alpha(1).setDuration(200);
        findViewById(R.id.greenBulb).animate().alpha(0).setDuration(200);
        findViewById(R.id.bluebulb).animate().alpha(0).setDuration(200);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
