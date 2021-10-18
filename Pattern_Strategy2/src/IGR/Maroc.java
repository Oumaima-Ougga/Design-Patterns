package IGR;

public class Maroc implements Pays{

    @Override
    public float calculIGR(float salaireBrutMensuel) {
        if(salaireBrutMensuel*12<40000){
            float taux= 5;
            return (salaireBrutMensuel*12*taux)/100;
        }else if(salaireBrutMensuel*12>=40000 && salaireBrutMensuel*12<=120000 ){
            float taux= 20;
            return (salaireBrutMensuel*12*taux)/100;
        }else if(salaireBrutMensuel*12>120000){
            float taux= 42;
            return (salaireBrutMensuel*12*taux)/100;
        }
        return 0;
    }
}
