package com.pt.projekti_trete.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pt.projekti_trete.R;

public class
StaticFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_fragment);
        getSupportActionBar().hide();
    }
}
