import java.util.Scanner;

public class DomaciZadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        sc.hasNextInt();
        int number = sc.nextInt();
        if (number > 999 && number < 10000) {
            int n = number;
            int newNumber;
            int j = n % 10;
            int d = (n / 10) % 10;
            int s = (n / 100) % 10;
            int h = n / 1000;
            newNumber = (h * s) - (d + j);
            System.out.println(newNumber);
        } else {
            System.out.println("Error!");
        }
    }
}
