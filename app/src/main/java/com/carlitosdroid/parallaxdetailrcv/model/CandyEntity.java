package com.carlitosdroid.parallaxdetailrcv.model;

/**
 * Created by Carlos Leonardo Camilo Vargas Huamán on 3/6/17.
 *
 */

public class CandyEntity {

    private boolean isFavorite;
    private String title;

    public CandyEntity(boolean isFavorite, String title) {
        this.isFavorite = isFavorite;
        this.title = title;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}