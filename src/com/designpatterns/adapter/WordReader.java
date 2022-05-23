package com.designpatterns.adapter;

public class WordReader implements AdvancedDocumentReader{
    @Override
    public void readPdf(String fileName) {

    }

    @Override
    public void readWord(String fileName) {
        System.out.println("Opening Document "+fileName+"with Microsoft");

    }
}
