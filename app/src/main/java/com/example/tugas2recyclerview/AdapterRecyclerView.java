package com.example.tugas2recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

    ArrayList<itemModel> dataItem;

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textJudul;
        TextView textTahun;
        ImageView posterMusik;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textJudul = itemView.findViewById(R.id.text_judul);
            textTahun = itemView.findViewById(R.id.text_tahun);
            posterMusik = itemView.findViewById(R.id.image_poster);
        }
    }

    AdapterRecyclerView(ArrayList<itemModel> data) {
        this.dataItem = data;
    }

    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolder holder, int position) {

        TextView text_judul = holder.textJudul;
        TextView text_tahun = holder.textTahun;
        ImageView image_poster = holder.posterMusik;

        text_judul.setText(dataItem.get(position).getName());
        text_tahun.setText(dataItem.get(position).getYear());
        image_poster.setImageResource(dataItem.get(position).getPoster());


    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }


}
