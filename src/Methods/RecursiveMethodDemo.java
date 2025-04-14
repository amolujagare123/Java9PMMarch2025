package Methods;

public class RecursiveMethodDemo {

    void myMethod()
    {
        System.out.println("My Method");
        myMethod();
    }

    public static void main(String[] args) {
        RecursiveMethodDemo ob = new RecursiveMethodDemo();
        ob.myMethod();
    }
}
