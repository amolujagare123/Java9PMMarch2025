package ExceptionHandling;

public class ThrowDemo {

    void checkNumber(int i)
    {
        if(i>=1 && i<=10)
            System.out.println("We are safe");
        else
            throw new RuntimeException("We are in danger");
    }


    public static void main(String[] args) {

        int a = 13;

        System.out.println("check number");
        ThrowDemo ob = new ThrowDemo();

        ob.checkNumber(a);

        System.out.println("end of the program");
        System.out.println("end of the program");
        System.out.println("end of the program");
        System.out.println("end of the program");
        System.out.println("end of the program");

    }
}
