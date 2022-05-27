package com.company;

public class Dimensions {
        double width;
        double height;
        double depth;
        Dimensions(double w, double h, double d) {
                width = w;
                height = h;
                depth = d;
        }
        Dimensions() {
                width = 0;
                height = 0;
                depth = 0;
        }
        Dimensions(double len) {
                width = height = depth = len;
        }
        double volume() {
                return width * height * depth;
        }
}

