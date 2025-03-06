package view;

import controller.FinanciamentoController;
import util.PdfGenerator;
import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simulador de Financiamento Imobiliário");
        System.out.print("Valor do imóvel: ");
        double valorImovel = scanner.nextDouble();

        System.out.print("Valor da entrada: ");
        double entrada = scanner.nextDouble();

        System.out.print("Prazo (meses): ");
        int prazo = scanner.nextInt();

        System.out.print("Taxa de juros anual (%): ");
        double taxaJuros = scanner.nextDouble();

        double prestacao = FinanciamentoController.simularFinanciamento(valorImovel, entrada, prazo, taxaJuros);
        System.out.printf("Prestação mensal: R$ %.2f%n", prestacao);

        // Conteúdo do PDF
        String conteudo = String.format(
                "Valor do Imóvel: R$ %.2f\nValor da Entrada: R$ %.2f\nPrazo: %d meses\nTaxa de Juros: %.2f%%\nPrestação Mensal: R$ %.2f",
                valorImovel, entrada, prazo, taxaJuros, prestacao
        );

        PdfGenerator.gerarRelatorio("simulacao_financiamento.pdf", conteudo);

        scanner.close();
    }
}
