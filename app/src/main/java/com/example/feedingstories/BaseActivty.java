package com.example.feedingstories;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class BaseActivty  extends AppCompatActivity {
public ProgressBar progressBar;
    @Override
    public void setContentView(int layoutResID) {
        ConstraintLayout constraintLayout = (ConstraintLayout) getLayoutInflater().inflate(R.layout.activity_base,null);
        FrameLayout frameLayout = constraintLayout.findViewById(R.id.activity_content);
        getLayoutInflater().inflate(layoutResID,frameLayout,true);
        progressBar = constraintLayout.findViewById(R.id.progressBar);
        super.setContentView(layoutResID);
    }
    public void showProgressbar(boolean visibility)
    {
        progressBar.setVisibility(visibility ? View.VISIBLE : View.INVISIBLE);
    }
}