class OuterClass2 {
    public class InnerClass2 {
        private int innerField = 30;
        private void innerMethod() {
            System.out.println("Inner class method called.");
        }
    }
    void accessInnerClass() {
        InnerClass2 inner = new InnerClass2();
        System.out.println("Inner field value: " + inner.innerField);
        inner.innerMethod();
        System.out.println("Cannot access inner class's private field or method directly.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        OuterClass2 outer2 = new OuterClass2();
        outer2.accessInnerClass();
    }
}
