package basics;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args)
    {
        double radius;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius=");
        radius = sc.nextDouble();

        double area=3.14*radius*radius;


        System.out.println("Area of Circle is "+area);
    }
}
