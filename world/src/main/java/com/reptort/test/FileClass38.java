package com.reptort.test;

import java.io.*;

public class FileClass {
    FileClass(){System.out.println("File");}
    public static void main(String[] args) throws Exception{
        IkmTest fileClass=new IkmTest("XYZ");
        FileOutputStream file=new FileOutputStream("Data.txt");
        ObjectOutputStream output=new ObjectOutputStream(file);
        output.writeObject(fileClass);
        output.close();
        FileInputStream fis=new FileInputStream("Data.txt");
        ObjectInputStream is=new ObjectInputStream(fis);
        IkmTest c2=(IkmTest) is.readObject();
        System.out.println(c2.getName());
        is.close();
        //result:
        //File
        //Test
        //File
        //XYZ
    }
}
class IkmTest extends FileClass implements Serializable{
    private String name;
    IkmTest (String name){
        this.name=name;
        System.out.println("Test");
    }
    public String getName(){return name;}
}