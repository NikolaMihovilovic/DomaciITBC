import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Karatista {
        private String ime;
        private int godine;
        private String rang;
        private String[] kata;


        public Karatista(String ime, int godine, String rang, String[] kata) {
                this.ime = ime;
                this.godine = godine;
                if (godine < 0)
                        System.out.println("Uneli ste pogresnu vrednost!");
                this.rang = rang;
                int numberSubstring = 0;
                if (Character.isDigit(rang.charAt(1))) {
                        numberSubstring = 1;
                }
                if (!Character.isDigit(rang.charAt(0)) || (Integer.parseInt(rang.substring(0, numberSubstring + 1)) > 10
                        || Integer.parseInt(rang.substring(0, numberSubstring + 1)) < 1)) {
                        System.out.println("Rang nije validan za karatistu: " + ime + ". Rang je postavljen na 10Kyu");
                        this.rang = "10Kyu";
                        return;
                }
                if (!rang.substring(numberSubstring + 1).equals("Kyu") && !rang.substring(numberSubstring + 1).equals("Dan")) {
                        System.out.println("Rang nije validan za karatistu: " + ime + ". Rang je postavljen na 10Kyu");
                        this.rang = "10Kyu";
                }

                this.kata = kata;
        }

        public String getIme() {
                return ime;
        }

        public void setIme(String ime) {
                this.ime = ime;
        }

        public int getGodine() {

                return godine;
        }

        public void setGodine(int godine) {
                if (godine < 0)
                        System.out.println("Uneli ste pogresnu vrednost!");
                this.godine = godine;
        }

        public String getRang() {
                int numberSubstring = 0;
                if (Character.isDigit(rang.charAt(1))) {
                        numberSubstring = 1;
                }
                if (!Character.isDigit(rang.charAt(0)) || (Integer.parseInt(rang.substring(0, numberSubstring + 1)) > 10
                        || Integer.parseInt(rang.substring(0, numberSubstring + 1)) < 1)) {
                        System.out.println("Rang nije validan za karatistu: " + ime + ". Rang je postavljen na 10Kyu");
                        this.rang = "10Kyu";

                }
                if (!rang.substring(numberSubstring + 1).equals("Kyu") && !rang.substring(numberSubstring + 1).equals("Dan")) {
                        System.out.println("Rang nije validan za karatistu: " + ime + ". Rang je postavljen na 10Kyu");
                        this.rang = "10Kyu";
                }
                return rang;
        }

        public void setRang(String rang) {
                int numberSubstring = 0;
                if (Character.isDigit(rang.charAt(1))) {
                        numberSubstring = 1;
                }
                if (!Character.isDigit(rang.charAt(0)) || (Integer.parseInt(rang.substring(0, numberSubstring + 1)) > 10
                        || Integer.parseInt(rang.substring(0, numberSubstring + 1)) < 1)) {
                        System.out.println("Rang nije validan za karatistu: " + ime + ". Rang je postavljen na 10Kyu");
                        this.rang = "10Kyu";

                }
                if (!rang.substring(numberSubstring + 1).equals("Kyu") && !rang.substring(numberSubstring + 1).equals("Dan")) {
                        System.out.println("Rang nije validan za karatistu: " + ime + ". Rang je postavljen na 10Kyu");
                        this.rang = "10Kyu";
                }

                this.rang = rang;
        }

        public String[] getKata() {
                return kata;
        }

        public void setKata(String[] kata) {
                this.kata = kata;
        }

        public String napadni(int index) {
                for (int i = 0; i < kata.length; i++) {
                        System.out.println("Karatista " + ime + "napada sa " +
                                kata[index] + "katom.");
                }
                return kata[index];
        }

        public void vatreniNapad() {
                System.out.println("Karatista " + ime + " napada sa " +
                        kata[ThreadLocalRandom.current().nextInt(0, kata.length)] + " katom");
        }

        public void log() {
                System.out.println("Karatistia: " + ime + ", " + godine + ", " + rang +
                        " - zna naredne kate " + Arrays.toString(kata));
        }
}



