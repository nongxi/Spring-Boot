package com.reptort.test;

public class MyTestHarness40 {
    public void writeString(){
        //A.System.out.println("0,1");
        //B.MySub object=new MySub();
        //C.MySuper object=new MySuper();
        //E
        MySuper object=new MySub();
        System.out.println(object.buildString("0,"));
    }
    public static void main(String[] args){
        MyTestHarness40 mt=new MyTestHarness40();
        mt.writeString();
    }
}
