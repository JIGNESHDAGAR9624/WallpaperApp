package com.example.wallpaperapp;

import java.util.ArrayList;

public class SearchModel {

    public SearchModel(ArrayList<ImageModel> photos) {
        this.photos = photos;
    }

    public ArrayList<ImageModel> getPhotos() {
        return photos;
    }

    public void setPhotos(ArrayList<ImageModel> photos) {
        this.photos = photos;
    }

    private ArrayList<ImageModel> photos;
}
