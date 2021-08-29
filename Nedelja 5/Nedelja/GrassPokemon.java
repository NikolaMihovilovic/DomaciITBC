package Pokemoni;

public class GrassPokemon extends Pokemon {

    public GrassPokemon(String name, String type, int health) {
        super(name, type, health);
    }
    public String logAll(){
        return attack().toString() + "\n"
                + defend().toString() + "\n"
                + wins().toString() + "\n"
                + losesFrom().toString();
    }

    @Override
    public String attack() {
        return name + " Napada: Travom";
    }

    @Override
    public String defend() {
        return name  + " Brani se: Izbegava";
    }

    @Override
    public String wins() {
        return name + " Pobedjuje: Water type";
    }

    @Override
    public String losesFrom() {
        return name + " Gubi od: Fire type";
    }
}




    // Napada: Travom
    // Brani se: Izbegava
    // Pobedjuje: Water type
    // Gubi od: Fire type


