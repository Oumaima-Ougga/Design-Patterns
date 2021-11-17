package obs;

public class ObserverImpl1 implements Observer{
    @Override
    public void updateObservable(Observable obs) {
        int nouvelEtat =((ObservableImpl)obs).getEtat();
        System.out.println("Observer 1 a reçu la nouvelle valeur de état :"+nouvelEtat);
    }
}
