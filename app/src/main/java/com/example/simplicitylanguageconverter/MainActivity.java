package com.example.simplicitylanguageconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView showtxt;
    EditText inputs;
    Button btn;

    public static String converts(String strs){
        String a[] = {
                "@", ";", "'", "$", "3", "_","&",
                "-", "8", "+", "(", ")", "?", "!",
                "9", "0", "1", "4", "#", "5", "7",
                ":", "2", String.valueOf('"'), "6", "*", "•", "~",
                "`", "|", "¥", "√", "π", "÷", "×",
                "¶", "∆"
        };
        String b[] = {
                "A", "B", "C", "D", "E", "F", "G",
                "H", "I", "J", "K", "L", "M", "N",
                "O", "P", "Q", "R", "S", "T", "U",
                "V", "W", "X", "Y", "Z", " ", "1",
                "2", "3", "4", "5", "6", "7", "8",
                "9", "0"
        };
        String st = "";

        String arrs[] = strs.split("");

        for (int x=0; x< arrs.length; x++){
            for (int i=0; i<b.length; i++){
                if (arrs[x].toUpperCase().equals(b[i])){
                    st += a[i];
                    break;
                }
            }
        }

        return st;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputs = (EditText) findViewById(R.id.userinput);
        showtxt = (TextView) findViewById(R.id.output);
        btn = (Button) findViewById(R.id.bttn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showtxt.setText(converts(inputs.getText().toString()));
            }
        });
    }
}
