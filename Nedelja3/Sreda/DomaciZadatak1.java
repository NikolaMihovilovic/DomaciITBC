
public class DomaciZadatak1 {
    public static void originalMessage(String s){

        s = s.replaceAll("#", "");
        s = s.replaceAll("@", "");
        s = s.replaceAll("\\$", "");

        System.out.println(s);
    }

    public static void main(String[] args) {
        String oldMessage = "Vo$z$ite $#@pazlj@i######vo!";
        originalMessage(oldMessage);
    }
}
