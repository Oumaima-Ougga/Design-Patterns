package Personne;

public class Chevalier extends Personnage{
    @Override
    public void combattre() {
        this.getArme().utiliserArme();
    }
}
