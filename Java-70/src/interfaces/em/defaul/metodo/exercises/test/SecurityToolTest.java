package interfaces.em.defaul.metodo.exercises.test;

import interfaces.em.defaul.metodo.exercises.domain.PortScanner;
import interfaces.em.defaul.metodo.exercises.domain.WebScanner;

public class SecurityToolTest {
    public static void main(String[] args) {
        PortScanner portScanner =  new PortScanner();
        WebScanner webScanner = new WebScanner();

        portScanner.execute();
        webScanner.execute();

        portScanner.showBanner();
        webScanner.showBanner();

        System.out.println(portScanner.getName());
        System.out.println(webScanner.getName());
    }
}
