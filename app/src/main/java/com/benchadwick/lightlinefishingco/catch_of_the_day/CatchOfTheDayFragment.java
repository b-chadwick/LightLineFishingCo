package com.benchadwick.lightlinefishingco.catch_of_the_day;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.benchadwick.lightlinefishingco.R;
import com.benchadwick.lightlinefishingco.pojo.Fish;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CatchOfTheDayFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CatchOfTheDayFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CatchOfTheDayFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CatchOfTheDayFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CatchOfTheDayFragment newInstance(String param1, String param2) {
        CatchOfTheDayFragment fragment = new CatchOfTheDayFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_catch_of_the_day, container, false);
        ArrayList<Fish> fishPosts = new ArrayList<>();
        fishPosts.add(new Fish(R.drawable.bluegill, "Bluegill", "Hank Hill", "Nov 5th 2022"));
        fishPosts.add(new Fish(R.drawable.crappie, "Crappie", "Doug Dimmadome", "Nov 1st 2022"));
        fishPosts.add(new Fish(R.drawable.smallmouth, "Smallmouth Bass", "John Doe", "Oct 28th 2022"));
        fishPosts.add(new Fish(R.drawable.largemouth, "Largemouth Bass", "Jeff Smith", "Oct 26th 2022"));
        fishPosts.add(new Fish(R.drawable.pike, "Northern Pike", "Bob Dylan", "Oct 22nd 2022"));
        fishPosts.add(new Fish(R.drawable.hybrid, "Hybrid Panfish", "George Costanza", "Oct 18th 2022"));
        fishPosts.add(new Fish(R.drawable.perch, "Yellow Perch", "Cozmo Kramer", "Oct 16th 2022"));
        fishPosts.add(new Fish(R.drawable.pumpkinseed, "Pumpkinseed", "Huey Lewis", "Oct 13th 2022"));
        fishPosts.add(new Fish(R.drawable.rockbass, "Rock Bass", "Patrick Bateman", "Oct 11th 2022"));
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new FishRecyclerViewAdapter(fishPosts));
        return view;
    }
}