package com.example.requests;

import com.example.requests.responses.FeedStoryResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FeedStoryApi {

    //GET STORIES
    @GET("stories")
    Call<List<FeedStoryResponse>> getfeedstory(
            @Query("offset") int offset,
            @Query("limit") int limit,
            @Query("fields") String fields,
            @Query("filter") String filter
    );
}
