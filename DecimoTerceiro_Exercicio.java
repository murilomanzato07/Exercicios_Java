import java.util.Scanner;
public class DecimoTerceiro_Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor1[], vetor2[], vetorResultado1[], vetorResultado2[];
        vetor1 = new int[10];
        vetorResultado1 = new int[10];
        vetor2= new int[5];
        vetorResultado2 = new int[5];
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite um numero: ");
            vetor1[i] = sc.nextInt();

        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite um numero: ");
            vetor2[i] = sc.nextInt();
            
        }
        for (int i = 0; i < 10; i++) {
            
             if (vetor1[i] % 2 == 0) {
                vetorResultado1[i] = vetor1[i];
            for (int j = 0; j < 5; j++) {
                 vetorResultado1[i] += vetor2[j];
            }
        }else{

                 for (int j = 0; j < 5; j++) {
                    

                    }    
                }

            }
            
        }
    
    }
}
