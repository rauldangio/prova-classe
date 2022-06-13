
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int op1 = 0,op2 = 0,op3 = 0;


        Banco cliente1 = new Banco();
        Scanner sc = new Scanner(System.in);

        cliente1.titular = "raul dangio";
        cliente1.numero = 3;
        cliente1.agencia = "Itau";
        cliente1.saldo = 1500.00;

        System.out.println("Informação do cliente: "+cliente1.getInformacaoCliente());
        System.out.println(" ");
        System.out.print("O senhor deseja fazer um saque(1), deposito(2), sair do programa(3)? ");
        op1 = sc.nextInt();

        if (op1 == 1){
            System.out.print("Quanto deseja tirar do seu saldo: ");
            cliente1.saque = sc.nextDouble();
            System.out.println("saldo atual: "+cliente1.getSaque());
        }
        else if (op1 == 2){
            System.out.print("Quanto deseja colocar no seu saldo: ");
            cliente1.deposito = sc.nextDouble();
            System.out.println("saldo atual: "+cliente1.getDeposito());
        }
        else if(op1 == 3){
            System.exit(0);
        }
        System.out.print("O senhor deseja fazer um saque(1), deposito(2), sair do programa(3)? ");
        op2 = sc.nextInt();

        if (op2 == 1){
            System.out.print("Quanto deseja tirar do seu saldo: ");
            cliente1.saque = sc.nextDouble();
            System.out.println("saldo atual: "+cliente1.getSaque());
        }
        else if (op2 == 2){
            System.out.print("Quanto deseja colocar no seu saldo: ");
            cliente1.deposito = sc.nextDouble();
            System.out.println("saldo atual: "+cliente1.getDeposito());
        }
        else if(op2 == 3){
            System.exit(0);
        }
        System.out.print("O senhor deseja fazer um saque(1), deposito(2), sair do programa(3)? ");
        op3 = sc.nextInt();

        if (op3 == 1){
            System.out.print("Quanto deseja tirar do seu saldo: ");
            cliente1.saque = sc.nextDouble();
            System.out.println("saldo atual: "+cliente1.getSaque());
        }
        else if (op3 == 2){
            System.out.print("Quanto deseja colocar no seu saldo: ");
            cliente1.deposito = sc.nextDouble();
            System.out.println("saldo atual: "+cliente1.getDeposito());
        }
        else if(op3 == 3){
            System.exit(0);
        }


    }
}
