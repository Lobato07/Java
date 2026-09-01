package lista01c.controller;
import java.util.ArrayList;
import java.util.List;
import lista01c.model.*;

public class ProdutoController {
    public static void main(String[] args) {
        
        Produto p1 = new Produto();
        Produto p2 = new Produto();

        Produto p3 = new Produto("Teclado", "Mecânico RGB", 250.0, 10, 3);
        Produto p4 = new Produto("Mouse", "Sem fio", 120.0, 20, 4);

        Produto p5 = new Produto("Monitor", "24 polegadas", 800, 5, 5);
        Produto p6 = new Produto("Headset", "Com microfone", 150, 15, 6);

        List<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);
        listaProdutos.add(p4);
        listaProdutos.add(p5);
        listaProdutos.add(p6);

        for (Produto p: listaProdutos){
            System.out.println(p);
            System.out.println("------------------------------");
        }

        p1.setId(1);
        p1.setNome("Mousepad");
        p1.setDescricao("90 cm");
        p1.setValor(80);
        p1.setEstoque(30);

        p2.setId(2);
        p2.setNome("Webcam");
        p2.setDescricao("1080p 60fps");
        p2.setValor(120);
        p2.setEstoque(9);

        p3.setId(3);
        p3.setNome("Fitro de linha");
        p3.setDescricao("Com NoBreak");
        p3.setValor(150);
        p3.setEstoque(3);

        p4.setId(4);
        p4.setNome("Mousepad");
        p4.setDescricao("90 cm");
        p4.setValor(80);
        p4.setEstoque(30);

        p5.setId(5);
        p5.setNome("Braço articulado");
        p5.setDescricao("Apenas um monitor");
        p5.setValor(99.99);
        p5.setEstoque(5);

        p6.setId(6);
        p6.setNome("Controle");
        p6.setDescricao("Wireless");
        p6.setValor(160.0);
        p6.setEstoque(20);
        
        for (Produto p: listaProdutos){
            System.out.println("-[" + p.getId() + "]: " + p.getNome() + "\n-Descricao: " + p.getDescricao() + "\n-Valor: " + p.getValor() + "\n-Estoque: " + p.getEstoque() );
            System.out.println("------------------------------");
        }

    }
}
