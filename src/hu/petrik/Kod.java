package hu.petrik;

public class Kod {
    private String betu;
    private String kod;

    public Kod(String betu, String kod) {
        this.betu = betu;
        this.kod = kod;
    }

    public String getBetu() {
        return betu;
    }

    public String getKod() {
        return kod;
    }

    @Override
    public String toString() {
        return betu + "\t" + kod;
    }
}

