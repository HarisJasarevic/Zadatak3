package našPaket;

public class Profesor {

    String ime;
    String prezime;
    Adresa adresa;

    public Profesor(String ime, String prezime, Adresa adresa) {
        this.ime = ime;
        this.prezime = prezime;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", adresa=" + adresa +
                '}';
    }






}//end class
