package CareConnect;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class BookICUWARD
{
LocalTime tm = LocalTime.now();
Random ran = new Random();
Scanner sc = new Scanner(System.in);

    public BookICUWARD() throws IOException {
    }

    int pay()
{
    System.out.println("press 1 to proceed & 0 to cancel payment ");
    int press = sc.nextInt();
    switch (press)
    {
        case 0:
            System.out.println("Rupees 50,000 payment canceled at "+ tm);
            break;
        case 1:
            System.out.println("Rupees 50,000 payment completed at " + tm);
            break;
        default:
            System.out.println("Enter a valid number to cancel or proceed the payment ");
            pay();
    }
    return press;
}
void emergency() throws IOException {
    File f = new File("Info","activity.txt");
    FileWriter fw = new FileWriter(f, true);
    PrintWriter pw = new PrintWriter(fw);
    System.out.println("Enter the patient name: ");
    String name = sc.nextLine();
    System.out.println("For booking ICU for 1 day pay security charges first of rupees 50,000 online ");
    int val = pay();
    if (val == 0)
    {

    } else if (val == 1) {
        int roomNo = ran.nextInt(302,312);
        System.out.println("admit Patient " +name + " to ICU ward "+ roomNo );
        pw.println("Patient " + name + " Booked ICU ward " + roomNo);
        pw.close();
        fw.close();
    }
}

}
