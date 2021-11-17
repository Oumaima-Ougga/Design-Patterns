package state;

public class En_Attente_Operation extends Etat{
    public En_Attente_Operation(Distributeur dist)
    {
        super(dist);
    }

    public Etat inserer_carte(Carte c)
    {
        System.out.println("Une carte est deja insérée. Nouvelle carte refusée.");
        return this;
    }

    public Etat entrer_code(int code)
    {
        System.out.println("Le code de la carte présente a déjà été accepté.");
        return this;
    }

    public Etat retirer_argent(int somme)
    {
        if(distributeur.getFonds() >=somme)
        {
            distributeur.subFonds(somme);
            System.out.println("Argent distribué. En attente de nouvelle opération.");
        }
        else
        {
            distributeur.subFonds(distributeur.getFonds());
            System.out.println("Fonds insuffisants dans la machine. Distribution partielle réalisée.");
        }

        if(distributeur.getFonds()==0)
        {
            System.out.println("Machine vide. Carte restituée");
            distributeur.setCarte(null);
            return distributeur.vi;
        }
        return this;
    }

    public Etat consulter_solde()
    {
        System.out.println("Affichage du solde client.");
        return this;
    }

    public Etat ajouter_argent_dans_machine(int somme)
    {
        System.out.println("Ajout d'argent impossible: carte présente dans le distributeur");
        return this;
    }

    public Etat retirer_carte()
    {
        System.out.println("Carte restituée");
        return distributeur.ca;
    }

    public String toString()
    {
        return "Attente d'opération";
    }
}
