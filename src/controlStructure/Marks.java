package controlStructure;

public class Marks {

    public static void main(String[] args) {

        int marks = 109;

        if(marks>=0 && marks<=100) {
            if (marks < 40)
                System.out.println("Fail");

            else if (marks >= 40 && marks < 50)
                System.out.println("Pass");

            else if (marks >= 50 && marks < 60)
                System.out.println("Second Class");

            else if (marks >= 60 && marks < 75)
                System.out.println("First Class");

            else if (marks >= 75)
                System.out.println("Distinction");

        }
        else
            System.out.println("invalid value");

    }
}
