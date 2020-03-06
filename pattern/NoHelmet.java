package pattern;

public class NoHelmet extends Foul {
    private Cctv cctv;

    public NoHelmet(Cctv cctv) {
        this.cctv = cctv;
    }

    public String toString() {
        if (cctv.toString().indexOf("helm") >= 0)
            return cctv.toString();
        else if (cctv.toString().indexOf("tidak ada") >= 0)
            return "Pelanggaran lainnya : tidak memakai helm";
        return cctv + ", tidak memakai helm";
    }
}