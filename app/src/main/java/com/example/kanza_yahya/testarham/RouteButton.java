package com.example.kanza_yahya.testarham;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RouteButton extends AppCompatActivity {
    Button button;
    EditText editText1, editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_button);

        button = (Button)findViewById(R.id.route_direction);
        editText1 = (EditText)findViewById(R.id.edit_text1);
        editText2 = (EditText)findViewById(R.id.edit_text2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Bundle bn = getIntent().getExtras();
        if (bn != null) {
            String name1 = bn.getString("snameKey2");
            editText1.setText(String.valueOf(name1));

            String name2 = bn.getString("dnameKey2");
            editText2.setText(String.valueOf(name2));

        }
    }
}
