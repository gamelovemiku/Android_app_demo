package com.example.appweek1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //ประกาศตัวแปร Obj
    TextView textview;
    Button btn, btnreset;
    EditText edt, edt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 2 เรียกใช้ View จาก xml
        textview = findViewById(R.id.msg);

        btn = findViewById(R.id.button);
        btnreset = findViewById(R.id.resetbtn);
        edt = findViewById(R.id.text1);
        edt2 = findViewById(R.id.text2);

        //Step 3 ใช้ click button
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                int result = Integer.parseInt(edt.getText().toString()) + Integer.parseInt(edt2.getText().toString());
                textview.setText(result + "");
            }
        });

        btnreset.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                textview.setText("0");
            }
        });

    }
}
