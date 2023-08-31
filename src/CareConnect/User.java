package CareConnect;
import java.util.Random;
import java.util.Scanner;

 class Enter
{

    {
        System.out.println("Welcome to CARE_CONNECT!! ");
    }

    public void OTP()
    {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int random = ran.nextInt(1000,9999);
        System.out.println("Your OTP is: " + random);
        System.out.print("Enter Your 4 Digit OTP: " );
        int Otp = sc.nextInt();
        if(Otp == random)
        {
            System.out.println("You are Successfully Login!! ");
        }
        else
        {
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
            System.out.println("*************************************************************************************");
            System.out.print("Enter your mobile number: +91");
            num = sc.nextLong();
            }
        catch (Exception e)
        {
            System.out.println("plz.. enter only numbers!!! ");
            flag = true;
        }
        if(flag == false)
        {

            String numStr = Long.toString(num);
            if (numStr.length() == 10)
            {
                OTP();
               // flag = false;
            }
            else
            {
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
public class User
{
    public static void main(String[] args)
    {
        Enter enter = new Enter();
        enter.MobileNumber();
    }
}

