package Questoes_heranca_polimorfismo;

public class Main {
    public static void main(String[] args){
        //Questao 1
        System.out.println("Questao 1");
        Pessoa p1 = new Pessoa();
        p1.setNome("Jorge");
        p1.setEndereco("Rua das flores");
        p1.setTelefone("(85) 9 9898-9898");

        System.out.println("Pessoa 1: ");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Endereço: " + p1.getEndereco());
        System.out.println("Telefone: " + p1.getTelefone());

        Pessoa p2 = new Pessoa("Maria");

        System.out.println("\nPessoa 2:");
        System.out.println("Nome: " + p2.getNome());

        Pessoa p3 = new Pessoa("Carlos", "Rua das fontes, 508", "(85) 9 9999-8888");

        System.out.println("\nPessoa 3:");
        System.out.println("Nome: " + p3.getNome());
        System.out.println("Endereço: " + p3.getEndereco());
        System.out.println("Telefone: " + p3.getTelefone());

        //Questao 2
        System.out.println("\n\nQuestao 2");
        Fornecedor f = new Fornecedor("Carlos", 500, 200);

        System.out.println("Valor de crédito: " + f.getValorCredito());
        System.out.println("Valor de dívida: " + f.getValorDivida());
        System.out.println("Saldo fornecedor: " + f.obterSaldo());

        //Questao 3
        System.out.println("\n\nQuestao 3");
        Empregado e = new Empregado("Jorge", 2000, 10);

        System.out.println("Salário base: " + e.getSalarioBase());
        System.out.println("Porcentagem do imposto: " + e.getImposto());
        System.out.println("Salário empregado: " + e.calcularSalario());

        //Questao 4
        System.out.println("\n\nQuestao 4");
        Administrador a = new Administrador();
        a.setNome("Carlos");
        a.setSalarioBase(2500);
        a.setImposto(10);
        a.setAjudaCusto(500);

        System.out.println("Salário administrador: " + a.calcularSalario());

        //Questao 5
        System.out.println("\n\nQuestao 5");
        Operario o = new Operario();
        o.setNome("Carlos");
        o.setSalarioBase(2000);
        o.setImposto(5);
        o.setValorProducao(1500);
        o.setComissao(10);

        System.out.println("Salário operário: " + o.calcularSalario());

        //Questao 6
        System.out.println("\n\nQuestao 6");
        Vendedor v = new Vendedor();
        v.setNome("Carlos");
        v.setSalarioBase(1500);
        v.setImposto(5);
        v.setValorVendas(5000);
        v.setComissao(5);

        System.out.println("Salário do vendedor: " + v.calcularSalario());
    }
}
