package Methods;

public class MethodsReturningValue {

    int operation() // primitive
    {
        int a=10;
        int b=20;
        int area = a * b;
        return area;
    }

    int[] getMyArray()
    {
        int[] arr = {23,45,67,89,90};
        return arr;
    }

    String[][] getMy2DArray() {

        String[][] stArr = new String[4][3];

        for (int i = 0; i < stArr.length; i++) {
            for (int j = 0; j < stArr[0].length; j++) {

                int a = (int) (Math.random() * 1000 );
                stArr[i][j] = "IMG" + a;

            }
        }

        return stArr;
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

        int[] myArray = ob.getMyArray();

        for(int aa:myArray)
        {
            System.out.println(aa);
        }

        String[][] myStr = ob.getMy2DArray();

        System.out.println("Below is the random string array");

        for (int i=0;i< myStr.length ; i++)
        {
            for (int j=0;j< myStr[0].length ; j++)
            {
                System.out.print (myStr[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
