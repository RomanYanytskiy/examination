package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimen = new  Dimensions(10, 5, 2);
        Dimensions dimen1 = new  Dimensions();
        Dimensions dimen2 = new  Dimensions(7);

        System.out.println(dimen.volume());
        System.out.println(dimen1.volume());
        System.out.println(dimen2.volume());

    }
}
