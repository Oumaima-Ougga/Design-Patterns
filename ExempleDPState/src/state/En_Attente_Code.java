package state;

public class En_Attente_Code extends Etat {
    int essai;

    public En_Attente_Code(Distributeur dist)
    {
        super(dist);
        essai=0;
    }

    public Etat inserer_carte(Carte c)
    {
        System.out.println("Une carte est deja insérée. Nouvelle carte refusée.");
        return this;
    }

    public Etat entrer_code(int code)
    {
        if(distributeur.getCarte().is_pin_good(code))
        {
            System.out.println("Code bon.");
            return distributeur.op;
        }
        else
        {
            distributeur.getCarte().failed_code();
            if(distributeur.getCarte().getfailed_try()>=3)
            {
                System.out.println("Trois tentatives de code infructueuses. Carte avalée.");
                distributeur.setCarte(null);
                return distributeur.ca;
            }
        }
        return this;
    }

    public Etat retirer_argent(int somme)
    {
        System.out.println("Veuillez entrer le code de la carte avant de retirer de l'argent.");
        return this;
    }

    public Etat consulter_solde()
    {
        System.out.println("Veuillez entrer le code de la carte avant de consulter votre solde.");
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
        return "Attente de code";
    }
}
