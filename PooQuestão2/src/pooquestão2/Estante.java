package pooquestão2;

public class Estante {
   public String genero;
   public int quantLivros;
   public String localizacao;
   
   public Estante(String genero, int quantLivros, String localizacao) {
   this.genero = genero;
   this.quantLivros = quantLivros;
   this.localizacao = localizacao;
   }
   
   public void adcLivros(int quant) {
       this.quantLivros += quant;
   }
   
   public void rmvLivros(int quant) {
       if (quant <= this.quantLivros) {
           this.quantLivros -= quant;
       } else {
           System.out.println("Faltam livros na estante");
       }
   }
   
    public void quantLivrosmt() {
        System.out.println("Quantidade: " + this.quantLivros);
   }
}
