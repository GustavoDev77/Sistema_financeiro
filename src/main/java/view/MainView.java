package view;
import controller.FinanciamentoController;
import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simulador de Financiamento Imobiliario");
        System.out.print("Digite o valor do imovel: ");
        double valorImovel = scanner.nextDouble();

        System.out.print("Digite o valor da entrada: ");
        double entrada = scanner.nextDouble();

        System.out.print("Digite o prazo (meses): ");
        int prazo = scanner.nextInt();

        System.out.print("Digite a taxa de juros anual (%): ");
        double taxaJuros = scanner.nextDouble();

        double prestacao = FinanciamentoController.simularFinanciamento(valorImovel, entrada, prazo, taxaJuros);
        System.out.printf("Digite a prestacao mensal: R$ %.2f%n", prestacao);

        scanner.close();
    }
}
