package AbstractionDemo;

public interface InterfaceDemo {

    void run();
    void start();

    default void display1()
    {
        System.out.println("display1");
    }

    static void display2()
    {
        System.out.println("display2");
    }

    private void display3()
    {
        System.out.println("display3");
    }
}

class ChildInterface implements InterfaceDemo
{

    public void run() {
        System.out.println("run");
    }


    public void start() {
        System.out.println("start");
    }

    public static void main(String[] args) {

        InterfaceDemo ob = new ChildInterface();
        ob.start();
        ob.run();


        InterfaceDemo.display2();
    }

}