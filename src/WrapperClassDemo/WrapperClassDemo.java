package WrapperClassDemo;

public class WrapperClassDemo {

    public static void main(String[] args) {

        int i = 5;
        System.out.println("i="+i);

       // Integer ii = new Integer(5);
        Integer ii1 = 5;
        Integer ii2 = i;

        System.out.println("ii1="+ii1);
        System.out.println("ii2="+ii2); //auto wrapping / auto boxing


        Integer ii3 = 56;
        int a1 = ii3.intValue(); // unwrapping / unboxing
        int a2 = ii3;  //auto unwrapping / auto unboxing

        System.out.println("ii3="+ii3);
        System.out.println("a1="+a1);
        System.out.println("a2="+a2);

    }
}
