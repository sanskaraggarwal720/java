
import java.util.Scanner;

class Phone {
    private String make;
    private String model;
    private int year; 
    public Phone(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String getMake()
    {
        return make;
    }
    public String getModel()
    {
        return model;
    }
    public int getYear()
    {
        return year;
    }
    public void setMake(String make)
    {
        this.make=make;
    }
    public void setModel(String model)
    {
        this.model=model;
    }
    public void setYear(int year)
    {
        this.year= year;
    }
    public String toString()
    {
        return " make = "+make+" model = "+model +" year = " +year;
    }
    public boolean isObselete(int curr_year)
    {
        return (curr_year-this.year)>10;
    }
    public static void main(String a[])
    {
        Phone obj = new Phone("Apple", "Iphone 20", 2027);
        System.out.println(obj.toString());
        Scanner inp= new Scanner(System.in);
        System.out.println("Enter the make, model and year");
        String make_inp= inp.nextLine();
        String model_inp= inp.nextLine();
        int year_inp= inp.nextInt();
        obj.setMake(make_inp);
        obj.setModel(model_inp);
        obj.setYear(year_inp);;
        System.out.println("Make = " +obj.getMake());
        System.out.println("Model = " +obj.getModel());
        System.out.println("Year = " +obj.getYear());
        System.out.println(obj.toString());
        System.out.println("Enter the current year");
        int curr_year_inp= inp.nextInt();
        System.err.println(obj.isObselete(curr_year_inp));
    }
}
