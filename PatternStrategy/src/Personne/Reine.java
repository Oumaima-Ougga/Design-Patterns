package Personne;

public class Reine extends Personnage{
    @Override
    public void combattre() {
        this.getArme().utiliserArme();
    }
}
