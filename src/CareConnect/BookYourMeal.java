package CareConnect;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class BookYourMeal
{
    String s; long codee;

    public BookYourMeal() throws IOException {
    }

    void meal()
    {
        new Divider();
        System.out.println("1. ");
        System.out.println
                (
                        "        Rs. 30             |          Rs.40                |          Rs.50             \n" +
                        " 1. Grilled Chicken Salad  | 4. Oatmeal with Berries       | 7. Stuffed Bell Peppers    \n" +
                        " 2. Greek Yogurt Parfait   | 5. Stuffed Peppers            | 8. Curry Bowl              \n" +
                        " 3. Cauli Stir-Fry         | 6. Shrimp Skewers             | 9. Tofu Bowl               \n"
                );
        System.out.println("2. Forget your meal code");
    }
    void choose() throws IOException {
        File f = new File("Info","activity.txt");
        FileWriter fw = new FileWriter(f, true);
        PrintWriter pw = new PrintWriter(fw);
        int p1;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Random ran = new Random();
        if (num > 0 && num < 10) {

            if(num == 1 || num ==2 || num == 3) { p1 = 30;}
            else if (num == 4 || num ==5 || num == 6) {p1=40;}
            else {p1 =50;}
            System.out.println("pay " + p1 + "rupees via google pay,Paytm,etc.");
            System.out.println("press 0 to cancel Payment & 1 to proceed");
            int num1 = sc.nextInt();
            switch (num1) {
                case 0:
                    meal();
                    break;
                case 1:
                    switch (num)
                    {
                        case 1: s = "Grilled Chicken Salad";
                        break;
                        case 2: s = "Greek Yogurt Parfait";
                        break;
                        case 3: s = "Cauli Stir-Fry";
                        break;
                        case 4: s = "Oatmeal with Berries";
                        break;
                        case 5: s = "Stuffed Peppers";
                        break;
                        case 6: s = "Shrimp Skewers";
                        break;
                        case 7: s = "Stuffed Bell Peppers";
                        break;
                        case 8: s = "Curry Bowl";
                        break;
                        case 9: s = "Tofu Bowl";

                    }
                    System.out.println("your " + s + " is booked collect it from Mess by telling them your code ");
                    pw.print("booked " + s + "  Code: " );
                    int code = ran.nextInt(10000, 99999);
                    System.out.println( "Your code is " + code);
                    pw.println(code);
                    pw.close();
                    fw.close();
            }
        }
    }

    void forgetCode() throws IOException {
        File f = new File("Info","activity.txt");
        FileWriter fw = new FileWriter(f, true);
        PrintWriter pw = new PrintWriter(fw);
            Random ran1 = new Random();
            int code = ran1.nextInt(10000, 99999);
            System.out.println( "New code is " + code);
            pw.println("New code for booked meal is: " +code);
            pw.close();
            fw.close();
    }

    void caller() throws IOException {
        Scanner sc = new Scanner(System.in);
        new Divider();
        System.out.println("Press 1-choose, 2-forget mealCode");
        int num3 = sc.nextInt();
        if (num3 == 2)
        {
            forgetCode();
        }
        else if (num3 == 1)
        {
            new Divider();
            System.out.println("Press b/w 1-9 to select your meal listed above");
            choose();
        }
        else
        {
            System.out.println("Enter a valid number. ");
            caller();
        }
    }
}
