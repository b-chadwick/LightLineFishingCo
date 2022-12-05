package com.benchadwick.lightlinefishingco.catch_of_the_day;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.benchadwick.lightlinefishingco.R;
import com.benchadwick.lightlinefishingco.pojo.Fish;

import java.util.ArrayList;

public class FishRecyclerViewAdapter extends RecyclerView.Adapter<FishRecyclerViewAdapter.CustomViewHolder> {

    ArrayList<Fish> fishPosts;

    public FishRecyclerViewAdapter(ArrayList<Fish> fishPosts){this.fishPosts = fishPosts;}

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycle_row, null);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        Fish fish = fishPosts.get(position);
        String species = "Species: "+ fish.getSpecies();
        String description = "Caught by: "+ fish.getAnglerName() + " - " + fish.getDateSubmitted();
        holder.species.setText(species);
        holder.description.setText(description);
        holder.image.setImageResource(fish.getImageId());
    }

    @Override
    public int getItemCount() {return fishPosts.size();}
    class CustomViewHolder extends RecyclerView.ViewHolder{
        protected TextView species;
        protected TextView description;
        protected ImageView image;

        public CustomViewHolder(View view){
            super(view);
            this.species = view.findViewById(R.id.recycle_title);
            this.description = view.findViewById(R.id.recycle_description);
            this.image = view.findViewById(R.id.recycle_image);
        }
    }
}
