package com.example.andrewbull.recyclerviewdemo;

import java.io.File;
import java.io.IOException;

public class Contact {
    public String name;
    public String imageUri;
    public File profilePic;

    Contact(String name, String photoTitle) {
        this.name = name;
        this.imageUri = "images/" + photoTitle + ".jpg";
        try {
            profilePic = File.createTempFile(photoTitle, "jpg");
        } catch (IOException exc) {

        }
    }
}
