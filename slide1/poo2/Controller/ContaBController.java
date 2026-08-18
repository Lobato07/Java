package poo2.Controller;
import poo2.Model.*;

public class ContaBController{

    public static void main(String[] args){
        ContaB cliente1 = new ContaB("Caio", 500);
        System.out.println(cliente1.getDono());
        System.out.println(cliente1.getSaldo());
        cliente1.sacardinheiro(50);

        System.out.println("-------------");

        ContaB cliente2 = new ContaB("Yan", 0);
        System.out.println((cliente2.getDono()));
        System.out.println(cliente2.getSaldo());
        cliente2.sacardinheiro(20);
    }
}