package model;

public class Financiamento {
    private double valorImovel;
    private double entrada;
    private int prazo;
    private double taxaJuros;

    public Financiamento(double valorImovel, double entrada, int prazo, double taxaJuros) {
        this.valorImovel = valorImovel;
        this.entrada = entrada;
        this.prazo = prazo;
        this.taxaJuros = taxaJuros;
    }

    public double calcularPrestacao() {
        double valorFinanciado = valorImovel - entrada;
        double jurosMensal = taxaJuros / 100 / 12;
        return (valorFinanciado * jurosMensal) / (1 - Math.pow(1 + jurosMensal, -prazo));
    }

    public double getValorImovel() { return valorImovel; }
    public double getEntrada() { return entrada; }
    public int getPrazo() { return prazo; }
    public double getTaxaJuros() { return taxaJuros; }
}
