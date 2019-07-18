package com.example.facedetection;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Result_Dialog extends DialogFragment {

    private Button okbutton;
    private TextView resulttv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.fragment_resource,container,false);
        String resultText = "";
        okbutton = view.findViewById(R.id.result_ok_button);
        resulttv = view.findViewById(R.id.result_text_view);

        Bundle bundle  = getArguments();
        resultText = bundle.getString(Face_Detectiob.Result_Text);

        resulttv.setText(resultText);
        okbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        return view;    }
}
