package WrapperClassDemo;

public class WrapperClassDemo2 {

    public static void main(String[] args) {

        String s1 = "11";
        String s2 = "22";

        System.out.println(s1+s2);

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        System.out.println(i1+i2);

        String s3 = "11.34";
        String s4 = "22.12";

        float f1 = Float.parseFloat(s3);
        float f2 = Float.parseFloat(s4);

        System.out.println(f1+f2);


        double d1 = Double.parseDouble(s3);
        double d2 = Double.parseDouble(s4);
        System.out.println(d1+d2);

        String s5 = "false";

        boolean result = Boolean.parseBoolean(s5);

        if(result)
            System.out.println("result is true");
        else
            System.out.println("result is false");

        String s6 = "f";
        char ch = s6.charAt(0);

    }
}
