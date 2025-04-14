package AbstractionDemo;

public abstract class AbstractClass {

     abstract void run();
     abstract void start();

    void display()
    {
        System.out.println("display");
    }

}

class ChildAbstract extends AbstractClass
{
    void run() {
        System.out.println("run");
    }

    void start() {
        System.out.println("start");
    }

    public static void main(String[] args) {

        AbstractClass ob = new ChildAbstract();
        ob.run();
        ob.start();
        ob.display();
    }
}
