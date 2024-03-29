package com.benchadwick.lightlinefishingco.knot_tool;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.Navigation;

import com.benchadwick.lightlinefishingco.R;

import java.util.ArrayList;

public class CustomListViewAdapter extends ArrayAdapter<Knot> {

    public CustomListViewAdapter(@NonNull Context context, ArrayList<Knot> knots) {
        super(context, 0, knots);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Knot knot = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_view, parent, false);
            ImageView imageView = convertView.findViewById(R.id.knot_icon);
            imageView.setImageResource(knot.getImageId());
        }

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("KNOT", knot.getName());
                Navigation.findNavController(v).navigate(R.id.action_knotToolNavigationFragment_to_knotToolViewPager, bundle);
            }
        });
        return convertView;
    }
}
