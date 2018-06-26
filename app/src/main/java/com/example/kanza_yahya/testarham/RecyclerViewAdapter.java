package com.example.kanza_yahya.testarham;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    Context context;
    List<FRide> MainList;

    public RecyclerViewAdapter(Context context, List<FRide> TempList) {

        this.MainList = TempList;

        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.findride, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        FRide studentDetails = MainList.get(position);

        holder.Ridersource.setText(studentDetails.getRiderSource());
        holder.Riderdes.setText(studentDetails.getRiderDestination());
        holder.Riderdatetime.setText(studentDetails.getDateTime());
        holder.Riderfare.setText(studentDetails.getRiderFare());

        holder.Ridername.setText(studentDetails.getRiderName());
        holder.Vehtype.setText(studentDetails.getCarType());
        holder.Riderphone.setText(studentDetails.getRiderPhone());
        holder.Ridercnum.setText(studentDetails.getCarNum());

        holder.Vehname.setText(studentDetails.getCarName());
        holder.Riderseats.setText(studentDetails.getRiderSeats());
        holder.Ridergen.setText(studentDetails.getRiderGender());

    }

    @Override
    public int getItemCount() {

        return MainList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView Ridersource;
        public TextView Riderdes;
        public TextView Riderdatetime;
        public TextView Riderfare;
        public TextView Vehtype;
        public TextView Riderphone;
        public TextView Ridername;
        public TextView Ridercnum;
        public TextView Vehname;
        public TextView Riderseats;
        public TextView Ridergen;


        public ViewHolder(View itemView) {

            super(itemView);

            Ridersource = (TextView) itemView.findViewById(R.id.textViewsrc);
            Riderdes = (TextView) itemView.findViewById(R.id.textViewdes);
            Riderdatetime = (TextView) itemView.findViewById(R.id.textViewdatetime);
            Riderfare = (TextView) itemView.findViewById(R.id.textViewfare);
            Vehtype  = (TextView)itemView.findViewById(R.id.tvtype);
            Riderphone   =(TextView)itemView.findViewById(R.id.tvphon);
            Ridername   =(TextView)itemView.findViewById(R.id.tvname);
            Ridercnum   =(TextView)itemView.findViewById(R.id.tvcnum);
            Vehname   =(TextView)itemView.findViewById(R.id.tvvname);
            Riderseats   =(TextView)itemView.findViewById(R.id.tvseat);
            Ridergen  =(TextView)itemView.findViewById(R.id.tvgen);


        }

}

}
