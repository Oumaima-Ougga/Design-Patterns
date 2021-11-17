package state;

public class Distributeur {
    public final En_Attente_Operation op;
    public final En_Attente_Carte ca;
    public final En_Attente_Code co;
    public final Machine_Vide vi;

    //L'état courant de la machine
    private Etat etat;

    private Carte c;
    private int fonds;

    public Distributeur(int fond_initial)
    {
        op=new En_Attente_Operation(this);
        ca=new En_Attente_Carte(this);
        co=new En_Attente_Code(this);
        vi=new Machine_Vide(this);
        fonds=fond_initial;
        etat=ca;
        c=null;
    }

    public void inserer_carte(Carte c) {etat=etat.inserer_carte(c); System.out.println(this);}
    public void entrer_code(int code) {etat=etat.entrer_code(code); System.out.println(this);}
    public void retirer_argent(int somme) {etat=etat.retirer_argent(somme); System.out.println(this);}
    public void consulter_solde() {etat=etat.consulter_solde(); System.out.println(this);}
    public void ajouter_argent_dans_machine(int somme) {etat=etat.ajouter_argent_dans_machine(somme); System.out.println(this);}
    public void retirer_carte() {etat=etat.retirer_carte(); System.out.println(this);}

    public void addFonds(int s) {fonds+=s;} //Ici, il faudrait protéger ces fonctions pour que seuls les états puissent les appeler
    public void subFonds(int s) {fonds-=s;}
    public int getFonds() {return fonds;}
    public void setCarte(Carte cb) {c=cb;}
    public Carte getCarte() {return c;}
    public Etat getState() {return etat;}

    @Override
    public String toString()
    {
        return ("Distributeur en mode "+etat);
    }

}
