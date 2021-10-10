import java.util.Scanner;

public class ProsecnaVrednost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Import a number (0 to exit)");
        int cenaArtikla = sc.nextInt();
        int sumaArtikala;
        int brojArtikala;
        int prosecnaVrednost;
        sumaArtikala = 0;
        brojArtikala = 0;
        prosecnaVrednost = 0;

        while (cenaArtikla != 0) {
            System.out.println("Import a number (0 to exit)");
            brojArtikala=brojArtikala+1;
            sumaArtikala = sumaArtikala + cenaArtikla;
            if (cenaArtikla < 0) {
                brojArtikala=brojArtikala-1;
                sumaArtikala = sumaArtikala - cenaArtikla;
                brojArtikala++;
            }
            prosecnaVrednost = sumaArtikala/brojArtikala;
        }
        System.out.println(prosecnaVrednost);
    }
}


