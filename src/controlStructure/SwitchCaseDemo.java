package controlStructure;

public class SwitchCaseDemo {

    public static void main(String[] args) {

        int a = 100;
        int b = 20;
        int c;
        String operation ="add";

        switch (operation)
        {
            case "add" : c = a + b;
                System.out.println("addition="+c);
                break;

            case "sub" : c = a - b;
                System.out.println("Subtraction="+c);
                break;

            case "mult" : c = a * b;
                System.out.println("Multiplication="+c);
                break;

            case "div" : c = a / b;
                System.out.println("Division="+c);
                break;

            default:
                System.out.println("wrong choice");
                break;

        }

    }
}
