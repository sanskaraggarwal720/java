public class Dog2 {
    void bark() 
    {
        System.out.println("The dog is barking");
    }
    void bark(int times) 
    {
        System.out.println("The dog barks " + times + " times");
    }
    void bark(String type) 
    {
        System.out.println("The dog is " + type);
    }
    void bark(boolean isHowling) 
    {
        if(isHowling) 
        {
            System.out.println("The dog is howling");
        } 
        else 
        {
            System.out.println("The dog is barking softly");
        }
    }
    public class NoConstructorClass 
    {

    }
    public class OverloadedConstructorClass 
    {
        public OverloadedConstructorClass() {
            System.out.println("Default constructor called");
        }
    
        public OverloadedConstructorClass(String message) {
            this();
            System.out.println("Overloaded constructor called with message: " + message);
        }
    }
    public static void main(String args[]) 
    {
            Dog2 myDog = new Dog2();
            myDog.bark();
            myDog.bark(3);
            myDog.bark("howling");
            myDog.bark(true);
            NoConstructorClass noConstructorObject = myDog.new NoConstructorClass();
            System.out.println("NoConstructorClass object created: " + noConstructorObject);
            OverloadedConstructorClass overloadedObject = myDog.new OverloadedConstructorClass("Hello, Dog!");
    }
}
