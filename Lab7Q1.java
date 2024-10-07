public class Lab7Q1 {
    public static void main(String[] args) {
        try 
        {
            throw new Exception("This is an exception message");
        } 
        catch (Exception e)
        {
            System.out.println("Caught exception " + e.getMessage());
        }
        finally{
            System.out.println("Finally block executed: I was here!");
        }
    }
}
