package lista01c.model;

public class Produto {
    
    private String nome;
    private String descricao;
    private double valor;
    private int estoque;
    private int id;

    public Produto(){

    }

    public Produto(String nome, String descricao, Double valor, int estoque, int id){

        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
        this.id = id;

    }

    public Produto(String nome, String descricao, int valor, int estoque, int id){

        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
        this.id = id;

    }

}
