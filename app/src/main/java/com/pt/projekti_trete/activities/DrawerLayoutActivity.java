package com.pt.projekti_trete.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.pt.projekti_trete.R;

public class DrawerLayoutActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageView ivOpenMenu;
    TextView tvWebView,tvSharedPreferences,tvPopup,tvApi,tvGetLocation,tvJsonParser,
            tvCheckConnection,tvDynamicFragment,tvStaticFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_layout);

        getSupportActionBar().hide();

        drawerLayout = findViewById(R.id.drawer_layout);
        ivOpenMenu = findViewById(R.id.ivOpenMenu);
        tvWebView = findViewById(R.id.tvWebView);
        tvSharedPreferences = findViewById(R.id.tvSharedPreferences);
        tvPopup = findViewById(R.id.tvPopup);
        tvApi = findViewById(R.id.tvApi);
        tvGetLocation = findViewById(R.id.tvGetLocation);
        tvJsonParser = findViewById(R.id.tvJsonParser);
        tvCheckConnection=findViewById(R.id.tvCheckConnection);
        tvDynamicFragment = findViewById(R.id.tvDynamicFragment);
        tvStaticFragment = findViewById(R.id.tvStaticFragment);


        ivOpenMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        tvApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawerLayoutActivity.this, NewsListActivity.class);
                startActivity(intent);
            }
        });


        tvSharedPreferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawerLayoutActivity.this, SharedPreferences.class);
                startActivity(intent);

            }
        });

        tvWebView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawerLayoutActivity.this, WebView.class);
                startActivity(intent);
            }
        });

        tvGetLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawerLayoutActivity.this, GetCurrentLocation.class);
                startActivity(intent);
            }
        });

        tvJsonParser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawerLayoutActivity.this, LocalParserJsonActivity.class);
                startActivity(intent);
            }
        });


        tvCheckConnection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawerLayoutActivity.this, CheckConnection.class);
                startActivity(intent);
            }
        });

        tvPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawerLayoutActivity.this, Popup.class);
                startActivity(intent);
            }
        });

        tvDynamicFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawerLayoutActivity.this, FragmentHolderActivity.class);
                startActivity(intent);
            }
        });

        tvStaticFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrawerLayoutActivity.this,StaticFragmentActivity.class);
                startActivity(intent);
            }
        });


    }



}
