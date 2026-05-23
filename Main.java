import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String rooms[] = {"Standard", "Deluxe", "Suite"};

        boolean booked[] = {false, false, false};
        int choice;
        do
        {
            System.out.println("\n===== HOTEL RESERVATION SYSTEM =====");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:

                    System.out.println("\nAvailable Rooms:");

                    for(int i=0; i<rooms.length; i++)
                    {
                        if(booked[i] == false)
                        {
                            System.out.println((i+1) + ". " + rooms[i] + " Room");
                        }
                    }

                    break;

                case 2:

                    System.out.println("\nSelect Room:");

                    for(int i=0; i<rooms.length; i++)
                    {
                        System.out.println((i+1) + ". " + rooms[i]);
                    }

                    int roomChoice = sc.nextInt();

                    if(booked[roomChoice-1] == false)
                    {
                        booked[roomChoice-1] = true;

                        System.out.println("Payment Successful");

                        System.out.println("Room Booked Successfully");
                    }
                    else
                    {
                        System.out.println("Room Already Booked");
                    }

                    break;

                case 3:

                    System.out.println("\nSelect Room to Cancel:");

                    for(int i=0; i<rooms.length; i++)
                    {
                        System.out.println((i+1) + ". " + rooms[i]);
                    }

                    int cancelChoice = sc.nextInt();

                    if(booked[cancelChoice-1] == true)
                    {
                        booked[cancelChoice-1] = false;

                        System.out.println("Booking Cancelled Successfully");
                    }
                    else
                    {
                        System.out.println("Room Not Booked Yet");
                    }

                    break;

                case 4:

                    System.out.println("Thank You");

                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while(choice != 4);
    }
}