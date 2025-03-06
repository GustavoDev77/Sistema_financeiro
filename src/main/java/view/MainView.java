package view;
import controller.FinanciamentoController;
import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simulador de Financiamento Imobiliario");
        System.out.print("Valor do imovel: ");
        double valorImovel = scanner.nextDouble();

        System.out.print("Valor da entrada: ");
        double entrada = scanner.nextDouble();

        System.out.print("Prazo (meses): ");
        int prazo = scanner.nextInt();

        System.out.print("Taxa de juros anual (%): ");
        double taxaJuros = scanner.nextDouble();

        double prestacao = FinanciamentoController.simularFinanciamento(valorImovel, entrada, prazo, taxaJuros);
        System.out.printf("Prestacao mensal: R$ %.2f%n", prestacao);

        scanner.close();
    }
}
