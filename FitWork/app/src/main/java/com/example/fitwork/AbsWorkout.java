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
 * Use the {@link AbsWorkout#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AbsWorkout extends Fragment {
    Button astep1;
    Button astep2;
    Button astep3;
    Button astep4;
    Button astep5;
    Button astep6;

    ImageButton bstep1;
    ImageButton bstep2;
    ImageButton bstep3;
    ImageButton bstep4;
    ImageButton bstep5;
    ImageButton bstep6;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AbsWorkout() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AbsWorkout.
     */
    // TODO: Rename and change types and number of parameters
    public static AbsWorkout newInstance(String param1, String param2) {
        AbsWorkout fragment = new AbsWorkout();
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
        View v = inflater.inflate(R.layout.fragment_abs_workout, container, false);

        astep1 = v.findViewById(R.id.btnstep1);
        astep1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),AbsStep1.class));
            }
        });

        astep2 = v.findViewById(R.id.btnstep2);
        astep2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),AbsStep2.class));
            }
        });

        astep3 = v.findViewById(R.id.btnstep3);
        astep3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),AbsStep3.class));
            }
        });

        astep4 = v.findViewById(R.id.btnstep4);
        astep4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),AbsStep4.class));
            }
        });

        astep5 = v.findViewById(R.id.btnstep5);
        astep5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),AbsStep5.class));
            }
        });

        astep6 = v.findViewById(R.id.btnstep6);
        astep6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),AbsStep6.class));
            }
        });


        //imagebutton

        bstep1 = v.findViewById(R.id.ib1);
        bstep1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),AbsStep1.class));
            }
        });

        bstep2 = v.findViewById(R.id.ib2);
        bstep2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),AbsStep2.class));
            }
        });

        bstep3 = v.findViewById(R.id.ib3);
        bstep3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),AbsStep3.class));
            }
        });

        bstep4 = v.findViewById(R.id.ib4);
        bstep4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),AbsStep4.class));
            }
        });

        bstep5 = v.findViewById(R.id.imageView14);
        bstep5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),AbsStep5.class));
            }
        });

        bstep6 = v.findViewById(R.id.imageView3);
        bstep6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),AbsStep6.class));
            }
        });








        return  v;
    }
}
