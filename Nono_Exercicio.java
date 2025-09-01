
import java.util.Scanner;

public class Nono_Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Escreva um valor: ");
        var valor = sc.nextInt();

        if (valor % 2 == 0) {
            System.out.printf("O valor é primo!");
        }else{
            System.out.printf("O valor NAO é primo!");
        }

    }
}
