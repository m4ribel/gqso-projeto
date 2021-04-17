package br.edu.ifal.gqso;

public class Banco {
    private double saldo;
    
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double valor) {
        this.saldo = valor;
    }

    public double deposito(double valor){
        setSaldo(getSaldo() + valor);
        return 0;
    }
}