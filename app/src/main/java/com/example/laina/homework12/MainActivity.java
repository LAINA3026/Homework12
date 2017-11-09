package com.example.laina.homework12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView resultTV;
    private EditText word1ET;
    private EditText word2ET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.resultTV = (TextView) this.findViewById(R.id.result);
        this.word1ET = (EditText) this.findViewById(R.id.editText1);
        this.word2ET = (EditText) this.findViewById(R.id.editText2);
    }
    public void reverseButtonPressed(View v)
    {
        String reverseWord1 = "";
        String reverseWord2 = "";

        for (int i = this.word1ET.getText().toString().length() - 1; i >= 0; i--)
        {
            reverseWord1 = reverseWord1 + word1ET.charAt(i);

        }

        for (int i = this.word2ET.getText().toString().length() - 1; i >= 0; i--)
        {
            reverseWord2 = reverseWord2 + word2ET.charAt(i);

        }

        resultTV.setText(reverseWord1 + reverseWord2);



    }
}
