package com.example.kanza_yahya.testarham;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class cardview extends AppCompatActivity {

    CardView cardView;
    TextView txt_name,txt_age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview);
        cardView =(CardView)findViewById(R.id.ridecardview);
        txt_name =(TextView)findViewById(R.id.tv_name);
        txt_age =(TextView)findViewById(R.id.tv_age);
    /*    cardview.addOnTouchlistener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),cardview.class); v.getContext().startActivity(intent);
               *//* Intent intent = new Intent(cardview.this, secondActivity.class);*//*
                Person person = new Person();
                person.setName(txt_name.getText().toString());
                person.setAge(Integer.parseInt(txt_age.getText().toString()));
                intent.putExtra("person",person);
                startActivity(intent);

            }
        });*/

    }

}
