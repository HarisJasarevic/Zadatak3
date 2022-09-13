package našPaket;

public class Adresa {

    String ulica;
    int broj;
    String grad;
    String država;

    public Adresa(String ulica, int broj, String grad, String država) {
        this.ulica = ulica;
        this.broj = broj;
        this.grad = grad;
        this.država = država;
    }

    @Override
    public String toString() {
        return "Adresa{" +
                "ulica='" + ulica + '\'' +
                ", broj=" + broj +
                ", grad='" + grad + '\'' +
                ", država='" + država + '\'' +
                '}';
    }







}//end class
