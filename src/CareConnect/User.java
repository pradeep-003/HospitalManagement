package CareConnect;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

class Name
{
    private String name;

    Name() throws IOException {
    }

    public void name1() throws IOException {
        File f = new File("Info","activity.txt");
        FileWriter fw = new FileWriter(f, true);
        PrintWriter pw = new PrintWriter(fw);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        pw.println("----------------------------------------------------------------------------------------------------");
        pw.println("Name : " + name);
        pw.close();
        fw.close();
    }

}

class Exit
{
    int num ;
  void next() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1-Main Menu, 2-exit");
        try {
            num = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Write only numbers. ");
        }
        switch (num) {
            case 1:
                Handle h = new Handle();
                h.menuDriven();
                break;
            case 2:
                break;
            default:
                System.out.println("Enter a valid number");
                break;
        }
    }
}
class Divider
{
    public Divider()
    {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");

    }
}
 class Enter
{

    Enter() throws IOException {
    }

    void banner()
    {
        new Divider();
        System.out.println("Welcome to CARE_CONNECT!! ");
    }

    public void OTP()throws Exception
    {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int random = ran.nextInt(1000,9999);
        new Divider();
        System.out.println("Your OTP is: " + random);
        new Divider();
        System.out.print("Enter Your 4 Digit OTP: " );
        int Otp = sc.nextInt();
        if(Otp == random)
        {
            new Divider();
            System.out.println("You are Successfully Login!! ");
        }
        else
        {
            new Divider();
            System.out.println("Wrong OTP!!");
            OTP();
        }
    }
long num;
    boolean flag;
    public void MobileNumber() throws IOException {
        File f = new File("Info","activity.txt");
        FileWriter fw = new FileWriter(f, true);
        PrintWriter pw = new PrintWriter(fw);
        File k = new File("Info","activity.txt");
        FileWriter kw = new FileWriter(k, true);
        PrintWriter bw = new PrintWriter(kw);
        Scanner sc = new Scanner(System.in);
        try {
            new Divider();
            System.out.print("Enter your mobile number: +91");
            num = sc.nextLong();
            pw.println("Mobile Number: "+ num);
            pw.close();
            fw.close();
            }
        catch (Exception e)
        {
            new Divider();
            System.out.println("plz.. enter only numbers!!! ");
            flag = true;
        }
        if(flag == false)
        {

            String numStr = Long.toString(num);
            if (numStr.length() == 10)
            {
                try
                {
                OTP();
                }catch (Exception es)
                {
                    new Divider();
                    System.out.println("Sorry login again!!");
                    bw.println("Couldn't Logged in!!");
                    bw.close();
                    kw.close();
                    System.exit(0);
                }
            }
            else
            {
                new Divider();
                System.out.println("enter a valid no. of 10 digit!! ");
                MobileNumber();
            }
        }
        else
        {
            MobileNumber();
        }
    }

}

class Handle
{
    public void info() throws IOException {
        Enter enter = new Enter();
        Name n = new Name();
        enter.banner();
        n.name1();
        enter.MobileNumber();
    }


        void menuDriven() throws IOException {
        Scanner sc = new Scanner(System.in);
        MainMenu mm = new MainMenu();
        Exit ext = new Exit();
        mm.mainMenu();
            new Divider();
            System.out.println("Press 1-Book ICU WARD, 2-Book APPOINTMENT with Doctor, 3-Purchase Medicine, 4-facilities, 5-Book your Meal, 6-Exit");
        int num = sc.nextInt();
                switch (num)
                {
                    case 1:
                        BookICUWARD icu = new BookICUWARD();
                        icu.emergency();
                        ext.next();
                        break;
                    case 2:
                        AppointmentWithDoctor awd = new AppointmentWithDoctor();
                        awd.Doctors();
                        awd.choose();
                        ext.next();
                        break;
                    case 3:
                        PurchaseMedicine pm = new PurchaseMedicine();
                        pm.choice();
                        ext.next();
                        break;
                    case 4:
                        new Facilities();
                        ext.next();
                        break;
                    case 5:
                        BookYourMeal bym = new BookYourMeal();
                        bym.meal();
                        bym.caller();
                        ext.next();
                        break;
                }
        }
    }

public class User
{
    public static void main (String[] args) throws IOException
    {
      //  Enter e = new Enter();
        File dir = new File("Info");
        dir.mkdir();
        File f = new File(dir, "activity.txt");
        f.createNewFile();
        Handle h = new Handle();
        h.info();
        h.menuDriven();
    }
}

//   9999999999


