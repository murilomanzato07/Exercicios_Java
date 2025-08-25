import java.util.Scanner;
public class Segundo_Exercicio {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva o valor do Salario Minimo: ");
        var SalarioMin = sc.nextDouble();

        System.out.print("Escreva a quantidade quilowatts consumida: ");
        var quilowatts = sc.nextDouble();

        System.out.printf("O valor de cada quilowatts: %s\n", SalarioMin / 100);
        System.out.printf("O valor a ser pago: %s", (SalarioMin / 100) * quilowatts);
    }
    
}
