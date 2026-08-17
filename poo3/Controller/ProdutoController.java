package poo3.Controller;
import poo3.Model.*;

public class ProdutoController {
    public static void main(String[] args){
        Produto produto1 = new Produto();

        produto1.setNome("Geladeira");
        produto1.setValor(800.0);
        produto1.setEstoque(5);

        Produto produto2 = new Produto();

        produto2.setNome("Fogao");
        produto2.setValor(500.0);
        produto2.setEstoque(4);

        System.out.println("Produto: "+produto1.getNome());
        System.out.println("Valor: "+produto1.getValor());
        System.out.println("Estoque: "+produto1.getEstoque());

        System.out.println("--------------------------");

        System.out.println("Produto: "+produto2.getNome());
        System.out.println("Valor: "+produto2.getValor());
        System.out.println("Estoque: "+produto2.getEstoque());
    }
}
