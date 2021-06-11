package com.company;

import java.util.Date;

public class Document {
    private String name;
    private String author;
    private String creation_date;
    private String content;
    public Document(String fileName, String creation_date, String author , String content){
        this.name = fileName;
        this.creation_date = creation_date;
        this.author = author;
        this.content = content;
    }
    public Document(String name, String creation_date, String author ){
        this.name = name;
        this.creation_date = creation_date;
        this.author = author;
        this.content = null;
    }
    public void setName(String name){this.name = name;}
    public void setAuthor(String author){this.author = author;}
    public void setContent(String content){this.content= content;}
    public String getContent(){return content;}
    public String getName(){return name;}
    public String getAuthor(){return author;}


}
