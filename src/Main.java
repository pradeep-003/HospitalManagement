import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random ran = new Random();
        int random_1 = ran.nextInt();
        System.out.println(random_1);
        int random_2 = ran.nextInt(1000, 9999);
        System.out.println(random_2);

    }
}