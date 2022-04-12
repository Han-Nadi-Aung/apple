package com.apple.java;

public class Exone {
    Exone (){
        System.out.println("This is apple");
    }
    public static void main(String[] args) {
        Exone obj= new Exone();


        Extwo app=new Extwo("Apple",18);
        System.out.println(app.one+" "+app.a);
    }
}
