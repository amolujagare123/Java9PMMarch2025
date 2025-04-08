package Methods;

public class MethodsReturningValue {

    int operation()
    {
        int a=10;
        int b=20;
        int area = a * b;
        return area;
    }

    public static void main(String[] args) {

        int x;
        x = 45;
        System.out.println(x);
        int a = 10 + x ;
        int b = x;

        MethodsReturningValue ob = new MethodsReturningValue();
        System.out.println(ob.operation());

        int y = ob.operation();

        System.out.println("y="+y);

    }
}
