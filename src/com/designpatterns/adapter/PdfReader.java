package com.designpatterns.adapter;

public class PdfReader implements AdvancedDocumentReader
{
    @Override
    public void readPdf(String fileName) {
        System.out.println("Opening Document "+fileName+"with AdobeReader");
    }

    @Override
    public void readWord(String fileName) {

    }
}
