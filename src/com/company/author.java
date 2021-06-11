package com.company;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class author {
    private String authorName;

    public author(){
        authorName="Unknown";
    }
    public author(String _authorName){
        authorName=_authorName;
    }

    public Document CreateDocument(String title, String text) throws IOException {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        Document document = new Document(title,timeStamp,authorName,text);
        return document;
    }

    public void UpdateFile(String name,String text,Document document) throws IOException {

        document.setName(name);
        document.setContent(text);
    }
}