public class App {
    public static void main(String[] args) {
        Livro obj1;
        obj1 = new Livro();
        Livro obj2;
        obj2 = new Livro();
        
        obj1.titulo = "Harry Potter e a Pedra Filosofal";
        obj1.numeroPaginas = 304;
        obj1.anoPublicacao = 1997;
        obj1.preco = 25.90;
        
        obj2.titulo = "Crime e Castigo";
        obj2.numeroPaginas = 561;
        obj2.anoPublicacao = 1866;
        obj2.preco = 99.99;
        
        System.out.println("Titulo:" + obj1.titulo);
        System.out.println("Numero de paginas:" + obj1.numeroPaginas);
        System.out.println("Ano Pub:" + obj1.anoPublicacao);
        System.out.println("Preco:" + obj1.preco);
        obj1.cadastrar();
        double frete = obj1.calcFrete("66097-055");
        System.out.printf("Frete: R$ %.2f%n", frete);
        System.out.println(obj1.trocar());
        
        System.out.println("-----------------");
        
        System.out.println("Titulo:" + obj2.titulo);
        System.out.println("Numero de paginas:" + obj2.numeroPaginas);
        System.out.println("Ano Pub:" + obj2.anoPublicacao);
        System.out.println("Preco:" + obj2.preco);
        obj2.cadastrar();
        frete = obj2.calcFrete("66097-055");
        System.out.printf("Frete: R$ %.2f%n", frete);
        obj2.vender();
    }
}