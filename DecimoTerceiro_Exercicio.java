import java.util.Scanner;
public class DecimoTerceiro_Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor1[], vetor2[], vetorResultado1[], vetorResultado2[];
        vetor1 = new int[10];
        vetorResultado1 = new int[10];
        vetor2= new int[5];
        vetorResultado2 = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Vetor 1 Digite um numero: ");
            vetor1[i] = sc.nextInt();

        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("Vetor 2 Digite um numero: ");
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
                    
                        if (vetor1[i] % vetor2[j] == 0) {
                            vetorResultado2[i]++;
                        }
                    }    
                }

            }
            System.out.printf("Primeiro vetor Resultante: {");
            for (int i = 0; i < 10; i++) {
                System.out.printf(" %d,",vetorResultado1[i]);
            }
            System.out.printf("}\n");
            
             System.out.printf("Segundo vetor Resultante: {");
            for (int i = 0; i < 10; i++) {
                System.out.printf(" %d,",vetorResultado2[i]);
            }
            System.out.printf("}");
    }
}
