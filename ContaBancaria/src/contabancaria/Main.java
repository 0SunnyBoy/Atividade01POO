package contabancaria;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            ContaBancaria contaN1 = new ContaBancaria("123", "Samir Morais", 1500);
            ContaBancaria contaN2 = new ContaBancaria("456", "Samir Trindade", 2500);
            
            boolean continua = true;
            
            while (continua) {
            System.out.println("Escolha a conta a ser alterada: ");
            System.out.println("1 - " + contaN1.titular);
            System.out.println("2 - " + contaN2.titular);
            System.out.println("0 - Sair");
            System.out.println("Opcao:");
            int opCont = input.nextInt();
            
            ContaBancaria contSelec = null;
            
            if (opCont == 1) contSelec = contaN1;
            else if (opCont == 2) contSelec = contaN2;
            else if (opCont == 0) {
                System.out.println("Fechando Sistema.");
                break;
            } else {
                System.out.println("Opcao invalida.");
            }
            
            System.out.println("\nEscolha a operacao para a conta " + contSelec.titular + ":");
            System.out.println("1 - Depositar");
            System.out.println("2 - Saque");
            System.out.println("3 - Consultar saldo");
            System.out.println("Opcao: ");
            int opOpe = input.nextInt();
            
            switch (opOpe) {
                case 1 -> {
                    System.out.print("Digite o valor p/deposito: R$ ");
                    double valorDep = input.nextDouble();
                    contSelec.depositar(valorDep);
                    }
                case 2 -> {
                    System.out.print("Digite o valor p/saque: R$ ");
                    double valorSaq = input.nextDouble();
                    contSelec.saque(valorSaq);
                    }
                case 3 -> contSelec.consultSald();
                default -> System.out.println("Operação invalida.");
            }
        }
    }
}