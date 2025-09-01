import java.util.Scanner;
public class Setimo_Exercicio {

     public static long fatorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        for (int i = inicio; i <= fim; i++) {
            System.out.println("Fatorial de " + i + " = " + fatorial(i));
        }

    }
}
