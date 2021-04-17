package br.edu.ifal.gqso;

public class Banco {
    private double saldo;
    
    public class ValorNegativo extends Exception{
        private static final long serialVersionUID = 1L;
    }

    public double saldo() {
        return this.saldo;
    }

    public void setSaldo(double valor) {
        this.saldo = valor;
    }

    public double deposito(double valor) throws ValorNegativo{
        if(valor < 0){
            throw new ValorNegativo();
        }
        setSaldo(saldo() + valor);
        return saldo();
    }

    public double saque(double valor){
        setSaldo(saldo() - valor);
        return saldo();
    }
}