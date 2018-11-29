package com.mydoublej.recylerview_1129;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    ArrayList<ItemData> arrayList;

    public MyAdapter(ArrayList<ItemData> arrayList) {
        this.arrayList = arrayList;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
            TextView mname;
            TextView mnum;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mname=itemView.findViewById(R.id.textName);
            mnum=itemView.findViewById(R.id.textNumber);
        }
    }



    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itemview, viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        MyViewHolder myViewHolder=(MyViewHolder) viewHolder;
        myViewHolder.mname.setText(arrayList.get(i).getName());
        myViewHolder.mnum.setText(arrayList.get(i).getNum());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
