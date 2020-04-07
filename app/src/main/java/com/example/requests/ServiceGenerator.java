package com.example.requests;

import com.example.util.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {
    private static Retrofit.Builder retrofitBuilder =
            new Retrofit.Builder().baseUrl(Constants.Base_URL).addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = retrofitBuilder.build();

    private static FeedStoryApi feedStoryApi = retrofit.create(FeedStoryApi.class);

    public FeedStoryApi getFeedStoryApi(){
        return feedStoryApi;
    }

}
