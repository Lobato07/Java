package lista01.controller;
import lista01.model.*;

public class CarroController {
    
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

       Carro carro3 = new Carro(2018, "McLaren", "Senna");
       Carro carro4 = new Carro(1973, "Chevrolet", "Opala");

       Carro carro5 = new Carro("Ford", "Mustang");
       Carro carro6 = new Carro("Volkswagen", "Fusca");

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
        System.out.println(carro4);
        System.out.println(carro5);
        System.out.println(carro6);
        System.out.println("---------------------------------------------------------------------------");

        carro1.setMarca("Volkswagen");
        carro1.setModelo("Golf");
        carro1.setAnoFabricacao(2025);

        carro2.setMarca("Fiat");
        carro2.setModelo("Uno");
        carro2.setAnoFabricacao(2005);

        carro3.setMarca("McLaren");
        carro3.setModelo("Senna");
        carro3.setAnoFabricacao(2018);

        carro4.setMarca("Chevrolet");
        carro4.setModelo("Opala");
        carro4.setAnoFabricacao(1973);

        carro5.setMarca("Ford");
        carro5.setModelo("Mustang");

        carro6.setMarca("Volkswagen");
        carro6.setModelo("Fusca");

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
        System.out.println(carro4);
        System.out.println(carro5);
        System.out.println(carro6);
        System.out.println("---------------------------------------------------------------------------");
        
        System.out.println(carro1.getMarca() + " " + carro1.getModelo() + " " + carro1.getAnoFabricacao());
        System.out.println(carro2.getMarca() + " " + carro2.getModelo() + " " + carro2.getAnoFabricacao());
        System.out.println(carro3.getMarca() + " " + carro3.getModelo() + " " + carro3.getAnoFabricacao());
        System.out.println(carro4.getMarca() + " " + carro4.getModelo() + " " + carro4.getAnoFabricacao());
        System.out.println(carro5.getMarca() + " " + carro5.getModelo() + " " + carro5.getAnoFabricacao());
        System.out.println(carro6.getMarca() + " " + carro6.getModelo() + " " + carro6.getAnoFabricacao());
    }
}
