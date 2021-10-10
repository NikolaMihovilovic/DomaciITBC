import java.util.Scanner;

public class PrestupneGodine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year 1: ");
        System.out.println("Enter a year 2: ");
        int year1 = sc.nextInt();
        int year2 = sc.nextInt();
        int i;
        int counter = 0;
        for (i = year1; i <= year2; i++) {
            if ((i % 4 == 0) && (i % 100 != 0 || i % 400 == 0)) {
                counter=counter+1;

            }
        }
        System.out.println(counter);
    }
}
