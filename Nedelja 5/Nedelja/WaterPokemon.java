package Pokemoni;
public class WaterPokemon extends Pokemon {


    public WaterPokemon(String name, String type, int health) {
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
        return name + " Napada: Vodom";
    }

    @Override
    public String defend() {
        return name + " Brani se: Vodom";
    }

    @Override
    public String wins() {
        return name + " Pobedjuje: Fire type";
    }

    @Override
    public String losesFrom() {
        return name + " Gubi od: Grass type";
    }
}


    // Napada: Vodom
    // Brani se: Vodom
    // Pobedjuje: Fire type
    // Gubi od: Grass type





