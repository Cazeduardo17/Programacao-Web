package Questao1;

public class Carro {
    String nome;
    double peso;
    String fabricante;
    String cor;
    double valor;

    public Carro(String nome, double peso, String fabricante, String cor, double valor){
        this.nome = nome;
        this.peso = peso;
        this.fabricante = fabricante;
        this.cor = cor;
        this.valor = valor;
    }

    public void darDesconto(double desconto){
        valor = valor - desconto;
    }

    public void pintar(String novaCor){
        cor = novaCor;
    }
}
