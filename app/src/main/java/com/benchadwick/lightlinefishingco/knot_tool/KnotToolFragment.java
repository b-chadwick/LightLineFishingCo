package com.benchadwick.lightlinefishingco.knot_tool;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.benchadwick.lightlinefishingco.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link KnotToolFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class KnotToolFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private int mParam2;

    public KnotToolFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment KnotToolFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static KnotToolFragment newInstance(String param1, int param2) {
        KnotToolFragment fragment = new KnotToolFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putInt(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getInt(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_knot_tool, container, false);
        if (mParam1 != null){
            TextView instruction = view.findViewById(R.id.knot_instruction);
            instruction.setText(mParam1);
            ImageView image = view.findViewById(R.id.knot_image);
            image.setImageResource(mParam2);
        }
        return view;
    }
}