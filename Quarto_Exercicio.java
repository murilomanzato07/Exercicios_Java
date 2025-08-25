import java.util.Scanner;
public class Quarto_Exercicio {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int codigo;
        int qtd;
        double valorDesconto = 0 ,valorFinal, valor = 0;

        System.out.print("Escreva o codigo do produto: ");
        codigo = sc.nextInt();
        System.out.print("Escreva a quantidade de produto: ");
        qtd = sc.nextInt();

        if(codigo <= 10 && codigo >= 1) {
                 valor = 10.0; 
        }else if (codigo >= 11 && codigo <= 20) {
                 valor = 15.0;
        }else if (codigo >= 21 && codigo <= 30) {
                 valor = 20.0;
        }else if (codigo >= 31 && codigo <= 40) {
                 valor = 40.0;
        }else{
            System.out.println("Codigo Invalido!");
        }
        valorFinal = valor * qtd;

        if (valorFinal < 250.0) {
            valorDesconto = valorFinal * 0.05;
        }else if(valorFinal <= 500.0){
            valorDesconto = valorFinal * 0.1;
        }else if (valorFinal > 500.0) {
            valorDesconto = valorFinal * 0.15;
        }
        
        System.out.println("Preço Unitario: "+ valor);
        System.out.println("Preço Final(Sem Desconto): "+ valorFinal);
        System.out.println("Valor do Desconto: "+ valorDesconto );
        System.out.println("Preço Final(Com Desconto): "+ (valorFinal - valorDesconto));
    }
}
