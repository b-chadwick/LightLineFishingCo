package com.benchadwick.lightlinefishingco.knot_tool;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.benchadwick.lightlinefishingco.R;

import java.util.ArrayList;

public class CustomViewPageAdapter extends FragmentStateAdapter {
    ArrayList<String> knotInstructions = new ArrayList<>();
    ArrayList<Integer> knotImages = new ArrayList<>();

    public CustomViewPageAdapter(@NonNull FragmentActivity fragmentActivity, String knot, Context context) {
        super(fragmentActivity);

        switch(knot){
            case "Improved Clinch Knot":
               knotImages.add(R.drawable.clinch1);
               knotImages.add(R.drawable.clinch2);
               knotImages.add(R.drawable.clinch3);
               knotImages.add(R.drawable.clinch4);
               knotImages.add(R.drawable.clinch5);
               knotInstructions.add(context.getString(R.string.clinch1));
               knotInstructions.add(context.getString(R.string.clinch2));
               knotInstructions.add(context.getString(R.string.clinch3));
               knotInstructions.add(context.getString(R.string.clinch4));
               knotInstructions.add(context.getString(R.string.clinch5));
            break;
            case "Palomar Knot":
                knotImages.add(R.drawable.palomar1);
                knotImages.add(R.drawable.palomar2);
                knotImages.add(R.drawable.palomar3);
                knotImages.add(R.drawable.palomar4);
                knotImages.add(R.drawable.palomar5);
                knotImages.add(R.drawable.palomar6);
                knotImages.add(R.drawable.palomar7);
                knotInstructions.add(context.getString(R.string.palomar1));
                knotInstructions.add(context.getString(R.string.palomar2));
                knotInstructions.add(context.getString(R.string.palomar3));
                knotInstructions.add(context.getString(R.string.palomar4));
                knotInstructions.add(context.getString(R.string.palomar5));
                knotInstructions.add(context.getString(R.string.palomar6));
                knotInstructions.add(context.getString(R.string.palomar7));
            break;
            case "Rapala Knot":
                knotImages.add(R.drawable.rapala1);
                knotImages.add(R.drawable.rapala2);
                knotImages.add(R.drawable.rapala3);
                knotImages.add(R.drawable.rapala4);
                knotImages.add(R.drawable.rapala5);
                knotImages.add(R.drawable.rapala6);
                knotInstructions.add(context.getString(R.string.rapala1));
                knotInstructions.add(context.getString(R.string.rapala2));
                knotInstructions.add(context.getString(R.string.rapala3));
                knotInstructions.add(context.getString(R.string.rapala4));
                knotInstructions.add(context.getString(R.string.rapala5));
                knotInstructions.add(context.getString(R.string.rapala6));
            break;
            case "Snell Knot":
                knotImages.add(R.drawable.snell1);
                knotImages.add(R.drawable.snell2);
                knotImages.add(R.drawable.snell3);
                knotImages.add(R.drawable.snell4);
                knotImages.add(R.drawable.snell5);
                knotImages.add(R.drawable.snell6);
                knotImages.add(R.drawable.snell7);
                knotInstructions.add(context.getString(R.string.snell1));
                knotInstructions.add(context.getString(R.string.snell2));
                knotInstructions.add(context.getString(R.string.snell3));
                knotInstructions.add(context.getString(R.string.snell4));
                knotInstructions.add(context.getString(R.string.snell5));
                knotInstructions.add(context.getString(R.string.snell6));
                knotInstructions.add(context.getString(R.string.snell7));
            break;
            case "Uni Knot":
                knotImages.add(R.drawable.uni1);
                knotImages.add(R.drawable.uni2);
                knotImages.add(R.drawable.uni3);
                knotImages.add(R.drawable.uni4);
                knotImages.add(R.drawable.uni5);
                knotImages.add(R.drawable.uni6);
                knotInstructions.add(context.getString(R.string.uni1));
                knotInstructions.add(context.getString(R.string.uni2));
                knotInstructions.add(context.getString(R.string.uni3));
                knotInstructions.add(context.getString(R.string.uni4));
                knotInstructions.add(context.getString(R.string.uni5));
                knotInstructions.add(context.getString(R.string.uni6));
            break;
        }
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return KnotToolFragment.newInstance(knotInstructions.get(0), knotImages.get(0));
            case 1: return KnotToolFragment.newInstance(knotInstructions.get(1), knotImages.get(1));
            case 2: return KnotToolFragment.newInstance(knotInstructions.get(2), knotImages.get(2));
            case 3: return KnotToolFragment.newInstance(knotInstructions.get(3), knotImages.get(3));
            case 4: return KnotToolFragment.newInstance(knotInstructions.get(4), knotImages.get(4));
            case 5: return KnotToolFragment.newInstance(knotInstructions.get(5), knotImages.get(5));
            case 6: return KnotToolFragment.newInstance(knotInstructions.get(6), knotImages.get(6));
            default: return KnotToolFragment.newInstance("Error", R.drawable.clinch1);
        }
    }

    @Override
    public int getItemCount() {
        return knotInstructions.size();
    }
}
