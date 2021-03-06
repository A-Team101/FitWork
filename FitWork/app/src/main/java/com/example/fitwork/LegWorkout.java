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
 * Use the {@link LegWorkout#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LegWorkout extends Fragment {
    Button lstep1;
    Button lstep2;
    Button lstep3;
    Button lstep4;
    Button lstep5;
    Button lstep6;

    ImageButton lwstep1;
    ImageButton lwstep2;
    ImageButton lwstep3;
    ImageButton lwstep4;
    ImageButton lwstep5;
    ImageButton lwstep6;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LegWorkout() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LegWorkout.
     */
    // TODO: Rename and change types and number of parameters
    public static LegWorkout newInstance(String param1, String param2) {
        LegWorkout fragment = new LegWorkout();
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
        View v = inflater.inflate(R.layout.fragment_leg_workout, container, false);

        lstep2 = v.findViewById(R.id.btnleg2);
        lstep2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),LegStep2.class));
            }
        });

        lstep3 = v.findViewById(R.id.btnleg3);
        lstep3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),LegStep3.class));
            }
        });

        lstep4 = v.findViewById(R.id.btnleg4);
        lstep4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),LegStep4.class));
            }
        });

        lstep5 = v.findViewById(R.id.btnleg5);
        lstep5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),LegStep5.class));
            }
        });

        lstep1 = v.findViewById(R.id.btnleg1);
        lstep1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),LegStep1.class));
            }
        });

        lstep6 = v.findViewById(R.id.btnleg6);
        lstep6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),LegStep6.class));
            }
        });



        //imagebutton

        lwstep1 = v.findViewById(R.id.lib1);
        lwstep1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),LegStep1.class));
            }
        });

        lwstep2 = v.findViewById(R.id.lib2);
        lwstep2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),LegStep2.class));
            }
        });

        lwstep3 = v.findViewById(R.id.lib3);
        lwstep3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),LegStep3.class));
            }
        });

        lwstep4 = v.findViewById(R.id.lib4);
        lwstep4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),LegStep4.class));
            }
        });

        lwstep5 = v.findViewById(R.id.lib5);
        lwstep5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),LegStep5.class));
            }
        });

        lwstep6 = v.findViewById(R.id.lib6);
        lwstep6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),LegStep6.class));
            }
        });



        return  v;
    }
}