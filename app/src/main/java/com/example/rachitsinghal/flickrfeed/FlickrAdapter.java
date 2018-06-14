package com.example.rachitsinghal.flickrfeed;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class FlickrAdapter extends RecyclerView.Adapter<FlickrAdapter.ViewHolder> {

    private String[] data;
    public FlickrAdapter(String[] data){
        this.data=data;
    }
    @Override
    public FlickrAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.list_item, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FlickrAdapter.ViewHolder holder, int position) {
        Picasso.get().load("https://www.flickr.com/photos/12037949754@N01/155761353/").into(FlickrAdapter.ViewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return data.length;//data.length
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public static ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView= itemView.findViewById(R.id.imageView2);

        }
    }
}
