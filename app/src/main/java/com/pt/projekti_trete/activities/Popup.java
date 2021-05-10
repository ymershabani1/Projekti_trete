package com.pt.projekti_trete.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.pt.projekti_trete.R;

public class Popup extends AppCompatActivity {

    Button btn1PopupActivity;

    RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);
        getSupportActionBar().hide();

        btn1PopupActivity = findViewById(R.id.btn1ActivityPopup);
        relativeLayout = findViewById(R.id.popup_layout_container);


        btn1PopupActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setVisibility(View.VISIBLE);
            }
        });



    }
}
