package lista01.controller;
import lista01.model.*;

public class CarroController {
    
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.setMarca("Volkswagen");
        carro1.setModelo("Golf");
        carro1.setAnoFabricacao(2025);

       carro2.setMarca("Fiat");
       carro2.setModelo("Uno");
       carro2.setAnoFabricacao(2005);

    }
}
