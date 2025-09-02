
import java.util.Scanner;

public class Decimo_Exercicio{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont=0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Escreva %d - numero: ", i+1);
            var valor = sc.nextInt();
            if (valor % 2 == 0) {
                
            }else{
                cont++;
            }

        }
        if (cont != 0) {
            System.out.printf("Existem %d numeros primos!",cont);
        }else{
            System.out.printf("NAO existem nenhum numero primo!");
        }

    }
}