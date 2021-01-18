package com.example.fitwork;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ShoulderWorkout#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ShoulderWorkout extends Fragment {
    Button sstep1;
    Button sstep2;
    Button sstep3;
    Button sstep4;
    Button sstep5;
    Button sstep6;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ShoulderWorkout() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ShoulderWorkout.
     */
    // TODO: Rename and change types and number of parameters
    public static ShoulderWorkout newInstance(String param1, String param2) {
        ShoulderWorkout fragment = new ShoulderWorkout();
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
        View v = inflater.inflate(R.layout.fragment_shoulder_workout, container, false);

        sstep5 = v.findViewById(R.id.btnshoulder5);
        sstep5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ShoulderStep5.class));
            }
        });

        sstep6 = v.findViewById(R.id.btnshoulder6);
        sstep6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ShoulderStep6.class));
            }
        });


        sstep4 = v.findViewById(R.id.btnshoulder4);
        sstep4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ShoulderStep4.class));
            }
        });

        sstep3 = v.findViewById(R.id.btnshoulder3);
        sstep3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ShoulderStep3.class));
            }
        });

        sstep2 = v.findViewById(R.id.btnshoulder2);
        sstep2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ShoulderStep2.class));
            }
        });

        sstep1 = v.findViewById(R.id.btnshoulder1);
        sstep1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ShoulderStep1.class));

            }
        });



        return  v;

    }
}