package com.pt.projekti_trete.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pt.projekti_trete.R;
import com.pt.projekti_trete.fragments.FirstFragment;
import com.pt.projekti_trete.fragments.SecondFragment;


public class FragmentHolderActivity extends AppCompatActivity {
        Button btnFirstFragment,btnSecondFragment;
        View viewFirstFragmentActive,viewSecondFragmentActive;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_fragment_holder);
                getSupportActionBar().hide();

                getIntent();
                linkViews();
                onClicks();
                btnFirstFragment.setBackgroundColor(android.R.drawable.btn_default);
                btnSecondFragment.setBackgroundColor(android.R.drawable.btn_default);
                loadFragment(new FirstFragment());

        }

        private void onClicks() {
                btnFirstFragment.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                loadFragment(new FirstFragment());
                                btnFirstFragment.setTextColor(getResources().getColor(R.color.colorDarkRed));
                                viewFirstFragmentActive.setVisibility(View.VISIBLE);

                                btnSecondFragment.setTextColor(getResources().getColor(R.color.colorBlack));
                                viewSecondFragmentActive.setVisibility(View.INVISIBLE);

                        }
                });

                btnSecondFragment.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                loadFragment(new SecondFragment());

                                btnSecondFragment.setTextColor(getResources().getColor(R.color.colorDarkRed));
                                viewSecondFragmentActive.setVisibility(View.VISIBLE);

                                btnFirstFragment.setTextColor(getResources().getColor(R.color.colorBlack));
                                viewFirstFragmentActive.setVisibility(View.INVISIBLE);

                        }
                });
        }

        private void linkViews() {
                btnFirstFragment = findViewById(R.id.btnFirstFragment);
                btnSecondFragment = findViewById(R.id.btnSecondFragment);
                viewFirstFragmentActive = findViewById(R.id.viewFirstFragmentActive);
                viewSecondFragmentActive = findViewById(R.id.viewSecondFragmentActive);
        }

        private void loadFragment(Fragment fragment){
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.rel_fragment_holder,fragment);
                fragmentTransaction.commit();

        }
}