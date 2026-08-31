package lista01a.model;

public class Conta {
    
    private double saldo;

    public Conta(){

    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public Conta(int saldo){
        this.saldo = saldo;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }

    public void saca(double valor){
        if (valor > this.saldo){
            System.out.println("Saldo Insuficiente!");
        }
        else{
            this.saldo -= valor;
        }
    }

    public void atualiza(double taxa){
        this.saldo = saldo + (saldo * taxa);
    }

    @Override
    public String toString(){
        return "";
    }
 
}
