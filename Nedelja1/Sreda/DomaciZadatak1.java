import java.util.Scanner;

public class DomaciZadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        c=a+b;
        System.out.println("Zbir dva uneta broja je " + c);
        c=a-b;
        System.out.println("Razlika dva uneta broja je " + c);
        c=a*b;
        System.out.println("Proizvod dva uneta broja je " + c);
        c=a/b;
        System.out.println("Kolicnik dva uneta broja je " + c);
        c=a%b;
        System.out.println("Ostatak pri deljenju dva uneta broja je " + c);

    }
}
