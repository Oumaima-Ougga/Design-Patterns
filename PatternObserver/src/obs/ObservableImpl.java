package obs;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable{
    private List<Observer> observers=new ArrayList<>();
    private int etat;

    @Override
    public void addObserver(Observer obs) {
         observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
          observers.remove(obs);
    }

    @Override
    public void notifyObserver() {
        for(Observer o:observers){
            o.updateObservable(this);
    }}

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
        notifyObserver();
    }
}
