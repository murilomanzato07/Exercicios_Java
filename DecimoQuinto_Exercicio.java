import java.util.Scanner;
public class DecimoQuinto_Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[7][7];
        int vetorLinha[] = new int[7];
        int vetorColuna[]= new int[7];
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0 ;j < 7; j++){
                System.out.printf("Digite o valor da casa %d X %d: ",i+1,j+1);
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] >= vetorLinha[i]) {
                    vetorLinha[i] = matriz[i][j];                    
                }
            }
        }
        for (int j = 0; j < 7; j++) {
            for (int i = 0 ;i < 7; i++){
                if (matriz[i][j] >= vetorColuna[i]) {
                    vetorColuna[j] = matriz[i][j];                    
                }
            }
        }
        System.out.printf("Vetor Linha: {");
        for (int i = 0; i < 7; i++) {
            System.out.printf(" %d,",vetorLinha[i]);
        }
        System.out.printf("}\n");
        System.out.printf("Vetor Coluna: {");
        for (int i = 0; i < 7; i++) {
            System.out.printf(" %d,",vetorColuna[i]);
        }
        System.out.printf("}\n");
    }
}
