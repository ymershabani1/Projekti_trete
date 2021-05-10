package com.pt.projekti_trete.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.pt.projekti_trete.R;
import com.pt.projekti_trete.adapter.NewsAdapter;
import com.pt.projekti_trete.model.News;
import com.pt.projekti_trete.api.Api;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NewsListActivity extends AppCompatActivity {

    ArrayList<News> newsArrayList = new ArrayList<>();
    ListView listView;
    NewsAdapter newsAdapter;
    RelativeLayout relPopUp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_news_list);
        linkViews();
        onClicks();

        listView.setAdapter(newsAdapter);
        makeApiCallAndLoadDataIntoListView();

    }

    private void onClicks() {

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(NewsListActivity.this,ApiActivity.class);
                intent.putExtra("photo",newsArrayList.get(position).getThumbnailUrl());
                intent.putExtra("title",newsArrayList.get(position).getTitle());

                startActivity(intent);


            }

        });
    }

    private void linkViews() {
        listView = findViewById(R.id.listView);
        relPopUp2 = findViewById(R.id.rel_popup_2);
    }

    private void makeApiCallAndLoadDataIntoListView() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<ArrayList<News>> call = api.getNews();

        call.enqueue(new Callback<ArrayList<News>>() {
            @Override
            public void onResponse(Call<ArrayList<News>> call, Response<ArrayList<News>> response) {

                newsArrayList = response.body();
                newsAdapter = new NewsAdapter(getApplicationContext(), newsArrayList);
                listView.setAdapter(newsAdapter);

            }

            @Override
            public void onFailure(Call<ArrayList<News>> call, Throwable t) {
                relPopUp2.setVisibility(View.VISIBLE);

            }
        });


    }

}
