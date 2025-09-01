import java.util.Scanner;

public class Oitavo_Exercicio {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Digite o valor pago: R$ ");
        double valorPago = scanner.nextDouble();

        // Calcula troco
        double troco = valorPago - valorCompra;

        if (troco < 0) {
            System.out.println("Valor pago insuficiente. Faltam R$ " + String.format("%.2f", -troco));
        } else if (troco == 0) {
            System.out.println("Não há troco.");
        } else {
            System.out.println("Troco: R$ " + String.format("%.2f", troco));
        
            int centavos = (int) Math.round(troco * 100);

            
            int[] cedulas = {20000, 10000, 5000, 2000, 1000, 500, 200}; // em centavos
            String[] nomeCedulas = {"R$200", "R$100", "R$50", "R$20", "R$10", "R$5", "R$2"};

            int[] moedas = {100, 50, 25, 10, 5, 1}; // em centavos
            String[] nomeMoedas = {"R$1,00", "R$0,50", "R$0,25", "R$0,10", "R$0,05", "R$0,01"};

            System.out.println("Distribuição do troco:");
            for (int i = 0; i < cedulas.length; i++) {
                int qtd = centavos / cedulas[i];
                if (qtd > 0) {
                    System.out.println(qtd + " x " + nomeCedulas[i]);
                    centavos %= cedulas[i];
                }
            }

            for (int i = 0; i < moedas.length; i++) {
                int qtd = centavos / moedas[i];
                if (qtd > 0) {
                    System.out.println(qtd + " x " + nomeMoedas[i]);
                    centavos %= moedas[i];
                }
            }
        }
    }
}
