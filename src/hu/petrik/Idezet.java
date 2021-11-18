package hu.petrik;

public class Idezet {
    private String szerzo;
    private String idezet;

    public Idezet(String szero, String idezet) {
        this.szerzo = szero;
        this.idezet = idezet;
    }

    public String getSzero() {
        return szerzo;
    }

    public String getIdezet() {
        return idezet;
    }

    @Override
    public String toString() {
        return szerzo + "\t" + idezet;
    }
}
