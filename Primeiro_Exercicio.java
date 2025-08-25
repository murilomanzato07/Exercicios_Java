import java.util.Scanner;
public class Primeiro_Exercicio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva horas trabalhadas: ");
        var horas = sc.nextDouble();

        System.out.print("Escreva o valor da hora trabalha: ");
        var valor = sc.nextDouble();

            var salarioBruto = horas * valor;

            var salario = salarioBruto - (salarioBruto * 0.3);

            System.out.printf("Salario Bruto: %s\n", salarioBruto);
            System.out.printf("Salario Liquido: %s\n", salario);
    }
    
}