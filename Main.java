import pattern.*;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String args[]) throws Exception {
        Cctv cctv = new Cctv();
        new Identity(cctv);
        new Expired(cctv);
        cctv.setSensor("Aqil Fiqran Dzi'Ul Haq", "BL 2012 J", new SimpleDateFormat("yyyy-MM-dd").parse("2019-02-02"));
        cctv = new NoRearviewMirror(cctv);
        cctv = new NoHelmet(cctv);
        System.out.println(cctv);
    }
}