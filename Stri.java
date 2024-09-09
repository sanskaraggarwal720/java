public class Stri {
    static String string_arg1="Initialized at the time of declaration";
    static String string_arg2;
    static{
        string_arg2="Initialized in the static block";
    }
    static void print()
    {
        System.out.println("String srguement 1 : "+string_arg1);
        System.out.println("String srguement 2 : "+string_arg2);
    }
    public static void main(String ...args) {
        Stri.print();
        System.out.println("Command line arguements ");
        for(String arg:args)
        {
            System.out.println(arg);
        }
    }
}
