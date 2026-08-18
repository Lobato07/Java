package poo1;

public class ex01 {
    public static void main(String[] args){
        Carro c1 = new Carro();
        c1.modelo = "Honda Civic";
        c1.cor = "Roxo";
        c1.status();
        c1.acelerar();
        
        System.out.println("-------------------------------------------------------");

        Carro c2 = new Carro();
        c2.modelo = "Toyota Corolla";
        c2.cor = "Prata";
        c2.ligar();
        c2.status();
        c2.acelerar();
    }
}
