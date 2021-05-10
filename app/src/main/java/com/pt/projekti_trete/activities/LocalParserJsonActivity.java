package com.pt.projekti_trete.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.pt.projekti_trete.R;

import org.json.JSONException;
import org.json.JSONObject;

public class LocalParserJsonActivity extends AppCompatActivity {
    String JSON_STRING = "{\"student\":{\"name\":\"Cristiano Ronaldo\",\"id\":\"7\"}}";

    TextView tvName, tvID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_local_parser_json);
        tvName = findViewById(R.id.tvName);
        tvID = findViewById(R.id.tvID);


        try{
            JSONObject jsonObject = new JSONObject(JSON_STRING);
            JSONObject employeeJsonObject = jsonObject.getJSONObject("student");

            tvName.setText(employeeJsonObject.getString("name"));
            tvID.setText(employeeJsonObject.getString("id"));

        }catch (JSONException jsonException){
            jsonException.printStackTrace();
        }


    }
}
