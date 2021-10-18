package Personne;

public class Troll extends Personnage{
    @Override
    public void combattre() {
        this.getArme().utiliserArme();
    }
}
