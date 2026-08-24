package exemplo1.controller;
import exemplo1.model.*;

public class CanetaController{
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.setMarca("Bic");
        c1.setCor("Azul");
        c1.setPonta(5.0f);
        c1.setCarga(100);
        c1.setTampada(false);

        Caneta c2 = new Caneta();
        c2.setMarca("MonteGrapa");
        c2.setCor("Preta");
        c2.setPonta(2.5f);
        c2.setCarga(0);
        c2.setTampada(true);


        System.out.println("Marca: " + c1.getMarca());
        System.out.println("Cor: "+c1.getCor());
        System.out.println("Ponta: "+c1.getPonta());
        System.out.println("Carga: "+c1.getCarga());
        c1.canetatampada();

        System.out.println("-------------------------------------------------------");

        System.out.println("Marca: " + c2.getMarca());
        System.out.println("Cor: "+c2.getCor());
        System.out.println("Ponta: "+c2.getPonta());
        System.out.println("Carga: "+c2.getCarga());
        c2.tampar();
        c2.canetatampada();
    }
}   