import java.util.Scanner;

public class BID {
    public static boolean bidNumbers(boolean b, int i, double d) {
        if (b = true) {
            System.out.println("Boolean");
        }
        if (i > 49) {
            System.out.println("Integer");
        }
        if (Math.floor(d) > i * 2) {
            System.out.print("Double");
        }
    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            boolean b = sc.nextBoolean();
            int i = sc.nextInt();
            double d = sc.nextDouble();

        }
    }
}

