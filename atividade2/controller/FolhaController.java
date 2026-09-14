import java.util.ArrayList;
import java.util.List;

public class Controller {

    // Cria e retorna a lista de funcionários (um de cada tipo)
    public List<Funcionario> criarFuncionarios() {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Carlos", 2500.00));
        funcionarios.add(new Gerente("Ana", 4000.00, 1500.00));
        funcionarios.add(new Vendedor("Bruno", 2000.00, 800.00));

        return funcionarios;
    }

    // Exibe nome e salário de cada funcionário
    public void exibirFolhaPagamento(List<Funcionario> funcionarios) {
        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome() + " | Salário: R$ " + f.calcularSalario());
        }
    }
}