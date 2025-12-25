package com.withComposite;

public class File implements FileSystem{

    private String fileName;

    public File(String name){
        fileName=name;
    }
    @Override
    public void ls(){
        System.out.println("Filename: "+fileName);
    }
}
