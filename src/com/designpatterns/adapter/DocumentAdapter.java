package com.designpatterns.adapter;

public class DocumentAdapter {
    AdvancedDocumentReader advancedDocumentReader;
    public DocumentAdapter(String fileType){
        if(fileType.equalsIgnoreCase("pdf")){
            advancedDocumentReader=new PdfReader();
        }
        else{
            advancedDocumentReader=new WordReader();
        }
    }
    public void open(String fileType,String fileName){
        if(fileType.equalsIgnoreCase("pdf")){
            advancedDocumentReader.readPdf(fileName);
        }
        else{
            advancedDocumentReader.readWord(fileName);
        }
    }
}
