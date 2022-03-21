package com.example.tugas2recyclerview;

public class itemModel {

    String name, year;
    int poster;

    public itemModel(String name, String year, int poster) {
        this.name = name;
        this.year = year;
        this.poster = poster;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public int getPoster() {
        return poster;
    }
}
