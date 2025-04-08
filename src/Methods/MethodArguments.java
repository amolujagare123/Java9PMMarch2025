package Methods;

import ClassNConstructors.MyClass;

public class MethodArguments {


    void addNumbers(int[] arr)
    {
        int sum = 0;
        for (int i=0;i<arr.length;i++)
        {
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }

    void printArray(String[][] stArr)
    {
        for (int i=0;i<stArr.length;i++)
        {
            for (int j=0;j<stArr[0].length;j++)
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    void setObject(MyClass obj)
    {
        obj.a = 12;
        obj.d = 56.78;
        obj.c = 'h';
        obj.str = "amol";
    }


    public static void main(String[] args) {


        MethodArguments ob = new MethodArguments();

        int[] a = {11,23,45,67,89,10};

         ob.addNumbers(a);

        String[][] myStr = {
                {"Aarav", "Vihaan", "Aditya"},
                {"Ishaan", "Kabir", "Arjun"},
                {"Diya", "Anaya", "Myra"},
                {"Aarohi", "Kavya", "Saanvi"}
        };

        ob.printArray(myStr);


        MyClass myClass = new MyClass();

        ob.setObject(myClass);

        myClass.display();
    }

}
