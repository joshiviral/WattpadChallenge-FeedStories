package com.example.feedingstories;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class FeedStoryActivity extends BaseActivty {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_feed);
        findViewById(R.id.test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (progressBar.getVisibility() == View.VISIBLE) {
                    showProgressbar(false);
                } else {
                    showProgressbar(true);
                   Toast.makeText(getApplicationContext(),"You Clicked Me", Toast.LENGTH_LONG).show();
                }



            }
        });
    }
}
