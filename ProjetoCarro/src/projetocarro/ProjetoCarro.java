package projetocarro;
import java.util.Scanner;

public class ProjetoCarro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual e a marca do primeiro carro?");
        String marca1 = input.nextLine();
        System.out.println("Qual e o modelo do primeiro carro?");
        String modelo1 = input.nextLine();
        System.out.println("Qual e o ano do primeiro carro?");
        int ano1 = input.nextInt();
        input.nextLine();
        
        Carro carro1 = new Carro(marca1, modelo1, ano1);
        
        System.out.println("Qual e a marca do segundo carro?");
        String marca2 = input.nextLine();
        System.out.println("Qual e o modelo do segundo carro?");
        String modelo2 = input.nextLine();
        System.out.println("Qual e o ano do segundo carro?");
        int ano2 = input.nextInt();
        input.nextLine();
        
        Carro carro2 = new Carro(marca2, modelo2, ano2);
        
        System.out.println("\nInformacoes do carro numero 1");
        carro1.informacoes();
        System.out.println("\nInformacoes do carro numero 2");
        carro2.informacoes();
        
        carro2.marca = "Toyota";
        carro2.modelo = "Sedan";
        carro2.ano = 2020;
        
        System.out.println("O carro n2 foi alterado");
        carro2.informacoes();
        
        carro1.ignicao();
        carro2.ignicao();
        
        input.close();
    }
}