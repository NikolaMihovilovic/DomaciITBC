public class DomaciZadatak2 {
    public static String decoder (String s){
        String[] kljuc = {"#$%^", "!@#$!!!@#"};
        String[] decode = {"pite", "moroncinu"};
        s = s.replaceAll("#\\$%\\^","pite");
        s = s.replaceAll("!@#\\$!!!@#","moroncinu");
        return s;
    }
    public static void main(String[] args) {
        String poruka = "Jedi #$%^ !@#$!!!@# mali!";
        System.out.println(decoder(poruka));

    }
}
