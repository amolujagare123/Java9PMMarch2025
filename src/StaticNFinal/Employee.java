package StaticNFinal;

public /*final*/ class Employee {
    int salary = 35000;
    void empWork()
    {
        System.out.println("empWork");
    }

    /*final*/ void myMethod()
    {
        System.out.println("my method emp");
    }
}


class Programmer extends Employee
{
    int bonus = 15000;

    void programmerWork()
    {
        System.out.println("programmerWork");
    }

    void myMethod()
    {
        System.out.println("my method Programmer");
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println(p.bonus);
        p.programmerWork();

        System.out.println(p.salary);
        p.empWork();
    }
}
