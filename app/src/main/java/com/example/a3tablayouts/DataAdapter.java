package com.example.a3tablayouts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    Context context;
    private ArrayList<AndroidVersion> android;


    public DataAdapter(Context context,ArrayList<AndroidVersion> android){
        this.context = context;
        this.android = android;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.androidtv.setText(android.get(position).getAndroid_version_name());
        holder.img_android.setImageResource(android.get(position).getAndroid_image_url());

    }

    @Override
    public int getItemCount() {
        return android.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView androidtv;
        public ImageView img_android;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            androidtv = (TextView) itemView.findViewById(R.id.tv_android);
            img_android = (ImageView) itemView.findViewById(R.id.img_android);
        }
    }
}
