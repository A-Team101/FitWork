package com.example.fitwork.ui.gallery;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.fitwork.R;

import java.text.DateFormat;
import java.util.Calendar;

public class GalleryFragment extends Fragment {

    private TextView mTextView;



    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
       final TextView textView = root.findViewById(R.id.text_gallery);
       galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
           @Override
           public void onChanged(@Nullable String s) {
                textView.setText(s);
           }
       });

        return root;
    }
}