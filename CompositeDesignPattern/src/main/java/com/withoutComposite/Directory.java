package com.withoutComposite;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    private String Dname;
    List<Object> objList;

    public Directory(String Dname){
        this.Dname=Dname;
        objList = new ArrayList<>();
    }

    public void add(Object obj){
        objList.add(obj);
    }

    public void remove(Object obj){
        objList.remove(obj);
    }

    public void ls(){
        System.out.println("Directory Name: "+Dname);

        for(Object obj :objList){
            if(obj instanceof File){
                ((File) obj).ls();
            }else if(obj instanceof Directory){
                ((Directory) obj).ls();
            }
        }
    }
}
