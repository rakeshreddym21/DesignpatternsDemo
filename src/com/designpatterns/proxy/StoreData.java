package com.designpatterns.proxy;

public class StoreData implements Data
{

    private  String fileName;
    @Override
    public void display() {
        System.out.println("Displaying data from "+fileName);
    }

    public StoreData(String fileName) {
        this.fileName = fileName;
        loadData(fileName);
    }
    private void loadData(String fileName){
        System.out.println("Fetching Data from "+ fileName);
    }
}
