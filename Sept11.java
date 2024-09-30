public class Sept11 {
    static class Inner{
        void print()
        {
            System.out.println("Hello World");
        }
    }
    Inner obj = new Inner();
}
class driver{
    public static void main(String[] args) {
        Sept11 obj1=new Sept11();
        obj1.obj.print();
    }
}