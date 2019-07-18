package com.example.facedetection;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class Face_Detectiob extends Application {

    public static final String Result_Text = "Result_Text";
    public static final String Result_Dialog  = "Result_Dialog";

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
