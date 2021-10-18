import Employee.Employee;
import IGR.Algerie;
import IGR.Maroc;
import IGR.Pays;

import javax.xml.transform.stream.StreamSource;

public class App {
    public static void main(String[] args) {
        Employee e1 = new Employee("1", 11000);
        e1.setPays(new Maroc());
        System.out.println("Employé au Maroc :");
        System.out.println(" Salaire Brut mensuel :"+e1.getSalaireBrutMensuel());
        System.out.println(" Salaire Net Mensuel après calcul: "+e1.getSalaireNetMensuel());
        Employee e2 = new Employee("2", 1100);
        e2.setPays(new Algerie());
        System.out.println("Employé en Algerie :");
        System.out.println(" Salaire Brut mensuel :"+e1.getSalaireBrutMensuel());
        System.out.println(" Salaire Net Mensuel après calcul: "+e2.getSalaireNetMensuel());

    }
}
