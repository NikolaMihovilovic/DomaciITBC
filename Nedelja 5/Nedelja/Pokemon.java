package Pokemoni;

public abstract class Pokemon implements Attackable{
    String name;
    String type;
    int health;

    public Pokemon(String name, String type, int health) {
        this.name = name;
        this.type = type;
        this.health = health;
    }
    public Pokemon (String name, int health) {
        this.name = name;
        this.health = health;
    }

    public abstract String logAll();
    //Ispisuje kako pokemon napada, kako se brani, koga pobedjuje i od koga gubi
}


