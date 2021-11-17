package obs;

public class ObserverImpl2 implements Observer{
    @Override
    public void updateObservable(Observable obs) {
        int nouvelEtat=((ObservableImpl)obs).getEtat();
        System.out.println("Observer 2 Mise à jour avec état:"+nouvelEtat);
    }
}
