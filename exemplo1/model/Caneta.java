package exemplo1.model;

public class Caneta {

    private String marca;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;

    public Caneta(){

    }

    public Caneta(String marca, String cor, float ponta, int carga, boolean tampada) {
        this.marca = marca;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }
   

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    } 

    public void canetatampada(){
        if (this.tampada == true){
            System.out.println("A caneta esta tampada!");
        }
        else{
            System.out.println("A caneta esta destampada!");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}

