package com.example.omaru.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;

import static com.example.omaru.bmi.BMI.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        final TextView resultView = (TextView) findViewById(R.id.result);
        final EditText massInput = (EditText) findViewById(R.id.mass_input);
        final EditText heightInput = (EditText) findViewById(R.id.height_input);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("bmi","click click motherfucker");
                Log.d("bmi",massInput.getText().toString());
                Log.d("bmi",heightInput.getText().toString());
                BigDecimal result = calculate(heightInput.getText().toString(),massInput.getText().toString());
                result.setScale(2);
                resultView.setText("El resultado es:"+result.toString());
            }
        });
    }
}
