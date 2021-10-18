import comp.Component;
import comp.Composite;
import comp.File;

public class Program {

    public static void main(String[] args) {
        Component D1 = new Composite("Dossier racine");
        ((Composite) D1).addComponent(new File("E1"));
        Component D2 = new Composite("D2");
        ((Composite) D1).addComponent(D2);
        ((Composite) D2).addComponent(new File("E2"));
        ((Composite) D2).addComponent(new File("E3"));

        D1.show();

    }
}
