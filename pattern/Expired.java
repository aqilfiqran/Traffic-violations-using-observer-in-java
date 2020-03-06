package pattern;

import java.util.Date;

public class Expired implements Display, Observer {
    private Date tax;

    public Expired(Cctv cctv) {
        cctv.registerObserver(this);
    }

    public void update(String name, String plat, Date tax) {
        this.tax = tax;
        display();
    }

    public void display() {
        StringBuffer show = new StringBuffer("Masa aktif stnk anda ");
        if (tax.before(new Date()))
            show.append("telah berakhir");
        else
            show.append("masih aman");
        System.out.println(show);
    }
}