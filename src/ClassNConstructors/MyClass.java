package ClassNConstructors;

public class MyClass {

    int a;
    double d;
    char c;
    String str;

    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        int x;

        x = 10 ;

        MyClass ob = new MyClass();
        ob.a = 10 ;
        ob.d = 6.7;
        ob.c = 'h';
        ob.str = "selenium";
        ob.display();

        MyClass ob2 = new MyClass();
        ob2.a = 10 ;
        ob2.d = 61.7;
        ob2.c = 'c';
        ob2.str = "Java";
        ob2.display();

    }
}
