package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {

        hello("World");
        hello("User");
        hello("Kostya");

        double l =5;
        System.out.println("Площадь квадрата со стороной" + l + " = " + area(l));

        double a =4;
        double b =6;
        System.out.println("Площадь со стороной " + a + " и " + b + " = " + area(a,b));
    }

    public static void hello (String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area (double Len) {
        return Len * Len;
    }

    public static double area (double a, double b) {
        return a * b;
    }
}

