package com.example.kanza_yahya.testarham;
/**
 * Created by KaNza_Yahya on 23/02/2018.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityEdit_profile extends AppCompatActivity {
    Button btn_back, btn_update;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        btn_back=(Button)findViewById(R.id.btn_back);
        btn_update=(Button)findViewById(R.id.btn_update);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityEdit_profile.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
}

