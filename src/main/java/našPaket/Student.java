package našPaket;

public class Student {

    String ime;
    String prezime;
    Adresa adresa;

    public Student(String ime, String prezime, Adresa adresa) {
        this.ime = ime;
        this.prezime = prezime;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", adresa=" + adresa +
                '}';
    }






}//end class
