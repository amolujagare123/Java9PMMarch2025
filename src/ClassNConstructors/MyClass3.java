package ClassNConstructors;

public class MyClass3 {

    int a = 89;
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

    MyClass3()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }
/*
    MyClass3()
    {
        a = 11;
        d = 22.22;
        c = 'c';
        str = "Selenium";
    }*/

    // parameterized constructor
    MyClass3(int a1, double d1, char c1,String str1)
    {
         a = a1;
         d = d1;
         c = c1;
         str = str1;
    }

    public static void main(String[] args) {

        MyClass3 ob = new MyClass3(12,45.6,'h',"amol");
       // MyClass3 ob2 = new MyClass3();

       /* ob.a = 10 ;
        ob.d = 6.7;
        ob.c = 'h';
        ob.str = "selenium";*/

        ob.display();

       // MyClass3 ob2 = new MyClass3(45,55.89,'c',"amol");




    }
}
