package lista01b.controller;
import lista01b.model.*;

public class FuncionarioController {
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        Funcionario f3 = new Funcionario("Rogerio", 1800.0);
        Funcionario f4 = new Funcionario("Fernando", 2300.0);

        Funcionario f5 = new Funcionario("Fabricio", 8001);
        Funcionario f6 = new Funcionario("Mauricio", 2627);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f6);
        System.out.println("---------------------------------------------------------------------------");

        f1.setName("Douglas");
        f1.setWage(7621);

        f2.setName("Richard");
        f2.setWage(500);

        f3.setName("Bento");
        f3.setWage(8500);

        f4.setName("Theodor");
        f4.setWage(6000);

        f5.setName("Julio");
        f5.setWage(3600);

        f6.setName("Antonella");
        f6.setWage(999);

        System.out.println("Funcionario: "+f1.getName()+ ", Salario: "+f1.getWage());
        System.out.println("Funcionario: "+f2.getName()+ ", Salario: "+f2.getWage());
        System.out.println("Funcionario: "+f3.getName()+ ", Salario: "+f3.getWage());
        System.out.println("Funcionario: "+f4.getName()+ ", Salario: "+f4.getWage());
        System.out.println("Funcionario: "+f5.getName()+ ", Salario: "+f5.getWage());
        System.out.println("Funcionario: "+f6.getName()+ ", Salario: "+f6.getWage());

    }
}
