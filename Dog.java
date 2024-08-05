public class Dog {
    String name;
    String says;
    void display()
    {
        System.out.println(name +" says "+ says);
    }
    public static void compare(Object String1,Object String2){
        if(String1==String2)
        {
            System.out.println("Successful in ==");
        }
        if(String1.equals(String2))
        {
            System.out.print("Successful in equal function");
        }
        else if(String1!=String2)
        {
            System.out.print("Successful in !=" );
        }
        else
        {
            System.out.println("Unsuccessful Run");
        }
    }
    public static void main(String a[])
    {
        Dog obj1=new Dog();
        Dog obj2=new Dog();
        obj1.name="Spot";
        obj2.name="Scruffy";
        obj1.says="Ruff";
        obj2.says="Wurf";
        obj1.display();
        obj2.display();
        Dog obj3 = new Dog();
        obj3=obj1;
        Dog.compare(obj1,obj3);
    }
}
