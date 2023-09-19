package CareConnect;
import java.util.Random;
import java.util.Scanner;

class Divider
{
    public Divider()
    {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
    }
}
 class Enter
{

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
    public void MobileNumber() {
        Scanner sc = new Scanner(System.in);
        flag = false;
        try {
            new Divider();
            System.out.print("Enter your mobile number: +91");
            num = sc.nextLong();
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
                }
            }
            else
            {
                new Divider();
                System.out.println("enter a valid no. of 10 digit!! ");
               // flag = true;
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
    public void info()
    {
        Enter enter = new Enter();
        enter.MobileNumber();

    }


        void menuDriven()
        {
        Scanner sc = new Scanner(System.in);
        MainMenu mm = new MainMenu();
        mm.mainMenu();
            new Divider();
            System.out.println("Press 1-Book ICU WARD, 2-Book APPOINTMENT with Doctor, 3-Purchase Medicine, 4-facilities, 5-Book your Meal, 6-Exit");
        int num = sc.nextInt();
                switch (num)
                {
                    case 1:
                        BookICUWARD icu = new BookICUWARD();
                        icu.emergency();
                        break;
                    case 2:
                        AppointmentWithDoctor awd = new AppointmentWithDoctor();
                        awd.Doctors();
                        awd.choose();
                        break;
                    case 3:
                        PurchaseMedicine pm = new PurchaseMedicine();
                        pm.choice();
                        break;
                    case 4:
                        new Facilities();
                        break;
                    case 5:
                        BookYourMeal bym = new BookYourMeal();
                        bym.meal();
                        int num3 = sc.nextInt();
                        if (num3 == 2) {
                            bym.forgetCode();
                        }
                        if (num3 == 1) bym.choose();
                        break;
                }
        }
    }

public class User
{
    public static void main(String[] args)
    {
        Handle h = new Handle();
        h.info();
        h.menuDriven();
    }
}



