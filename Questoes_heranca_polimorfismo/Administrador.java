package Questoes_heranca_polimorfismo;

public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public double getAjudaCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaCusto(double ajudaCusto) {
        this.ajudaDeCusto = ajudaCusto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }
}
