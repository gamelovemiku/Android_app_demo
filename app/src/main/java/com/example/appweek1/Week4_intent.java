package com.example.appweek1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Week4_intent extends AppCompatActivity {

    Button button, buttonData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week4_intent);

        button = (Button)findViewById(R.id.button);
        buttonData = (Button)findViewById(R.id.buttonSendData);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String geoCode = "geo:0,0?q=มหาวิทยาลัยเทคโนโลยีมหานคร";
                //String geoCode = "google.streetview:13.8452854,100.857842,3a,75y,56.77h,84.01t";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoCode));
                startActivity(intent);

            }
        });

        buttonData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int data = 5;
                Intent intent = new Intent(getApplicationContext(), ActivityB.class);
                intent.putExtra("price", data);
                startActivity(intent);

            }
        });

    }

}
