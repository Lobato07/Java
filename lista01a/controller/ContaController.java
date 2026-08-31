package lista01a.controller;
import lista01a.model.*;

public class ContaController {
    public static void main(String[] args) {
        
    
    Conta conta1 = new Conta();
    Conta conta2 = new Conta();

    Conta conta3 = new Conta(200.0, 3);
    Conta conta4 = new Conta(50.0, 4);

    Conta conta5 = new Conta(800, 5);
    Conta conta6 = new Conta(323, 6);

    System.out.println(conta1);
    System.out.println(conta2);
    System.out.println(conta3);
    System.out.println(conta4);
    System.out.println(conta5);
    System.out.println(conta6);
    System.out.println("---------------------------------------------------------------------------");

    conta1.setId(1);
    conta1.setSaldo(1000);

    conta2.setId(2);
    conta2.setSaldo(10);

    conta3.setSaldo(12);
    conta4.setSaldo(25);
    conta5.setSaldo(616);
    conta6.setSaldo(12.625);

    System.out.println(conta1.getId() + " " + conta1.getSaldo());
    System.out.println(conta2.getId() + " " + conta2.getSaldo());
    System.out.println(conta3.getId() + " " + conta3.getSaldo());
    System.out.println(conta4.getId() + " " + conta4.getSaldo());
    System.out.println(conta5.getId() + " " + conta5.getSaldo());
    System.out.println(conta6.getId() + " " + conta6.getSaldo());
    System.out.println("---------------------------------------------------------------------------");

    }
}
