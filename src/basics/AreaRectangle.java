package basics;

import java.util.Scanner;

public class AreaRectangle {

    public static void main(String[] args)
    {
        int length;
        int breadth;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of length=");
        length = sc.nextInt();

        System.out.println("Enter the value of breadth=");
        breadth = sc.nextInt();

        int area=length*breadth;
        System.out.println("Area of rectangle is "+area);
    }
}
