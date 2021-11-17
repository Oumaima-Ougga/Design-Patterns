package state;

public abstract class Etat {
    protected Distributeur distributeur;

    public Etat(Distributeur distributeur) {
        this.distributeur = distributeur;
    }

    abstract Etat inserer_carte(Carte c);
    abstract Etat entrer_code(int code);
    abstract Etat retirer_argent(int somme);
    abstract Etat consulter_solde();
    abstract Etat ajouter_argent_dans_machine(int somme);
    abstract Etat retirer_carte();
}
