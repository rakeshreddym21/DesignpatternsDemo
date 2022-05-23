package com.designpatterns.adapter;

public class Demo {
    public static void main(String[] args) {
        TextReader textReader=new TextReader();
        textReader.read("pdf","book");
        textReader.read("word","junglebook");
        textReader.read("txt","book");
    }
}
