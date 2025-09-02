
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DecimoPrimeiro_Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Double> numeros = new HashSet<>();

        for(;;) { 
            System.out.printf("Escreva um valor(ou 0/numeros negativos para sair): ");
            double valor = sc.nextDouble();

            if (valor <= 0) {
                break;
            }else{
                numeros.add(valor);
            }
        }
         System.out.println("Valor | Cubo | Raiz");
        for (double valores : numeros) {
           
            System.out.print(valores+"\t"+Math.pow(valores, 3)+"\t"+Math.sqrt(valores)+"\n");
            
        }
    }
    
}
