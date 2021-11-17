package state;

public class En_Attente_Carte extends Etat{
    public En_Attente_Carte(Distributeur dist) {
        super(dist);
    }

    public Etat inserer_carte(Carte c)
    {
        this.distributeur.setCarte(c);
        System.out.println("Carte insérée.");
        return distributeur.co;
    }

    public Etat entrer_code(int code)
    {
        System.out.println("Veuillez inserer une carte avant de taper un code.");
        return this;
    }

    public Etat retirer_argent(int somme)
    {
        System.out.println("Veuillez inserer une carte avant de retirer de l'argent.");
        return this;
    }

    public Etat consulter_solde()
    {
        System.out.println("Veuillez inserer une carte avant de consulter votre solde.");
        return this;
    }

    public Etat ajouter_argent_dans_machine(int somme)
    {
        System.out.println("Ajout d'argent dans la machine.");
        distributeur.addFonds(somme);
        return this;
    }

    public Etat retirer_carte()
    {
        System.out.println("Impossible de retirer la carte: pas de carte dans le distributeur");
        return this;
    }

    public String toString()
    {
        return "Attente de carte";
    }
}
