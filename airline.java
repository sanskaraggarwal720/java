import java.util.Scanner;
public class airline {
    public static void main(String[] args) {
        System.out.println("Enter class choice : \n 1. First class \n 2. Economy class");
        Scanner inp= new Scanner(System.in);
        int choice = inp.nextInt();
        boolean arr[ ] = new boolean[10];
        switch(choice){
            case 1:
                for(int i=0;i<5;i++)
                {
                    if(arr[i]==false)
                    {
                        System.out.println("Seat alloted in First class is = " +(i+1));
                        arr[i]=true;
                        break;
                    }
                    else
                    {
                        System.out.println("No seat is vacant");
                    }
                }
            case 2:
                for(int i=5;i<10;i++)
                {
                    if(arr[i]==false)
                    {
                        System.out.println("Seat alloted in Economy class is = " +(i+1));
                        arr[i]=true;
                        break;
                    }
                    else
                    {
                        System.out.println("No seat is vacant");
                    }
            }
        }
    }
}
