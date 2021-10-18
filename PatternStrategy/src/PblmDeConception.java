import Comportement.ComportementArcEtFleches;
import Comportement.ComportementHache;
import Comportement.ComportementPoignard;
import Personne.*;

public class PblmDeConception {
    public static void main(String[] args) {
        Personnage pers1 = new Roi();
        Personnage pers2 = new Reine();
        Personnage pers3 = new Troll();
        Personnage pers4 = new Chevalier();

        pers1.setArme(new ComportementArcEtFleches());
        pers2.setArme(new ComportementHache());
        pers3.setArme(new ComportementPoignard());
        pers4.setArme(new ComportementArcEtFleches());

        System.out.println("Appliquer le pattern strategy :");
        System.out.println("1er personner :");
        pers1.combattre();
        System.out.println("2eme personner :");
        pers2.combattre();
        System.out.println("3eme personner :");
        pers3.combattre();
        System.out.println("4eme personner :");
        pers4.combattre();

    }
}
