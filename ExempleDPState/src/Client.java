import state.Carte;
import state.Distributeur;

public class Client {
    public static void main(String[] args) {
        Distributeur d = new Distributeur(2000);

        Carte c = new Carte(0505);

        d.inserer_carte(c);
        d.entrer_code(0202);
        d.entrer_code(0303);
        d.entrer_code(0505);
        d.inserer_carte(c);
        d.entrer_code(0303);
        d.retirer_argent(2050);
        d.retirer_carte();
        d.ajouter_argent_dans_machine(5000);

    }
}
