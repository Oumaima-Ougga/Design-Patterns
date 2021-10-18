package Personne;

import Comportement.ComportementArme;

public abstract class Personnage {

    private ComportementArme arme;

    public abstract void combattre();
    public void setArme(ComportementArme a){
        this.arme=a;
    }

    public ComportementArme getArme() {
        return arme;
    }
}
