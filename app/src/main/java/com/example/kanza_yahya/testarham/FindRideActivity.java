package com.example.kanza_yahya.testarham;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;
import com.example.kanza_yahya.testarham.R;
import static android.app.PendingIntent.getActivity;

public class FindRideActivity extends AppCompatActivity {
    public RecyclerView findride;
    private RecyclerView.LayoutManager mLayoutManager;
    private FirebaseRecyclerAdapter mAdapter;
    DatabaseReference dbReference;
    TextView textViewsrc;
    String tvtype,tvphon,tvname,tvcnum,tvvname,tvseat,tvgen,textViewdes,textViewdatetime,textViewfare;


    CardView ridecardview;

    ProgressDialog progressDialog;

    List<FRide> list = new ArrayList<>();

    AdapterView recyclerView;

    // RecyclerView.Adapter adapter;
    //MyAdapter adapter;

   /* private DatabaseReference mRef;
    private FirebaseDatabase mDb;
    private List<String> keys = new ArrayList<>();
    private FindRideAdapter adapter;*/
   String abc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_ride);
        dbReference = FirebaseDatabase.getInstance().getReference().child("rides");
        dbReference.keepSynced(true);

        findride = (RecyclerView) findViewById(R.id.test);
        findride.setHasFixedSize(true);
        findride.setLayoutManager(new LinearLayoutManager(this));

        textViewsrc =findViewById(R.id.textViewsrc);
        /*textViewsrc.setSelected(true);*/
        ridecardview = (CardView) findViewById(R.id.ridecardview);


    }


    @Override
    protected void onStart() {
        super.onStart();


        FirebaseRecyclerAdapter<FRide,FindRideViewHolder> friendsRecyclerViewAdapter = new FirebaseRecyclerAdapter<FRide,FindRideViewHolder>(

                FRide.class, R.layout.findride, FindRideViewHolder.class, dbReference


        ) {
            @Override
            protected void populateViewHolder(FindRideViewHolder ViewHolder, FRide model, int position) {

                ViewHolder.setsource(model.getRiderSource());
                ViewHolder.setdestination(model.getRiderDestination());
                ViewHolder.setfare(model.getDateTime());
                ViewHolder.setdatetime(model.getRiderFare());
                ViewHolder.setrnam(model.getRiderName());
                ViewHolder.setcType(model.getCarType());
                ViewHolder.setPhone(model.getRiderPhone());
                ViewHolder.setCnum(model.getCarNum());
                ViewHolder.setVnam(model.getCarName());
                ViewHolder.setSeat(model.getRiderSeats());
                ViewHolder.setgender(model.getRiderGender());



            }
        };

        findride.setAdapter(friendsRecyclerViewAdapter);

    }

    public static class FindRideViewHolder extends RecyclerView.ViewHolder{


        View mview;
        public FindRideViewHolder(final View itemview)
        {
            super(itemview);
            mview=itemview;


            TextView tvtype  = (TextView)mview.findViewById(R.id.tvtype);
            final String texttype = tvtype.getText().toString();
            TextView tvphon  =mview.findViewById(R.id.tvphon);
            final String textphone = tvphon.getText().toString();
            TextView tvname  =mview.findViewById(R.id.tvname);
            final String textname = tvname.getText().toString();
            TextView tvcnum  =mview.findViewById(R.id.tvcnum);
            final String textcnum = tvcnum.getText().toString();
            TextView tvvname  =mview.findViewById(R.id.tvvname);
            final String textvname = tvvname.getText().toString();
            TextView tvseat  =mview.findViewById(R.id.tvseat);
            final String textseat = tvseat.getText().toString();
            TextView tvgen  =mview.findViewById(R.id.tvgen);
            final String textgen = tvgen.getText().toString();
            TextView tvdes  =mview.findViewById(R.id.textViewdes);
            final String textdes = tvdes.getText().toString();
            TextView tvfare  =mview.findViewById(R.id.textViewfare);
            final String textfare = tvfare.getText().toString();
            TextView tvsrc  =mview.findViewById(R.id.textViewsrc);
            final String textsrc = tvsrc.getText().toString();
            TextView tvdatetime  =mview.findViewById(R.id.textViewdatetime);
            final String textdatetime = tvdatetime.getText().toString();
            mview.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                   /* itemview.getContext().startActivity(new Intent(itemview.getContext(),Details_rideActivity.class));*/
/*
                    Intent intent = new Intent(itemview.getContext(),FindRideActivity.class); itemview.getContext().startActivity(intent);
*/
                    Intent myIntent= new Intent(itemview.getContext(),Details_rideActivity.class);
                    myIntent.putExtra("type",texttype);
                    myIntent.putExtra("phone",textphone);
                    myIntent.putExtra("name",textname);
                    myIntent.putExtra("cnum",textcnum);
                    myIntent.putExtra("vname",textvname);
                    myIntent.putExtra("seat",textseat);
                    myIntent.putExtra("gen",textgen);
                    myIntent.putExtra("rname",textname);
                    myIntent.putExtra("des",textdes);
                    myIntent.putExtra("fare",textfare);
                    myIntent.putExtra("source",textsrc);
                    myIntent.putExtra("datetime",textdatetime);
                    itemview.getContext().startActivity(myIntent);

                }
            });

        }


        public void setsource(String source){

            TextView sourcetext=  (TextView) mview.findViewById(R.id.textViewsrc);
            sourcetext.setText(source);

        }
        public void setdestination(String des){

            TextView destext=  (TextView) mview.findViewById(R.id.textViewdes);
            destext.setText(des);

        }

        public void setfare(String dateandtime){

            TextView dttext=  (TextView) mview.findViewById(R.id.textViewdatetime);
            dttext.setText(dateandtime);

        }
        public void setdatetime(String fare){

            TextView faretext=  (TextView) mview.findViewById(R.id.textViewfare);
            faretext.setText(fare);

        }
        public void setcType(String ctype){

            TextView typetext=  (TextView) mview.findViewById(R.id.tvtype);
            typetext.setText(ctype);

        }
        public void setPhone(String phone){

            TextView phtext=  (TextView) mview.findViewById(R.id.tvphon);
            phtext.setText(phone);

        }
        public void setCnum(String cnum){

            TextView cnumtext=  (TextView) mview.findViewById(R.id.tvcnum);
            cnumtext.setText(cnum);

        }
        public void setVnam(String vnam){

            TextView vnamtext=  (TextView) mview.findViewById(R.id.tvvname);
            vnamtext.setText(vnam);

        }
        public void setSeat(String seat){

            TextView seattext=  (TextView) mview.findViewById(R.id.tvseat);
           seattext.setText(seat);

        }
        public void setgender(String gen){

            TextView gentext=  (TextView) mview.findViewById(R.id.tvgen);
            gentext.setText(gen);

        }
        public void setrnam(String rnam){

            TextView rnamtext=  (TextView) mview.findViewById(R.id.tvname);
            rnamtext.setText(rnam);

        }


    }
 /*   public void buildRecyclerView() {
        findride = findViewById(R.id.test);
        findride.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new FirebaseRecyclerAdapter(FRide) {
            @Override
            protected void populateViewHolder(RecyclerView.ViewHolder viewHolder, Object model, int position) {

            }
        };*/

   /*     findride.setLayoutManager(mLayoutManager);
        findride.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new FirebaseRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(FindRideActivity.this, Details_rideActivity.class);
                intent.putExtra("Example Item", mExampleList.get(position));

                startActivity(intent);
            }
        });*/
    }

