package advanced.br.com.fiap.model;

import advanced.br.com.fiap.enums.TipoConta;

public abstract class Conta {
    private int numeroConta;
    private String nomeCliente;
    private double saldo;
    private TipoConta tipo;

    public String sacar(double valor){
        if(saldo < valor){
            throw new SaldoInsuficienteException("Não há saldo suficiente para essa transacao");
        }
        saldo += valor;
        return String.format("Você sacou: R$%.2f\nNovo Saldo: R$%.2f", valor, saldo);
    }

    public String depositar(double valor){
        saldo += valor;
        return String.format("Você depositou: R$%.2f\nNovo Saldo: R$%.2f", valor, saldo);
    }
}
