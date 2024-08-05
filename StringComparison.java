class StringComparison {
    boolean compare(String String1,String String2){
        if(String1==String2)
        {
            return true;
        }
        return false;
    }
    public static void main(String a[])
    {
        String String1="Ram";
        String String2="Ram";
        StringComparison obj=new StringComparison();
        System.out.println(obj.compare(String1,String2));
    }
}
