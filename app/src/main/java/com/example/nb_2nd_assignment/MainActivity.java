package com.example.nb_2nd_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int x=0;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.txtPoint);
    }

    public void btnPlus(View view)
    {
        x++;
        String st=getString(R.string.textOnTextBox);
        tv.setText(st+" "+x);
    }
}