package com.example.mysavior.ui.petunjuk;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PetunjukViewModel extends ViewModel {
    private MutableLiveData<String> petunjuksatu;

    public PetunjukViewModel() {
        petunjuksatu = new MutableLiveData<>();

        petunjuksatu.setValue("1. Untuk menggunakan aplikasi, silahkan tekan tombol ");






    }

    public LiveData<String> getText() {
        return petunjuksatu;

    }
}
