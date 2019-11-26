package com.example.appweek1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {

    String msg1 = "Lab3";
    String msg2 = "Activity B : ";
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Log.d(msg1, msg2 + "onRestart");

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityA.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg1, msg2 + "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg1, msg2 + "onPause");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg1, msg2 + "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg1, msg2 + "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg1, msg2 + "onDestroy");
    }

}