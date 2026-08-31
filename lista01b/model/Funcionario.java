package lista01b.model;

public class Funcionario {
    
    private String name;
    private double wage;

    public Funcionario(){

    }

    public Funcionario(String name, double wage){
        this.name = name;
        this.wage = wage;
    }

    public Funcionario(String name, int wage){
    this.name = name;
    this.wage = wage;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString(){
        return "Funcionario: "+name+", Salario: "+wage;
    }

}
