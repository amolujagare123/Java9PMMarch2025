package StringDemo;

public class SplitDemo {
    public static void main(String[] args) {
        String str = "My name is Amol";

        String[] stArr = str.split("m");

       for (int i=0;i< stArr.length ; i++)
            System.out.println(stArr[i]);

       /* for(String value:stArr)
        {
            System.out.println(value);
        }*/

    }

}
