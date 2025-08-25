import java.util.Scanner;
public class Sexto_Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, valorFinal = 1;
        System.out.printf("Digite um numero: ");
        valor = sc.nextInt();

        if (valor <= 0) {
            System.out.print("Numero Invalido!");
        }else{
            for (int i = 1; i < valor+1; i++) {
                valorFinal = valorFinal * i;
            }
            System.out.printf("%d fatorial = %d",valor, valorFinal);
        }
    }
}
