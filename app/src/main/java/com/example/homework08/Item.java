package com.example.homework08;

public class Item {
    private String text;
    private String writer;
    private int imageId;

    public Item (String name,String writer,int imageId){
        this.text=name;
        this.writer=writer;
        this.imageId=imageId;
    }

    public String getText() {
        return text;
    }

    public String getWriter() {
        return writer;
    }

    public int getImageId() {
        return imageId;
    }
}
