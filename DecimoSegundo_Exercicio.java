import java.util.Scanner;
public class DecimoSegundo_Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor1[], vetor2[], vetorFinal[];
        vetor1 = new int[10];
        vetor2 = new int[10];
        vetorFinal = new int[10];
        int cont=0;

    for(int i = 0; i<10; i++){
        System.out.printf("Digite %d - numero: ",i+1);
        vetor1[i] = sc.nextInt();
    }
    for(int i = 0; i<10; i++){
        System.out.printf("Digite %d - numero: ",i+1);
        vetor2[i] = sc.nextInt();
    }
    for(int j = 0; j < 10; j++){

    for (int i = 0; i < 10; i++) {
        if (vetor1[i] == vetor2[j]) {
            vetorFinal[j] = vetor1[i];
            cont++;
            }
        }
    }
    System.out.printf("Valores repetidos = {");
        if (cont > 0) {
            for (int j = 0 ; j < 10; j++) {
                if (vetorFinal[j] != 0 && j<9) {
                    System.out.printf("%d,",vetorFinal[j]);

                }else if(vetorFinal[j] != 0){
                    System.out.printf("%d",vetorFinal[j]);
                }
            }
        }else{
            System.out.printf("Nenhum numero anterior digitado foi repetido!\n");
        }
        System.out.printf("}");
    

    }
}
