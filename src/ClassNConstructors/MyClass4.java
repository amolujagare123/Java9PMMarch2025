package ClassNConstructors;

public class MyClass4 {

    int a ;
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

    // parameterized constructor with this operator
    MyClass4(int a, double d, char c, String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }

    public static void main(String[] args) {

        MyClass4 ob = new MyClass4(12,45.6,'h',"amol");

       /* ob.a = 10 ;
        ob.d = 6.7;
        ob.c = 'h';
        ob.str = "selenium";*/

        ob.display();



    }
}
