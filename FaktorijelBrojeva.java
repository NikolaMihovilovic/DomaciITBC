import java.util.Scanner;

public class FaktorijelBrojeva{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(faktorijel(x));
    }
    public static int faktorijel (int x) {
        int faktorijel = 1;
        while (x !=0) {
            faktorijel *= x;
            x --;
        }
        return faktorijel;
    }
}
