package CareConnect;

import java.util.Scanner;

public class PurchaseMedicine
{
    int i = 1;

    boolean repeat()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("press 1 to add more medicine otherwise press 0");
            int n = sc.nextInt();
            if(n==1){return true;}
            else if(n==0){return false;}
            else{
                System.out.println("enter a valid no.");
                boolean val = repeat();
               return val;
            }
        }
void choice() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your room number");
    int roomNo = sc.nextInt();
    boolean flag = true;
    while(flag) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Medicine names: ");
        String medicineName = scan.nextLine();
        System.out.println( i + " ---> " + medicineName);
        System.out.println("medicine " + medicineName + " is booked to room number " + roomNo);
        i++;
        flag = repeat();
        }
    }
}
