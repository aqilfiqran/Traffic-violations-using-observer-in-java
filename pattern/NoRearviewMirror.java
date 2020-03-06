package pattern;

public class NoRearviewMirror extends Foul {
    private Cctv cctv;

    public NoRearviewMirror(Cctv cctv) {
        this.cctv = cctv;
    }

    public String toString() {
        if (cctv.toString().indexOf("spion") >= 0)
            return cctv.toString();
        if (cctv.toString().indexOf("tidak ada") >= 0)
            return "Pelanggaran lainnya : tidak punya spion";
        return cctv + ", tidak punya spion";
    }
}