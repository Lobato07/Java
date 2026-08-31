package lista01b.model;

public class funcionario {
    
    private String name;
    private double wage;

    public funcionario(){

    }

    public funcionario(String name, double wage){
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

    

}
