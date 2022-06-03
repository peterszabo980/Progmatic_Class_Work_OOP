package hu.progmatic.OOP_20220521;

public class Donto {
    private RomaiSorszam ssz;
    private String datum;
    private String gyoztes;
    private String eredmeny;
    private String vesztes;
    private String helyszin;
    private String varosAllam;
    private Integer nezoszam;

    public Donto() {
    }

    public Donto(RomaiSorszam ssz, String datum, String gyoztes, String eredmeny, String vesztes, String helyszin, String varosAllam, Integer nezoszam) {
        this.ssz = ssz;
        this.datum = datum;
        this.gyoztes = gyoztes;
        this.eredmeny = eredmeny;
        this.vesztes = vesztes;
        this.helyszin = helyszin;
        this.varosAllam = varosAllam;
        this.nezoszam = nezoszam;
    }

    public RomaiSorszam getSsz() {
        return ssz;
    }

    public void setSsz(RomaiSorszam ssz) {
        this.ssz = ssz;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getGyoztes() {
        return gyoztes;
    }

    public void setGyoztes(String gyoztes) {
        this.gyoztes = gyoztes;
    }

    public String getEredmeny() {
        return eredmeny;
    }

    public void setEredmeny(String eredmeny) {
        this.eredmeny = eredmeny;
    }

    public String getVesztes() {
        return vesztes;
    }

    public void setVesztes(String vesztes) {
        this.vesztes = vesztes;
    }

    public String getHelyszin() {
        return helyszin;
    }

    public void setHelyszin(String helyszin) {
        this.helyszin = helyszin;
    }

    public String getVarosAllam() {
        return varosAllam;
    }

    public void setVarosAllam(String varosAllam) {
        this.varosAllam = varosAllam;
    }

    public Integer getNezoszam() {
        return nezoszam;
    }

    public void setNezoszam(Integer nezoszam) {
        this.nezoszam = nezoszam;
    }
}
