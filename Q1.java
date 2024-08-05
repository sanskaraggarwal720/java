public class Q1 {
    void compare(String String1,String String2){
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
        String String1="Ram";
        String String2="Ram";
        Q1 obj=new Q1();
        obj.compare(String1,String2);
    }
}
    
