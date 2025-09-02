

import java.util.Scanner;
public class Quinto_Exercicio{

        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            double[] SomaIdade = new double[5]; 
            double SomaAltura = 0;
            double contIdade = 0, contPeso = 0;
            int idade;
            double peso;
            double altura;

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 11; j++) {
                      
                    System.out.printf("%s - time / %s - jogador \n Digite a idade: ", i+1, j+1);
                    idade = sc.nextInt();
                    System.out.print("Digite o peso: ");
                    peso = sc.nextDouble();
                    System.out.print("Digite a altura: ");
                    altura = sc.nextDouble();

                   SomaIdade[i] = SomaIdade[i] + idade;
                   SomaAltura = SomaAltura + altura;
                   if (idade < 18) {
                       contIdade++;
                   }
                   if (peso > 80) {
                       contPeso++;
                   }
                }
            }

            System.out.printf("Quatidade de jogadores com Idade Inferior a 18: %.0f\n", contIdade);
            for (int i = 0; i < 5; i++) {
            System.out.printf("Media de Idade do %d - Time: %.2f\n", i+1, (SomaIdade[i] / 3.0));
            }
            System.out.printf("Media de Altura de todos os jogadores: %.2f\n", (SomaAltura / 6.0));
            System.out.printf("Porcentagem de jogadores com peso acima de 80Kg: %.2f %%\n", (contPeso / 6.0) * 100);
            

            
            
        }
}
