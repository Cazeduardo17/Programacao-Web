package Questao2;

public class CartaoCredito {

    double limite;
    double saldoFatura;
    String nomeCliente;

    public CartaoCredito(String nomeCliente, double limite) {
        this.nomeCliente = nomeCliente;
        this.limite = limite;
        this.saldoFatura = 0;
    }

    public void aumentaLimite(double valor) {
        limite = limite + valor;
    }

    public void diminuiLimite(double valor) {
        limite = limite - valor;
    }

    public void realizaCompra(double valor) {
        if (saldoFatura + valor <= limite) {
            saldoFatura = saldoFatura + valor;
            System.out.println("Compra realizada!");
        } else {
            System.out.println("Compra negada! Limite atingido.");
        }
    }

    public void imprimeFatura() {
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Saldo da fatura: R$ " + saldoFatura);
        System.out.println("Limite do cartão: R$ " + limite);
    }
}