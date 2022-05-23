package com.designpatterns.prototype;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class College implements Cloneable{


    private String collegeName;
    List<Student> students =new ArrayList<>();
    public void loadData(){
        for(int i=0;i<30;i++){
            Student b=new Student();
            b.setId(i);
            b.setStudentName("student"+1);
            getStudents().add(b);
        }
    }
    @Override
    protected College clone() throws CloneNotSupportedException {
        College shop=new College();
        for(Student b:this.getStudents())
        {
            shop.getStudents().add(b);
        }
        return shop;
//        return super.clone();   //Shallow Cloning
    }
}
