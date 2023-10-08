package CareConnect;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AppointmentWithDoctor
{
    public AppointmentWithDoctor() throws IOException {
    }

    void Doctors()
    {
        new Divider();
        System.out.println("1. Cardiologist");
        System.out.println("2. Neurologist");
        System.out.println("3. Psychiatrist");
    }
    int num1; String s;
    int RoomNo; String slot;

    void choose () throws IOException {
        File f = new File("Info","activity.txt");
        FileWriter fw = new FileWriter(f, true);
        PrintWriter pw = new PrintWriter(fw);


        MainMenu mm =  new MainMenu();
        Scanner sc = new Scanner(System.in);
        new Divider();
        System.out.println("Press 1-Cardiologist, 2-Neurologist, 3-Psychiatrist, 4-Back ");

        int num2 = sc.nextInt();
        if(num2 == 1)
        {
            new Divider();
                System.out.println("      Name      |      RoomNo      |      Slot        | \n" +
                "1.  Ronit       |      3002        | 01:00PM-05:00PM  | \n" +
                "2.  Rakul       |      3004        | 08:00AM-01:00PM  | \n" +
                "3. Pradeep      |      3009        | 05:00PM-10:00PM  | \n" +
                "Select your comfort Slot by pressing 1-Dr. Ronit, 2-Dr. Rakul, 3-Dr. Pradeep, 4-Back, 5-Main Menu \n");
              num1 = sc.nextInt();
              if (num1 == 1){ s = "Ronit"; RoomNo = 3002;}
              if (num1 == 2){ s = "Rakul"; RoomNo = 3004;}
              if (num1 == 3){ s = "Pradeep"; RoomNo = 3009;}
        }
        else if (num2 == 2)
        {
            System.out.println("      Name       |      RoomNo      |      Slot        | \n" +
                "1.  Sakshi       |      3001        | 01:00PM-05:00PM  | \n" +
                "2.  Preeti       |      3003        | 08:00AM-01:00PM  | \n" +
                "3.  Prakash      |      3007        | 05:00PM-10:00PM  | \n" +
                "Select your comfort Slot by pressing 1-Dr. Sakshi, 2-Dr. Preeti, 3-Dr. Prakash, 4-Back, 5- Main Menu \n");
            num1 = sc.nextInt();
            if (num1 == 1){ s = "Sakshi"; RoomNo = 3001;}
            if (num1 == 2){ s = "Preeti"; RoomNo = 3003;}
            if (num1 == 3){ s = "Prakash"; RoomNo = 3007;}
        }
        else if (num2 == 3)
        {
                            System.out.println("      Name       |      RoomNo      |      Slot        | \n" +
                "1.  Shivam       |      3006        | 01:00PM-05:00PM  | \n" +
                "2.  Akshita      |      3005        | 08:00AM-01:00PM  | \n" +
                "3.  Akash        |      3008        | 05:00PM-10:00PM  | \n" +
                "Select your comfort Slot by pressing 1-Dr. Shivam, 2-Dr. Akshita, 3-Dr. Akash, 4-Back, 5-Main Menu \n");
            num1 = sc.nextInt();
            new Divider();
            if (num1 == 1){ s = "Shivam"; RoomNo = 3006;}
            if (num1 == 2){ s = "Akshita";RoomNo = 3005;}
            if (num1 == 3){ s = "Akash";RoomNo = 3008;}
        }
        else if (num2 == 4)
        {
           Handle h = new Handle();
           h.menuDriven();
           num2 = 32753;
        }

        if (num2 == 1 || num2 == 2 || num2 ==3 )
        {
            if(num1 == 1){slot = "01:00PM-05:00PM";}
            else if (num1 ==2) {slot = "08:00AM-01:00PM";}
            else if (num1 ==3) {slot = "05:00PM-10:00PM";}
            else if(num1 == 4)
            {
                Doctors();
                choose();
                if(num1 == 1 || num1 ==2 || num1 == 3){
                    new Divider();
                    System.out.println("Your appointment booked with Dr. " + s + " in RoomNo " + RoomNo + " between " + slot );
                    pw.println("Appointment booked with Dr. " + s +  " in RoomNo "  + RoomNo + " between " + slot );
                    pw.close();
                    fw.close();
                num1 = 19283; }
            }
            else if (num1 == 5)
            {
                Handle h = new Handle();
                h.menuDriven();
                num1 = 37256;
            }
            if(num1 == 1 || num1 ==2 || num1 == 3){
                new Divider();
                System.out.println("Your appointment booked with Dr. " + s + " in RoomNo " + RoomNo + " between " + slot );
                pw.println("Appointment with Dr. " + s +  " in RoomNo "  + RoomNo + " between " + slot );
                pw.close();
                fw.close();
                num1 = 19295; }
        }
    }

}
