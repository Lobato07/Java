package lista01a.model;

public class Conta {
    
    private double saldo;
    private int id;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Conta(){
        
    }
    
    public Conta(double saldo, int id) {
        this.saldo = saldo;
        this.id = id;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(int saldo, int id){
        this.saldo = saldo;
        this.id = id;
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
        return "Bem vindo "+ id +"! Saldo atual: " + saldo;  
    }
 
}
