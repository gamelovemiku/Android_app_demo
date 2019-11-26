package com.example.appweek1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class UI extends AppCompatActivity {

    EditText nameEdt;
    ImageButton imgBtn;
    Spinner teamSpinner;
    TextView nameText, genderText;
    RadioButton maleRadio, femaleRadio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);

        nameEdt = findViewById(R.id.editText);
        imgBtn = findViewById(R.id.imageButton);
        teamSpinner = findViewById(R.id.spinner);
        nameText = findViewById(R.id.nameResultText);
        genderText = findViewById(R.id.genderResultText);
        maleRadio = findViewById(R.id.radioButton3);
        femaleRadio = findViewById(R.id.radioButton2);

        final String[] teamList = getResources().getStringArray(R.array.team);

        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameStr = nameEdt.getText().toString();

                nameText.setText(nameStr);

                Toast.makeText(getApplicationContext(),
                        "My name is " + nameStr,
                Toast.LENGTH_LONG).show();
            }
        });

        maleRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                genderAction(v); //<-v
            }
        });

        femaleRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                genderAction(v); //<-v
            }
        });

        teamSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String nameStr = nameEdt.getText().toString();

                Toast.makeText(
                        UI.this,
                        "It's me! " + nameStr + " . I like " + teamList[position] + " team.", Toast.LENGTH_SHORT
                ).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    void genderAction(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.radioButton3:
                if (checked)
                    genderText.setText("Male");
                break;
            case R.id.radioButton2:
                if (checked)
                    genderText.setText("Female");
                break;
        }
    }
}
