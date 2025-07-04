package com.telusko;

public class Dev {

    private Computer com;
   // private int age;

//    public Dev() {
//        System.out.println("Dev contructor");
//    }
//
//    public Dev(int age){
//        System.out.println("Dev contructor by age");
//        this.age = age;
//    }
//
//    public Dev(Computer com){
//        System.out.println("Dev contructor by laptop");
//        this.com = com;
//    }
//
//    public int getAge(){
//        return age;
//    }
//
//    public void setAge(int age){
//        this.age = age;
//    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void build(){

        System.out.println("working on awesome project");
        com.compile();
    }
}
