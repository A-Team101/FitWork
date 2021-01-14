package com.example.fitwork.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.fitwork.AbsWorkout;
import com.example.fitwork.ArmWorkout;
import com.example.fitwork.LegWorkout;
import com.example.fitwork.R;
import com.example.fitwork.ShoulderWorkout;
import com.example.fitwork.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
   /*     homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        ImageButton workabs = root.findViewById(R.id.abswork);

        workabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), AbsStep.class));
            }
        });

        return root;*/
   binding = FragmentHomeBinding.inflate(getLayoutInflater());
   return binding.getRoot();
    }

    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        binding.abswork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment absworkoutfragment = new AbsWorkout();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.nav_host_fragment,absworkoutfragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

                binding.shoulderwork.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Fragment shoulderworkoutfragment = new ShoulderWorkout();
                        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.nav_host_fragment,shoulderworkoutfragment);
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();

                binding.armwork.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Fragment armworkoutfragment = new ArmWorkout();
                        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.nav_host_fragment,armworkoutfragment);
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();

                        binding.legwork.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Fragment legworkoutfragment = new LegWorkout();
                                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                                fragmentTransaction.replace(R.id.nav_host_fragment,legworkoutfragment);
                                fragmentTransaction.addToBackStack(null);
                                fragmentTransaction.commit();

                            }
                        });

                    }
                });
                    }
                });

            }
        });
    }





    public void onDestroy(){
        super.onDestroy();
        binding = null;
    }
}