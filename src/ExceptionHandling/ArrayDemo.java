package ExceptionHandling;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] a = new int[5];

        a[0] = 34;
        a[1] = 55;
        a[2] = 122;
        a[3] = 56;
        a[4] = 45;
        a[5] = 47;

        for(int i=0 ; i<5 ; i++)
            System.out.println(a[i]);
    }
}
