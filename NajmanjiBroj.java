import java.util.Scanner;

public class NajmanjiBroj {
    public static double minDvaBroja (double a, double b) {
        if (a<=b)
            return a;
        return b;
    }
    public static double najmanjiBroj (double a, double b, double c) {
        double z = minDvaBroja(a,b);
        double resenje = minDvaBroja(z, c);
        return resenje;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println(najmanjiBroj(a, b, c));
    }
}
