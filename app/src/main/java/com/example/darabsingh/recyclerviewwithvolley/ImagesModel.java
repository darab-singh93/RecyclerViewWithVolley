package com.example.darabsingh.recyclerviewwithvolley;

public class ImagesModel {
    private String imageUrl;
    private String imageName;
    private int Likes;

    public ImagesModel(String imageUrl, String imageName, int likes) {
        this.imageUrl = imageUrl;
        this.imageName = imageName;
        Likes = likes;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public int getLikes() {
        return Likes;
    }

    public void setLikes(int likes) {
        Likes = likes;
    }
}
