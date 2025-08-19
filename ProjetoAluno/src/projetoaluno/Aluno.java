package projetoaluno;
public class Aluno {
    String nome;
    int matricula;
    double notaAv1;
    double notaAv2;
    
    public Aluno(String nome, int matricula, double notaAv1, double notaAv2) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
    }
    
    public void resumodDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nota Av1: " + notaAv1);
        System.out.println("Nota Av2: " + notaAv2);
        System.out.println("Media: " +calcMedia());
    }
    
    public double calcMedia() {
        return (notaAv1 + notaAv2) / 2.0;
    }
    
    public void verifAprov() {
        if (calcMedia() >= 7.0) {
            System.out.println(nome + " aprovado com media" + calcMedia());
        } else {
            System.out.println(nome + " reprovado com media" + calcMedia());
        }
    }
}