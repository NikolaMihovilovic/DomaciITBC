import java.util.Scanner;

public class JednakostranicniTrougao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int k;

        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for (i=1; i <= n; i++) {
            for (j=0; j <= n - i; j++) {

                System.out.print(" ");
            }
            for (k=1; k <= i; k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
