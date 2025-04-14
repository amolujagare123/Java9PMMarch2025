package AbstractionDemo;

public interface AnotherInterface {
    void run();
    void start();
    void display();
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

interface Interface2
{
    void display();
}

class ChildInterface2 implements AnotherInterface,Interface2
{

    public void run() {
        System.out.println("run");
    }


    public void start() {
        System.out.println("start");
    }


    public void display() {
        System.out.println("display");
    }

    public static void main(String[] args) {

        AnotherInterface ob1 = new ChildInterface2();
        ob1.display();

        Interface2 ob2 = new ChildInterface2();
        ob2.display();
    }

}
