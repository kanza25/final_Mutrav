package com.example.kanza_yahya.testarham.Modules;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.kanza_yahya.testarham.R;


public class marquee extends AppCompatActivity {
    TextView textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marquee);

        textView5 =findViewById(R.id.textView5);
        textView5.setSelected(true);
    }
}
