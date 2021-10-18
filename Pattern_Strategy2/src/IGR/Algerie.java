package IGR;

public class Algerie implements Pays{
    @Override
    public float calculIGR(float salaireBrutMensuel) {
        float taux = 35;
        return (salaireBrutMensuel*12*taux)/100;
    }
}
