package com.example.kanza_yahya.testarham;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Details_rideActivity extends AppCompatActivity {
    TextView tvtype,tvphon,tvcnum,tvvname,tvseat,tvgen,tvdes,tvdatetime,textViewfare,tvsource,tvrname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_ride);
        tvtype = (TextView)findViewById(R.id.tvtype);
        tvphon = (TextView)findViewById(R.id.tvphon);
        tvseat = (TextView)findViewById(R.id.tvseat);
        tvcnum = (TextView)findViewById(R.id.tvcnum);
        tvvname = (TextView)findViewById(R.id.tvvname);
        tvgen = (TextView)findViewById(R.id.tvgen);
        tvdes = (TextView)findViewById(R.id.tvdes);
        tvrname = (TextView)findViewById(R.id.tvrname);
        tvsource = (TextView)findViewById(R.id.tvsource);
        tvdatetime = (TextView)findViewById(R.id.tvdatetime);
        textViewfare = (TextView)findViewById(R.id.textViewfare);
        Intent i = this.getIntent();

        String tv1=i.getStringExtra("type");
        String tv2=i.getStringExtra("phone");
        String tv4=i.getStringExtra("cnum");
        String tv5=i.getStringExtra("vname");
        String tv6=i.getStringExtra("seat");
        String tv7=i.getStringExtra("gen");
        String tv8=i.getStringExtra("des");
        String tv9=i.getStringExtra("fare");
        String tv10=i.getStringExtra("datetime");
        String tv12=i.getStringExtra("source");
        String tv13=i.getStringExtra("rname");




        tvtype.setText(tv1);
        tvphon.setText(tv2);
        tvcnum.setText(tv4);
        tvvname.setText(tv5);
        tvseat.setText(tv6);
        tvgen.setText(tv7);
        tvdes.setText(tv8);
        tvsource.setText(tv12);
        tvrname.setText(tv13);
        tvdatetime.setText(tv10);
        textViewfare.setText(tv9);



}}