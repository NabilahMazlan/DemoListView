package com.example.demolistview;

public class Food {

    private String name;
    private boolean stars;

    public Food(String name, boolean stars) {
        this.name = name;
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStars() {
        return stars;
    }

    public void setStars(boolean stars) {
        this.stars = stars;
    }
}
