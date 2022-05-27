package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Методом for");
        for (int i = 100; i <=1000 ; i=i+150) {
            System.out.println(i);
        }
        System.out.println("Методом while");
        int j = 100;
        while(j<1000){
            j = j+150;
            System.out.println(j);
        }
        System.out.println("Методом do-while");
        int r = 100;
        do{
            System.out.println(r);
            r = r+150;
        }while(r <=1000);
    }
}
