package ClassNConstructors;

public class MyClass2 {

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


    MyClass2()
    {
         a = 11;
         d = 22.22;
         c = 'c';
         str = "Selenium";

    }




    public static void main(String[] args) {

        MyClass2 ob = new MyClass2();

       /* ob.a = 10 ;
        ob.d = 6.7;
        ob.c = 'h';
        ob.str = "selenium";*/

        ob.display();



    }
}
