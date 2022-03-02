package com.vku.lab2.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.vku.lab2.Model.Singer;
import com.vku.lab2.R;

import java.util.ArrayList;
import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {

    Context context;
    ArrayList<Singer> singers;

    public SongAdapter(Context context, ArrayList<Singer> singers) {
        this.context = context;
        this.singers = singers;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View singerView = inflater.inflate(R.layout.item_song, parent, false);
        ViewHolder viewHolder = new ViewHolder(singerView);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tvSinger.setText(singers.get(position).getSinger().toString());
        holder.tvName.setText(singers.get(position).getName().toString());
        String url = singers.get(position).getImage().toString();
        Glide.with(context).load(url).into(holder.imgImageSong);

    }


    @Override
    public int getItemCount() {
        return  singers.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private  TextView tvName, tvSinger;
        private  ImageView imgImageSong;

        public ViewHolder(View view) {
            super(view);
            // Define click listener for the ViewHolder's View
           tvName = (TextView) view.findViewById(R.id.tvName);
           tvSinger = (TextView) view.findViewById(R.id.tvSinger);
           imgImageSong = (ImageView) view.findViewById(R.id.imgImageSong);
        }


    }
}
