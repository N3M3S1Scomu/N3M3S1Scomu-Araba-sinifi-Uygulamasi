package com.company;
import  java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        araba c1=new araba("m1",2000,60);
        araba c2=new araba("m2",1998,50);
        araba c3=new araba("m3",2005,120);

        c1.bilgi();
        c2.bilgi();
        c3.bilgi();

        c1.hizlan();
        c2.yavasla();
        c3.hizlan();

        c1.bilgi();
        c2.bilgi();
        c3.bilgi();

        System.out.println(araba.adet());

    }

}