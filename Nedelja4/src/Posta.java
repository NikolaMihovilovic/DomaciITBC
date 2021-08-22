import java.util.ArrayList;

public class Posta {
    private ArrayList<Poruka> poruke;

    public Posta(ArrayList<Poruka> poruke) {
        this.poruke = poruke;
    }

    public ArrayList<Poruka> getPoruke() {
        return poruke;
    }

    public void setPoruke(ArrayList<Poruka> poruke) {
        this.poruke = poruke;
    }

    public void add(Poruka p){
        for(Poruka a : poruke)
            if(a.getId() == (p.getId()))
        poruke.add(p);
    }
    public void remove(Poruka p){
        for(Poruka a : poruke)
            if(a.getId() == (p.getId()))
                poruke.remove(a.getPoruka());
    }
    public void send(Poruka p) {
        for (Poruka a : poruke)
            if (a.getId() == (p.getId())) {
                System.out.println(a.getPoruka());
                poruke.remove(a);
            }
    }
    public void change(Poruka p, String msg){
        for (int i = 0; i < poruke.size(); i++) {
            if(poruke.get(i).getPoruka().equals(p.getPoruka())){
                poruke.get(i).setPoruka(msg);
            }
        }
    }
    public int isplata(Poruka p){
        for(Poruka a : poruke)
            if(a.getPoruka() == (p.getPoruka())) {
                return a.getSuma();
            }
        return 0;
    }
    @Override
    public String toString() {
        String res = "";
        for(Poruka e : poruke){
            res += e.toString() +  "\n" ;
        }
        return res;
    }
}
