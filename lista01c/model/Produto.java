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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "-["+ id +"]Produto: "+ nome + "\n-Descricao: " + descricao + "\n-Valor: " + valor + "\n-Estoque: "+ estoque;
    }

}
