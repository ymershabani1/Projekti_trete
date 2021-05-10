package com.pt.projekti_trete.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.pt.projekti_trete.R;
import com.pt.projekti_trete.model.News;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class NewsAdapter extends BaseAdapter {
    Context context;
    ArrayList<News> newsArrayList;
    LayoutInflater layoutInflater;

    public NewsAdapter(Context context, ArrayList<News> newsArrayList) {
        this.context = context;
        this.newsArrayList = newsArrayList;
        layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return newsArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = layoutInflater.inflate(R.layout.news_cell,null);

        TextView tvID = view.findViewById(R.id.tvID);
        TextView tvTitle = view.findViewById(R.id.tvTitle);
        //TextView tvURL = view.findViewById(R.id.tvURL);
        ImageView ivPhoto = view.findViewById(R.id.ivPhoto);

        News news = newsArrayList.get(position);

        Picasso.get().load(news.getThumbnailUrl()).into(ivPhoto);
        tvID.setText(news.getId()+"");
        tvTitle.setText(news.getTitle());
        //tvURL.setText(news.getUrl());

        return view;
    }

}
