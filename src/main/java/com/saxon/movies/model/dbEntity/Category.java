package com.saxon.movies.model.dbEntity;

public class Category {
    private int categoryID;
    private String description;

    public int getCategoryID () {
        return categoryID;
    }

    public void setCategoryID (int categoryID) {
        this.categoryID = categoryID;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    @Override
    public String toString () {
        return "Category{" +
                "categoryID=" + categoryID +
                ", description='" + description + '\'' +
                '}';
    }
}
