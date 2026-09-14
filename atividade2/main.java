import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        List<Funcionario> funcionarios = controller.criarFuncionarios();
        controller.exibirFolhaPagamento(funcionarios);
    }
}