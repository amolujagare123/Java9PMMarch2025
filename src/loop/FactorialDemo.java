package loop;

public class FactorialDemo {

    public static void main(String[] args) {

        int n = 6;
        // 5! = 5 x 4 x 3 x 2 x 1
        int mult = 1;
        for(int i=n ; i>=1 ;i--)
        {
            System.out.println(i);

            mult = mult * i;
        }

        System.out.println("Factorial = "+mult);

    }
}
