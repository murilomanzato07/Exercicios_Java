import java.util.Scanner;
public class Terceiro_Exercicio {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int angulo1,angulo2,angulo3;
        int lado1,lado2,lado3;
        
        System.out.println("Escreva 1- angulo: ");
        angulo1 = teclado.nextInt();
        System.out.println("Escreva 2- angulo: ");
        angulo2 = teclado.nextInt();
        System.out.println("Escreva 3- angulo: ");
        angulo3 = teclado.nextInt();
        System.out.println("Escreva 1- lado: ");
        lado1 = teclado.nextInt();
        System.out.println("Escreva 2- lado: ");
        lado2 = teclado.nextInt();
        System.out.println("Escreva 3- lado: ");
        lado3 = teclado.nextInt();
        
        if (angulo1 + angulo2 + angulo3 != 180) {
            System.out.print("Numero inseridos invalidos!");
            System.exit(0);
        }

        if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90 ) {
            System.out.println("Triangulo: Acutângulo");
            
        }else if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            System.out.println("Triangulo: Retangulo");
        }else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
            System.out.println("Triangulo: Obtusangulo");
        }if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("Lados: Equilátero");
        }else if (lado1 == lado2 && lado1 != lado3 && lado2 != lado3 || lado2 == lado3 && lado2 != lado1 && lado3 != lado1 || lado1 == lado3 && lado1 != lado2 && lado3 != lado2){
            System.out.println("Lados: Isosceles");
        }else {
            System.out.println("Lados: Escaleno");
        }        

      
    }
}