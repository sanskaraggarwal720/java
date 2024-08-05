class Basic{
    public static void main(String a[])
    {
        // System.out.print(6);
        System.out.println(6);
        System.out.println(7);
        int num1=2;
        int num2=3;
        int sum = num1+num2;
        System.out.println(sum);
        int mul = num1*num2;
        int div = num1/num2;
        int sub = num1-num2;
        System.out.println(mul);
        System.out.println(div);
        System.out.println(sub);
        if(sum>=6){
            System.out.println("greter");
        }
        else{
        System.out.println("Smaller");}
        double num5=5.6;
        float num6=5.6f;  //This is explicit typecast because double is default datatype for decimal 
        System.out.println(num5);
        System.out.println(num6);
        short sh=558;
        long l=5854; // this is running because my jdk is above 17 and if my jdk is 17 then it will give error then we have to typecast it into l
        System.out.println(sh);
        System.out.println(l);
        byte b=127;
        int c=12;
        System.out.println(c==b);
        c=b;
        b=(byte)c; // this  is giving error because byte takes 1 byte and int takes 4bytes
        // System.out.println();
        int flag=5;
        System.out.println(b);
        while(flag>0)
        {
            System.out.println("Success");
            flag--;
        }
        do { 
            System.out.println("Success "+flag);
            flag++;
        } while (flag<6);
    }
}