public class Lab1 {
    String Brand;
    static String product;
    int price;
    public void show()
    {
        System.out.println(Brand + " "+ product +" " +price);
    }
    public static void main(String a[])
    {
        Lab1.product="Smartphone";
        Lab1 obj1=new Lab1();
        obj1.price=50000;
        obj1.Brand="Samsung";
        obj1.show();
        Lab1 obj2=new Lab1();
        obj2.price=60000;
        obj2.Brand="Samsung";
        obj2.show();
    }
}
