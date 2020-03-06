package pattern;

import java.util.Date;

public class Identity implements Display, Observer {
    private String name;
    private String plat;

    public Identity(Cctv cctv) {
        cctv.registerObserver(this);
    }

    public void update(String name, String plat, Date tax) {
        this.name = name;
        this.plat = plat;
        display();
    }

    public void display() {
        System.out.println("Nama : " + this.name + "\nPlat : " + this.plat);
    }

}