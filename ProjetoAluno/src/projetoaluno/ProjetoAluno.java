package projetoaluno;
import java.util.Scanner;

public class ProjetoAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Registro do aluno n1:");
        
        System.out.print("Nome: ");
        String nome1 = input.nextLine();
        System.out.print("Matricula: ");
        int matricula1 = input.nextInt();
        System.out.print("Nota AV1: ");
        double notaA1Av1 = input.nextDouble();
        System.out.print("Nota AV2: ");
        double notaA1Av2 = input.nextDouble();
        Aluno aluno1 = new Aluno(nome1, matricula1, notaA1Av1, notaA1Av2);
        
        System.out.println("Registro do aluno n2:");
        
        input.nextLine();
        System.out.print("Nome: ");
        String nome2 = input.nextLine();
        System.out.print("Matricula: ");
        int matricula2 = input.nextInt();
        System.out.print("Nota AV1: ");
        double notaA2Av1 = input.nextDouble();
        System.out.print("Nota AV2: ");
        double notaA2Av2 = input.nextDouble();
        Aluno aluno2 = new Aluno(nome2, matricula2, notaA2Av1, notaA2Av2);
        System.out.println("----");
        
        System.out.println("Dados registrados: ");
        aluno1.resumodDados();
        aluno2.resumodDados();
        System.out.println("----");
        
        System.out.println("Resumo de notas: ");
        aluno1.verifAprov();
        aluno2.verifAprov();
        
        input.close();
        
    }
    
}