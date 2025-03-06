package controller;
import model.Financiamento;

public class FinanciamentoController {
    public static double simularFinanciamento(double valorImovel, double entrada, int prazo, double taxaJuros) {
        Financiamento financiamento = new Financiamento(valorImovel, entrada, prazo, taxaJuros);
        return financiamento.calcularPrestacao();
    }
}
