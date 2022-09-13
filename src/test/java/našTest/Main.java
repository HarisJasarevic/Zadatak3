package našTest;

import našPaket.Adresa;
import našPaket.Opština;
import našPaket.Profesor;
import našPaket.Student;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {

        //Opština.waitForSomeTime();

        int niz[] = {1, 2, 3};
        try {
            //new ChromeDriver().findElement();
            System.out.println(niz[5]);
        }catch (NoSuchElementException e) {
            e.printStackTrace();
            e.getMessage();
        }catch (StaleElementReferenceException e) {
            //new ChromeDriver().findElement();
            e.printStackTrace();
        }catch (Exception ex) {
            ex.getMessage();
            ex.printStackTrace();
        }

        System.out.println("Moj ispis");












//        Adresa adresa = new Adresa("Sarajevska", 50, "Beograd", "Srbija");
//
//        Opština opština = new Opština();
//
//        Student student = new Student("Pera", "Perić", opština.setAdresa("Bg"));
//        Profesor profesor = new Profesor("Žika", "Žikić", adresa);
//
//        System.out.println(student);
//        System.out.println(profesor);
//
    }





}//end class
