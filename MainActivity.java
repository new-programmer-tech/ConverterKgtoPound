package com.example.unitconveterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button button;
    private TextView textView;
    private EditText editText;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =findViewById(R.id.button);
        textView =findViewById(R.id.textView2);
        editText =findViewById(R.id.editTextTextPersonName);

//      ----------------  BUTTON CLICK-------------

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
//              Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();
                int input = Integer.parseInt(s);
                double pound = 2.205* input;
                textView.setText("result is " + pound);


            }
        });


    }
}