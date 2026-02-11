import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Tipo de conta: ");
        String tipoConta = input.nextLine();

        System.out.println("Qual é seu saldo inicial: ");
        double saldo = input.nextDouble();  

        System.out.println(String.format("""
        **********************************************
                Nome:            %s
                Tipo de conta    %s
                Saldo inicial:   R$%.2f
        **********************************************""", nome, tipoConta, saldo));

        int opcao = 0;

        while (opcao != 4) {
            System.out.println(String.format(""" 
             
             1- Consultar saldos
             2- Receber Valor
             3- Transferir valor
             4- Sair        
                    
             Digite a opção desejada        
             """));
            opcao = input.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo atual: R$" + saldo);
            }
            else if (opcao == 2) {
                System.out.println("Qual valor deseja receber: ");
                double valorReceber = input.nextDouble();
                saldo = saldo + valorReceber;  
                System.out.println("Saldo atual: R$" + saldo);
            }
            else if (opcao == 3) {
                System.out.println("Qual valor deseja transferir: ");
                double valorTransferir = input.nextDouble();
                if (valorTransferir > saldo) {
                    System.out.println("Não há saldo suficiente para transferir");
                    System.out.println("Saldo atual: R$" + saldo);
                } else {
                    saldo = saldo - valorTransferir;  
                    System.out.println("Saldo atual: R$" + saldo);
                }
            }
            else if (opcao == 4) {
                System.out.println("Saindo...");
            }
            else {
                System.out.println("Opção inválida!");
            }
        }

        input.close();
    }
}