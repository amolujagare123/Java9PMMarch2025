package StaticNFinal.demo;

import StaticNFinal.Student2;

import static StaticNFinal.Student2.staticMethod1;
import static StaticNFinal.Student2.staticMethod2;
import static StaticNFinal.Student2.college;

public class DemoClass {

    public static void main(String[] args) {

        Student2 s = new Student2();

        s.college = "";
        s.staticMethod1();
        staticMethod2();

        Student2.staticMethod1();
        staticMethod2();


        staticMethod1();
        staticMethod2();
        college = "";
    }
}
