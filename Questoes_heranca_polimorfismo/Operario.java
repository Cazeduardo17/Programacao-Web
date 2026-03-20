package Questoes_heranca_polimorfismo;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return valorProducao * comissao / 100;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + getComissao();
    }
}
