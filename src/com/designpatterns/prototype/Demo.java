package com.designpatterns.prototype;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        College col=new College();
        col.setCollegeName("Library ");
        col.loadData();
        College col2= col.clone(); //Deep Cloning
        col.getStudents().remove(2);
        System.out.println(col);
        System.out.println(col2);

    }
}
