package Personne;

public class Roi extends Personnage{
    @Override
    public void combattre() {
          this.getArme().utiliserArme();
    }
}
