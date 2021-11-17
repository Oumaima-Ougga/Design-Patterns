import obs.ObservableImpl;
import obs.Observer;
import obs.ObserverImpl1;
import obs.ObserverImpl2;

public class Test {
    public static void main(String[] args) {
        ObservableImpl observable= new ObservableImpl();
        Observer obs1 = new ObserverImpl1();
        Observer obs2 = new ObserverImpl2();

        observable.addObserver(obs1);
        observable.addObserver(obs2);

        observable.setEtat(90);
        observable.setEtat(80);

        observable.removeObserver(obs1);

        observable.setEtat(74);
    }
}
