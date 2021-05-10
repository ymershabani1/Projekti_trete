package com.pt.projekti_trete.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.pt.projekti_trete.preferences.Prefs;
import com.pt.projekti_trete.R;

public class SharedPreferences extends AppCompatActivity {

    EditText etName,etEmail;
    Button btnSave,btnClear,btnRetrieve;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);
        getSupportActionBar().hide();

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        btnSave = findViewById(R.id.btnSave);
        btnClear = findViewById(R.id.btnClear);
        btnRetrieve = findViewById(R.id.btnRetrieve);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etName.getText().toString().trim().isEmpty() || etEmail.getText().toString().trim().isEmpty()){
                    Toast.makeText(SharedPreferences.this, "Fill the fields", Toast.LENGTH_SHORT).show();
                }else {

                    Prefs.saveString(SharedPreferences.this,"name",etName.getText().toString());
                    Prefs.saveString(SharedPreferences.this,"email",etEmail.getText().toString());
                }

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etName.setText("");
                etEmail.setText("");
            }
        });

        btnRetrieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etName.setText(Prefs.getString(SharedPreferences.this,"name"));
                etEmail.setText(Prefs.getString(SharedPreferences.this,"email"));
            }
        });
    }
}
