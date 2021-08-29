package Pokemoni;

public class FirePokemon extends Pokemon{
    public FirePokemon(String name, String type, int health) {
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
        return name + " Napada: Vatrom";
    }

    @Override
    public String defend() {
        return name + " Brani se: Telesno";
    }

    @Override
    public String wins() {
        return name + " Pobedjuje: Grass type";
    }

    @Override
    public String losesFrom() {
        return name + " Gubi od: Water type";
    }
}






    // Napada: Vatrom
    // Brani se: Telesno
    // Pobedjuje: Grass type
    // Gubi od: Water type

