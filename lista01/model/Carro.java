package lista01.model;

public class Carro {

    private String marca;
    private String modelo;
    private int anoFabricacao;

    public Carro(){
        
    }

    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public Carro(int anoFabricacao, String marca, String modelo) {
        this.anoFabricacao = anoFabricacao;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString(){
        return "Carro [Marca = " + marca + ", Modelo = " + modelo + ", Ano = " + anoFabricacao + " ]";
    }

}
