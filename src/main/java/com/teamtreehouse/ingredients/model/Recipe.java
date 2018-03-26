package com.teamtreehouse.ingredients.model;

import java.time.LocalDate;

public class Recipe {
    private String title;
    private int categoryId;
    private LocalDate dateUploaded;
    private String username;
    private boolean favorite;

    public Recipe(String title, int categoryId, LocalDate dateUploaded, String username, boolean favorite) {
        this.title = title;
        this.categoryId = categoryId;
        this.dateUploaded = dateUploaded;
        this.username = username;
        this.favorite = favorite;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}

