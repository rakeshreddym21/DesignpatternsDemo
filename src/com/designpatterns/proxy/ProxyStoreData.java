package com.designpatterns.proxy;

public class ProxyStoreData implements Data{
    private StoreData data;
    private String fileName;

    public ProxyStoreData(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
         if(data==null){
             data=new StoreData(fileName);
         }
         data.display();
    }
}
