package CareConnect;
import java.util.Random;
import java.util.Scanner;

public class BookYourMeal
{
    String s; long codee;
    void meal()
    {
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
    void choose()
    {
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

//                            System.out.println("your " + s + " is booked collect it from Mess by telling them your code ");
//                            int code = ran.nextInt(10000, 99999);
//                            System.out.println( "Your code is " + code);
//                            codee = code;
                    }
                    System.out.println("your " + s + " is booked collect it from Mess by telling them your code ");
                    int code = ran.nextInt(10000, 99999);
                    System.out.println( "Your code is " + code);
                    codee = code;
            }
        }
    }

    void forgetCode()
    {
        if(codee == 0)
        System.out.println("You have not purchased anything ");
        else
        {
            System.out.println("Your code is: " + codee);
        }
    }
}
