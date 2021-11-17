package state;
public class Machine_Vide extends Etat
{
    public Machine_Vide(Distributeur dist)
    {
        super(dist);
    }

    public Etat inserer_carte(Carte c)
    {
        System.out.println("La machine est vide. Nouvelle carte refusée.");
        return this;
    }

    public Etat entrer_code(int code)
    {
        System.out.println("Aucune carte insérée. Impossible d'entrer un code");
        return this;
    }

    public Etat retirer_argent(int somme)
    {
        System.out.println("Aucune carte insérée. Impossible de retirer de l'argent.");
        return this;
    }

    public Etat consulter_solde()
    {
        System.out.println("Aucune carte insérée. Impossible d'afficher le solde.");
        return this;
    }

    public Etat ajouter_argent_dans_machine(int somme)
    {
        if(somme>0)
        {
            distributeur.addFonds(somme);
            return distributeur.ca;
        }
        return this;
    }

    public Etat retirer_carte()
    {
        System.out.println("Impossible de retirer la carte: pas de carte dans le distributeur");
        return this;
    }

    public String toString()
    {
        return "Machine vide";
    }
}
