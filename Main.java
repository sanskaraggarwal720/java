class OuterClass {
    private int outerField = 10;
    private void outerMethod() {
        System.out.println("Outer class method called.");
    }
    class InnerClass {
        void modifyOuterClass() {
            outerField = 20; 
            outerMethod();   
        }
    }
    void createInnerAndModify() {
        InnerClass inner = new InnerClass();
        inner.modifyOuterClass();
    }
    void display() {
        System.out.println("Outer field value: " + outerField);
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        System.out.println("Before modification:");
        outer.display();
        outer.createInnerAndModify();
        System.out.println("After modification:");
        outer.display();
    }
}
