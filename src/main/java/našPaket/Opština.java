package našPaket;

public class Opština {

    Adresa adresa;

    public Adresa setAdresa(String grad) {
        if (grad.equalsIgnoreCase("Bg")) {
            adresa = new Adresa("Sarajevska", 50, "Beograd", "Srbija");
        } else if (grad.equalsIgnoreCase("Sa")) {
            adresa = new Adresa("Petra Đokića", 50, "Sarajevo", "BIH");
        }
        return adresa;
    }

    public static void waitForSomeTime() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
    }







}//end class
