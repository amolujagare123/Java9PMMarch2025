package Inheritance.Polymorphism;

public class Casting {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        double c = (double) a/b;

        // if you want to store one type of value into another
        // we keep that data type in round brackets in front of the
        // value to be stored. this is typecasting

        System.out.println("c=" + c);
    }
}
