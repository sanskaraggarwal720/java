public class MyCustomException extends Exception{
    String message;
    MyCustomException(String message)
    {
        this.message=message;
    }
    public void DisplayMessage()
    {
        System.out.println("Caught Exception message : " +message);
    }
    public static void main(String[] args) {
        try {
            throw new MyCustomException("This is custom exception");
        } catch (MyCustomException e) {
            e.DisplayMessage();
        }
        finally{
            System.out.println("Finally block executed");
        }
    }
}
