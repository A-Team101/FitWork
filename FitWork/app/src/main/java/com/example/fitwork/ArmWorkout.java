package com.example.fitwork;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ArmWorkout#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ArmWorkout extends Fragment {
    Button acstep1;
    Button acstep2;
    Button acstep3;
    Button acstep4;
    Button acstep5;
    Button acstep6;

    ImageButton astep1;
    ImageButton astep2;
    ImageButton astep3;
    ImageButton astep4;
    ImageButton astep5;
    ImageButton astep6;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ArmWorkout() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ArmWorkout.
     */
    // TODO: Rename and change types and number of parameters
    public static ArmWorkout newInstance(String param1, String param2) {
        ArmWorkout fragment = new ArmWorkout();
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
        View v = inflater.inflate(R.layout.fragment_arm_workout, container, false);

        acstep6 = v.findViewById(R.id.btnastep6);
        acstep6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ArmStep6.class));
            }
        });

        acstep5 = v.findViewById(R.id.btnastep5);
        acstep5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ArmStep5.class));
            }
        });

        acstep4 = v.findViewById(R.id.btnastep4);
        acstep4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ArmStep4.class));
            }
        });

        acstep3 = v.findViewById(R.id.btnastep3);
        acstep3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ArmStep3.class));
            }
        });

        acstep2 = v.findViewById(R.id.btnastep2);
        acstep2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ArmStep2.class));
            }
        });

        acstep1 = v.findViewById(R.id.btnastep1);
        acstep1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ArmStep1.class));
            }
        });



        //imagebutton

        astep1 = v.findViewById(R.id.iba1);
        astep1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ArmStep1.class));
            }
        });

        astep2 = v.findViewById(R.id.iba2);
        astep2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ArmStep2.class));
            }
        });

        astep3 = v.findViewById(R.id.iba3);
        astep3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ArmStep3.class));
            }
        });

        astep4 = v.findViewById(R.id.iba4);
        astep4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ArmStep4.class));
            }
        });

        astep5 = v.findViewById(R.id.iba5);
        astep5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ArmStep5.class));
            }
        });

        astep6 = v.findViewById(R.id.iba6);
        astep6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),ArmStep6.class));
            }
        });



        return  v;
    }
}