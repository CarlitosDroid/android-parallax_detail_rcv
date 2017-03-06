package com.carlitosdroid.parallaxdetailrcv.model;

/**
 * Created by Carlos Leonardo Camilo Vargas Huamán on 3/6/17.
 */

public class FoodEntity {

    private boolean isFavorite;

    public FoodEntity(boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}