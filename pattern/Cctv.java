package pattern;

import java.util.Date;
import java.util.ArrayList;

public class Cctv implements Subject {
    private ArrayList<Observer> observers;
    private String name;
    private String plat;
    private Date tax;

    public Cctv() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        if (observers.indexOf(o) >= 0)
            observers.remove(observers.indexOf(o));

    }

    public void notifyObservers() {
        for (Observer ob : observers)
            ob.update(name, plat, tax);
    }

    public void sensorChanged() {
        notifyObservers();
    }

    public void setSensor(String name, String plat, Date tax) {
        this.name = name;
        this.plat = plat;
        this.tax = tax;
        sensorChanged();
    }

    public String toString() {
        return "pelanggaran lainnya : tidak ada";
    }

}