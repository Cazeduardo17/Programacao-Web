package Questao1;

public class Main{

    public static void main(String[] args){
        Carro carro1 = new Carro("Civic", 1300, "Honda", "Preto", 120000);

        System.out.println("Antes:");
        System.out.println("Preço: " + carro1.valor);
        System.out.println("Cor: " + carro1.cor);

        carro1.darDesconto(3000);
        carro1.pintar("Branco");

        System.out.println("\nDepois: ");
        System.out.println("Preço: " + carro1.valor);
        System.out.println("Cor: " + carro1.cor);
    }
}
