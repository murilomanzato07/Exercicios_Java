import java.util.Scanner;
public class DecimoQuarto_Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int codigos[] = new int[10];
        Double saldoConta[] = new Double[10];
        int op,cdConsult;
        Double vlSaque, vlDeposito;
        boolean valCodigo = false;

        for (int i = 0; i < 10; i++) {
            valCodigo = false;
         
                 while (!valCodigo) {
                    valCodigo = true;
                    System.out.printf("Digite o codigo para %d - conta: ", i + 1);
                    codigos[i] = sc.nextInt();
                     for (int j = 0; j < i; j++) {
                     if (codigos[i] == codigos[j]) {
                    System.out.println("Codigo repetido, insira novamente!");
                    valCodigo = false;
                break;
            }
        }
    }
            System.out.printf("Digite o saldo correspondente a essa conta: ");
            saldoConta[i] = sc.nextDouble();

        }

        for(;;){

            System.out.printf("------ MENU ------\n");
            System.out.printf("1 - Efetuar Saque\n");
            System.out.printf("2 - Efetuar Deposito\n");
            System.out.printf("3 - Consultar Conta\n");
            System.out.printf("4 - Finalizar\n");
            op = sc.nextInt();

            if (op == 1) {
                System.out.printf("Digite o codigo da conta: ");
                cdConsult = sc.nextInt();
                for (int i = 0; i < 10; i++) {
                    if (cdConsult == codigos[i]) {
                        System.out.printf("Digite o valor do saque: ");
                        vlSaque = sc.nextDouble();
                        

                        if (vlSaque > saldoConta[i]) {
                            System.out.printf("Saldo insuficiente!\n");
                            break;
                        }else{
                            saldoConta[i] -= vlSaque; 
                            System.out.printf("Conta: %d\n", codigos[i]);
                            System.out.printf("Saldo Conta: %.2f\n", saldoConta[i]);
                            break;
                        }


                    }else{
                        valCodigo = false;
                    }
                   
                }
                 if (valCodigo == false) {
                        System.out.printf("Codigo Invalido!\n");
                }
            }else if (op == 2) {
                System.out.printf("Digite o codigo da conta: ");
                cdConsult = sc.nextInt();
                for (int i = 0; i < 10; i++) {
                    if (cdConsult == codigos[i]) {
                        System.out.printf("Digite o valor do Deposito: ");
                        vlDeposito = sc.nextDouble();
                        

                        if (vlDeposito <= 0) {
                            System.out.printf("Valor Invalido!\n");
                            break;
                        }else{
                            saldoConta[i] += vlDeposito; 
                            System.out.printf("Conta: %d\n", codigos[i]);
                            System.out.printf("Saldo Conta: %.2f\n", saldoConta[i]);
                            break;
                        }


                    }else{
                        valCodigo = false;
                    }
                   
                }
                 if (valCodigo == false) {
                        System.out.printf("Codigo Invalido!\n");
                } 
            }else if(op == 3){
                System.out.printf("Digite o codigo da conta: ");
                cdConsult = sc.nextInt();
                for (int i = 0; i < 10; i++) {
                    if (cdConsult == codigos[i]) {
                        System.out.printf("Conta: %d\n", codigos[i]);
                        System.out.printf("Saldo da Conta: %.2f\n", saldoConta[i]);
                        break;
                    }
                }

            }else if(op == 4){
                System.out.printf("Saindo...\n");
                break;
            }
            

        }
    }
}
