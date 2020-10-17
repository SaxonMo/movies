package com.saxon.movies.model.dbEntity;

import java.util.Date;

public class actor {
    private int actorID;
    private String name;
    private String role;
    private Date birthday;
    private String photo;

    public int getActorID () {
        return actorID;
    }

    public void setActorID (int actorID) {
        this.actorID = actorID;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getRole () {
        return role;
    }

    public void setRole (String role) {
        this.role = role;
    }

    public Date getBirthday () {
        return birthday;
    }

    public void setBirthday (Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoto () {
        return photo;
    }

    public void setPhoto (String photo) {
        this.photo = photo;
    }

    @Override
    public String toString () {
        return "actor{" +
                "actorID=" + actorID +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", birthday=" + birthday +
                ", photo='" + photo + '\'' +
                '}';
    }
}
