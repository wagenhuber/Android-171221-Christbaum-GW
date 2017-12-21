package com.example.wagenhuberg.android_171221_christbaum;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private int inputValueHigh;
    private Button btn_zeichnen;
    private EditText et_inputText;
    private TextView et_outputText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_zeichnen = findViewById(R.id.btn_zeichnen);
        et_inputText = findViewById(R.id.et_inputText);
        et_outputText = findViewById(R.id.et_outputText);



        btn_zeichnen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                inputValueHigh = Integer.parseInt(et_inputText.getText().toString());
                //et_outputText.setText(String.valueOf(inputValueHigh));
                StringBuilder stringBuilder = new StringBuilder();

                for (int zeile = 1; zeile <= inputValueHigh; zeile++) {
                    for (int sterne = 1; sterne <= zeile; sterne++) {
                        stringBuilder.append("*");
                    }
                    //Codierung für neue Zeile sind auf allen OS verschieden - mittels format %n kann platform unabhängig programmiert werden!
                    stringBuilder.append(String.format("%n"));
                }
                et_outputText.setText(stringBuilder.toString());
            }
        });





    }
}
