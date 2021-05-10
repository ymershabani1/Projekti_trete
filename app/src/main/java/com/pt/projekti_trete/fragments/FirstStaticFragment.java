package com.pt.projekti_trete.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pt.projekti_trete.R;

public class FirstStaticFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup vg, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_first_static_fragment, vg, false);
    }
}
