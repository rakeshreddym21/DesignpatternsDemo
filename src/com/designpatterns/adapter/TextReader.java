package com.designpatterns.adapter;

public class TextReader implements DocumentReader{
    DocumentAdapter documentAdapter;
    @Override
    public void read(String fileType, String fileName) {
if(fileType.equalsIgnoreCase("txt")){
    System.out.println("Opening Document "+fileName+" with Default Text Reader");
}
else if (fileType.equalsIgnoreCase("pdf")||fileType.equalsIgnoreCase("word")) {
    documentAdapter=new DocumentAdapter(fileType);
    documentAdapter.open(fileType,fileName);
}
    }
}
