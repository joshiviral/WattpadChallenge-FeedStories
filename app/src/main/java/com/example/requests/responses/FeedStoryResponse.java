package com.example.requests.responses;

import com.example.models.FeedStory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FeedStoryResponse {
    @SerializedName("stories")
    @Expose()
    private FeedStory stories;

    public FeedStory getStories() {
        return stories;
    }

    @Override
    public String toString() {
        return "FeedStoryResponse{" +
                "stories=" + stories +
                '}';
    }
}
