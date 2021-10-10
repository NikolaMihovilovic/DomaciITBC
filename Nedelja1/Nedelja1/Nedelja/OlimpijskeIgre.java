import java.util.Scanner;

public class OlimpijskeIgre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a team:");
        String Tim1 = sc.next();
        String Tim2 = sc.next();
        System.out.println("Enter number of medals:");
        int zlatneMedalje1 = sc.nextInt();
        int srebrneMedalje1 = sc.nextInt();
        int bronzaneMedalje1= sc.nextInt();
        int zlatneMedalje2 = sc.nextInt();
        int srebrneMedalje2 = sc.nextInt();
        int bronzaneMedalje2= sc.nextInt();
        int r = zlatneMedalje1 + srebrneMedalje1 + bronzaneMedalje1;
        int s = zlatneMedalje2 + srebrneMedalje2 + bronzaneMedalje2;
        if (r > s) {
            System.out.println("Winner team is: " + Tim1 + ".");
        } else {if (r < s) {
            System.out.println("Winner team is: " + Tim2 + ".");
        }
            if (r == s) {
                System.out.println("The score is tied.");
            }



            }


    }
}
