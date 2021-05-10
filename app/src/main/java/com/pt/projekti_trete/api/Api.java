package com.pt.projekti_trete.api;

import com.pt.projekti_trete.model.News;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://jsonplaceholder.typicode.com/";

    @GET("photos")
    Call<ArrayList<News>> getNews();

}