import java.util.Scanner;

public class DomaciZadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ((a > 0) && (b > 0) || (a < 0) && (b < 0)) {
            System.out.println("Brojevi " + a + " i " + b + " su istog znaka.");
        } else {
            System.out.println("Brojevi " + a + " i " + b + " su razlicitog znaka.");
        }

    }
}
