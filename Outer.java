public class Outer {
    static class Inner{
        private void print()
        {
            System.out.println("Hello World");
        }
    }
    Inner obj = new Inner();
    public void accessinner()
    {
        // System.out.println("")
        obj.print();
    }
}
class driver{
    public static void main(String[] args) {
        Outer obj1=new Outer();
        obj1.accessinner();
    }
}
