import java.util.Scanner;

public class DomaciZadatak3 {
    public static boolean rightPassword (String s) {

        if (s.length() <= 8) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (rightPassword(sc.nextLine())){
            System.out.println("Password is valid!");
        } else {
            System.out.println("Password is invalid!");
        }
    }
}
