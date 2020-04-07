package com.example.feedingstories;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.nfc.Tag;
import android.os.Bundle;

import retrofit2.Call;

import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.models.FeedStory;
import com.example.requests.FeedStoryApi;
import com.example.requests.ServiceGenerator;
import com.example.requests.responses.FeedStoryResponse;
import com.example.util.Constants;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FeedStoryActivity extends BaseActivty {
    private static final String TAG = "FeedStoryActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_feed);

        findViewById(R.id.test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(progressBar.getVisibility()==View.VISIBLE)
                {
                    showProgressbar(false);
                }
                else
                {
                    showProgressbar(true);
                }
                //testRetrofitRequest();
            }
        });
    }

    private void testRetrofitRequest(){
        FeedStoryApi feedStoryApi = ServiceGenerator.getFeedStoryApi();
        Call<List<FeedStoryResponse>> responseCall = feedStoryApi.getfeedstory(
                0,10,"stories","new"
        );
        responseCall.enqueue(new Callback<List<FeedStoryResponse>>() {
            @Override
            public void onResponse(Call<List<FeedStoryResponse>> call, Response<List<FeedStoryResponse>> response) {
                Log.d(TAG, "onResponse : serverResponse"+ response.toString());
                if(response.code() == 200)
                {
                    Log.d(TAG,"onResponse: "+response.body().toString());
                    //List<FeedStory> feedStories = new ArrayList<>(response.body().get);
                }
            }

            @Override
            public void onFailure(Call<List<FeedStoryResponse>> call, Throwable t) {

            }
        });
    }
}


