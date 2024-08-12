public class Myinteger {
    int data;
    public Myinteger()
    {
        data=10;
    }
    boolean isEven()
    {
        return data%2==0;
    }
    int getter()
    {
        return data;
    }
    static boolean isEven_Static(int value)
    {
        return value%2==0;
    }
    static boolean isEven(Object Myinteger)
    {
        Myinteger Myint = new Myinteger();
        return (Myint.data)%2==0;
    }
    boolean equals(int val)
    {
        return val==data;
    }
    boolean equal(Object Myinteger,int val)
    {
        Myinteger myint= new Myinteger();
        return myint.data==val;
    }
    public static void main(String a[])
    {
        Myinteger obj1 = new Myinteger();
        System.out.println(obj1.data);
        obj1.data = 20;
        System.out.println(obj1.getter());
        System.out.println(obj1.isEven());
        System.out.println(Myinteger.isEven_Static(obj1.data));
        System.out.println(Myinteger.isEven(obj1));
        System.out.println(obj1.equals(10));
        System.out.println(obj1.equal(obj1,10));
    }
}
