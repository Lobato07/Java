package lista01b.model;

public class Funcionario {
    
    private String name;
    private double wage;
    private int id;

    public Funcionario(){

    }

    public Funcionario(String name, double wage, int id){
        this.name = name;
        this.wage = wage;
        this.id = id;
    }

    public Funcionario(String name, int wage, int id){
    this.name = name;
    this.wage = wage;
    this.id = id;
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

    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
        return "Funcionario["+id+"]: "+name+", Salario: "+wage;
    }

}
