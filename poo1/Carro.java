package poo1;

public class Carro {
    String modelo;
    String cor;
    boolean ligado;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("O carro esta ligado? " + this.ligado);
    }

    void acelerar(){
        if (this.ligado == true){
            System.out.println("Voce acelerou o carro!");
        }
        else{
            System.out.println("Voce deve ligar o carro primeiro!");
        }
    }

    void ligar(){
        this.ligado = true;
    }

    void desligar(){
        this.ligado = false;
    }
}
