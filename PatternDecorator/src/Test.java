import Deco.Chocolat;
import Deco.Vanille;
import composants.Boisson;
import composants.Espresso;
import composants.Sumatra;

public class Test {
    public static void main(String[] args) {
        Boisson b1=new Espresso();
        System.out.println(b1.getDescription()+" DH "+b1.cout());
        Boisson b2=new Sumatra();
        b2=new Vanille(b2);
        b2=new Chocolat(b2);
        b2=new Chocolat(b2);
        System.out.println(b2.getDescription()+" DH "+b2.cout());
    }
}
