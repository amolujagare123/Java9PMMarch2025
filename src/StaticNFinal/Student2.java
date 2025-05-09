package StaticNFinal;

public class Student2 {

    int rno;
    String name;
   public static String college;

    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void staticMethod1()
    {
        System.out.println("Static Method 1");
      //  System.out.println("rno="+rno); // non-static - not allowed
     //   System.out.println("name="+name);// non-static - not allowed
        System.out.println("college="+college);//static - allowed
        staticMethod2();//static - allowed
     //   nonStaticMethod();// non-static - not allowed
     //   display();// non-static - not allowed
    }

    public static void staticMethod2()
    {
        System.out.println("Static Method 2");
    }

    void nonStaticMethod()
    {
        System.out.println("nonStaticMethod");
        System.out.println("Static Method 1");
        System.out.println("rno="+rno); // non-static - allowed
        System.out.println("name="+name);// non-static - allowed
        System.out.println("college="+college);//static - allowed
        staticMethod2();//static - allowed
        nonStaticMethod();// static - not allowed
        display();// static - not allowed
    }


    public static void main(String[] args) {
        Student2 s1 = new Student2();

        s1.display();
        s1.staticMethod1();

        Student2.staticMethod1();
        Student2.staticMethod2();

    }
}
