import java.util.Scanner;

public class SkriveniBroj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int counter = 0;
        n /= 10;
        while (n != 0) {
            int tmp = n % 10;
            n/=10;
            System.out.println(tmp);
            counter++;

        }
        System.out.println(counter);

    }
}
