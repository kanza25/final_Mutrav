package com.example.kanza_yahya.testarham;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
TextView tvperson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent= getIntent();
        Person person = (Person)intent.getSerializableExtra("person");
        tvperson =(TextView)findViewById(R.id.tv_person);
        tvperson.setText(person.toString());

    }
}
