package com.henrique.ediimusic.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.henrique.ediimusic.R;
import com.henrique.ediimusic.model.MusicList;

import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MyViewHolder> {

    private final Context context;
    private final List<MusicList> list;

    public MusicAdapter(Context context, List<MusicList> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MusicAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.music_adapter_layout, null));
    }

    @Override
    public void onBindViewHolder(@NonNull MusicAdapter.MyViewHolder holder, int position) {
        MusicList list2 = list.get(position);

        if(list2.isPlaying()){
            holder.rootLayout.setBackgroundResource(R.drawable.round_banck_blue_10);
        }else{
            holder.rootLayout.setBackgroundResource(R.drawable.round_back_10);
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    static class MyViewHolder extends RecyclerView.ViewHolder {

        private final RelativeLayout rootLayout;
        private final TextView title;
        private final TextView arList;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            rootLayout = itemView.findViewById(R.id.rootLayout);
            title = itemView.findViewById(R.id.musicTitle);
            arList = itemView.findViewById(R.id.musicArList);



        }
    }

}
