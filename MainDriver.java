import java.util.Scanner;

public class MainDriver
{
    public static void main(String[] args) {
        Phone obj2 = new Phone("Apple", "Iphone 20", 2027);
        System.out.println(obj2.toString());
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter the make, model and year");
        String make_inp= inp.nextLine();
        String model_inp= inp.nextLine();
        int year_inp= inp.nextInt();
        obj2.setMake(make_inp);
        obj2.setModel(model_inp);
        obj2.setYear(year_inp);;
        System.out.println("Make = " +obj2.getMake());
        System.out.println("Model = " +obj2.getModel());
        System.out.println("Year = " +obj2.getYear());
        System.out.println(obj2.toString());
        System.out.println("Enter the current year");
        int curr_year_inp= inp.nextInt();
        System.err.println(obj2.isObselete(curr_year_inp));
    }
}