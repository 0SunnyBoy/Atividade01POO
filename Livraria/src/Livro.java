public class Livro {
    String titulo;
    int numeroPaginas;
    int anoPublicacao;
    double preco;
    
    void cadastrar(){
        System.out.println("Cadastrando no banco de dados...");
    }
    
    double calcFrete(String cep){
        System.out.println("Calculando frete para o CEP: " + cep);
        double valorFrete = 0.00;
        
        if (preco > 50){
            valorFrete = 0.00;
        } else {
            valorFrete = 20.00;
        } 
        return valorFrete;
    }
    
    void vender(){
        System.out.printf("Vendendo livro por R$ %.2f%n", preco);
    }
    
    String trocar(){
        return "Livro trocado!";
    }
}