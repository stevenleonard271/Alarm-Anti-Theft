package com.example.mysavior.ui.about;

import android.app.ActionBar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public AboutViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("My Saviour adalah aplikasi yang dikembangkan oleh Steven Leonard Anggoro." +
                " Saat ini pengembang, sedang menempuh program pendidikan S1 Teknik Informatika di STIKI Malang." +
                " My Saviour dikembangkan pada tahun 2020 . Pengembang berharap aplikasi ini dapat membantu korban pencurian smartphone." +
                "Tentu aplikasi My Saviour ini masih membutuhkan banyak penanganan." +
                " Oleh karena itu, pengembang mengharapkan saran dan kritik dari pengguna agar aplikasi ini dapat dikembangkan lebih baik. \n" +
                "Terima kasih hehe");
    }


    public LiveData<String> getText() {
        return mText;
    }
}
