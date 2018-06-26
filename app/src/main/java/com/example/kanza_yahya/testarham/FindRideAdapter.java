package com.example.kanza_yahya.testarham;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class FindRideAdapter  {

   /* List<findRideGetSet> list;
    Context context;

    public FindRideAdapter(List<findRideGetSet> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public FindRideholder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.findride,parent,false);
        FindRideholder myHoder = new FindRideholder(view);


        return myHoder;
    }

    @Override
    public void onBindViewHolder(FindRideholder holder, int position) {
        FRide mylist = list.get(position);
        holder.cnic.setText(mylist.getCnic());
        holder.carno.setText(mylist.getCarNumber());
        holder.des.setText(mylist.getDestination());
        holder.Faree.setText(mylist.getFare());


    }

    @Override
    public int getItemCount() {

        int arr = 0;

        try{
            if(list.size()==0){

                arr = 0;

            }
            else{

                arr=list.size();
            }



        }catch (Exception e){



        }

        return arr;

    }




    class FindRideholder extends RecyclerView.ViewHolder{
        TextView cnic,carno,des,Faree;


        public FindRideholder(View itemView) {
            super(itemView);
            cnic = (TextView) itemView.findViewById(R.id.textViewcnic);
            carno= (TextView) itemView.findViewById(R.id.textViewcarno);
            des= (TextView) itemView.findViewById(R.id.textViewdes);
            Faree=(TextView) itemView.findViewById(R.id.textViewfare);
        }
    }*/
}
