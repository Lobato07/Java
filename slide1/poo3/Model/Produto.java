package poo3.Model;

public class Produto {
    
    private String nome;
    private double valor;
    private int estoque;

    // serve pra settar normalmente
    public Produto(){
    }

    // Constructor (inline la maluco)
    public Produto(String nome, double valor, int estoque) {
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }
    
    // usar ctrl + . para usar o generate #ValeuYan

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }

    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
    public int getEstoque(){
        return this.estoque;
    }    
}
