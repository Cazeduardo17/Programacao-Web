package Questao2;

public class Main {
        public static void main(String[] args) {

            CartaoCredito cartao = new CartaoCredito("Carlos", 2000);

            cartao.realizaCompra(500);
            cartao.realizaCompra(300);
            cartao.realizaCompra(1500); // pode ultrapassar o limite

            cartao.aumentaLimite(1000);

            cartao.realizaCompra(1500);

            cartao.imprimeFatura();
        }
}

