package Employee;

import IGR.Pays;

public class Employee {
    private String cin ;
    private float salaireBrutMensuel;
    private Pays pays;

    public Employee(){

    }
    public Employee(String cin, float salaireBrutMensuel) {
        this.cin = cin;
        this.salaireBrutMensuel = salaireBrutMensuel;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }
    public float getSalaireBrutMensuel() {
        return salaireBrutMensuel;
    }

    public void setSalaireBrutMensuel(float salaireBrutMensuel) {
        this.salaireBrutMensuel = salaireBrutMensuel;
    }
    public float getSalaireNetMensuel(){
        float IGR=pays.calculIGR(salaireBrutMensuel);
        return (this.salaireBrutMensuel*12-IGR)/12;
    }
}
