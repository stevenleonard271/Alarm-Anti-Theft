package com.example.mysavior.ui.petunjuk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.mysavior.R;
import com.example.mysavior.ui.gallery.GalleryViewModel;

public class PetunjukFragment extends Fragment {
    private PetunjukViewModel petunjukViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        petunjukViewModel =
                ViewModelProviders.of(this).get(PetunjukViewModel.class);
        View root = inflater.inflate(R.layout.fragment_petunjuk, container, false);
        final TextView petunjuksatu = root.findViewById(R.id.tvptjsatu);



        petunjukViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                petunjuksatu.setText(s);
            }
        });
        return root;
    }
}
