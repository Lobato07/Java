package poo2.Model;

public class ContaB {

    private String dono;
    private float saldo;

    public ContaB(String dono, float saldo) {
        this.dono = dono;
        this.saldo = saldo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void sacardinheiro(float qtd){
        if (qtd > this.saldo){
            System.out.println("Saldo Insuficiente");
        }
        else{
            System.out.println("Saque realizado com sucesso!");
            this.saldo -= qtd;
            System.out.println(this.saldo);
        }
    }

}