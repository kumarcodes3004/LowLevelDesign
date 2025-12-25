package com.withComposite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    private String directoryName;
    private List<FileSystem> fileSystemList;


    public Directory(String name){
        directoryName=name;
        fileSystemList =new ArrayList<>();
    }

    public void addFileOrDirectory(FileSystem obj){
        fileSystemList.add(obj);
    }

    public void removeFileOrDirectory(FileSystem obj){
        fileSystemList.remove(obj);
    }

    @Override
    public void ls(){
        System.out.println("Directory name:"+directoryName);
        for(FileSystem obj:fileSystemList){
            obj.ls();
        }
    }


}
