package Arrays.SingleDimentionalArray;

public class OtherMethod {

    public static void main(String[] args) {
        double [] d= {1.1 , 1.2 , 1.3,1.4,1.5,1.6,1.7,1.8,1.9,1.10};
        char [] c= {'M','U','S','K','A','N','S','I','Y','E'};
        String[] str = {"aaaa", "bbbb", "cccc", "dddd",
                "eeeee", "fffff", "gggggg",
                "ggggg", "iiiii", "jjjjj", "kkkkk"};

        System.out.println("------ Double --------");

        for (int i = 0; i < d.length; i++)
            System.out.println(d[i]);

        System.out.println("------ Char --------");
        for (int i = 0; i < c.length; i++)
            System.out.println(c[i]);

        System.out.println("------ String --------");
        for (int i = 0; i < str.length; i++)
            System.out.println(str[i]);




    }
}
