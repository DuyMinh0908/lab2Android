package com.vku.lab2.Model;

import java.text.SimpleDateFormat;

public class Singer {
    String image;
    String name;
    String singer;

    public Singer(){}
    public Singer(String image, String name, String singer) {
        this.image = image;
        this.name = name;
        this.singer = singer;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
