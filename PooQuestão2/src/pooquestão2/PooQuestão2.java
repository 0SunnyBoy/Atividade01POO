package pooquestão2;

public class PooQuestão2 {
public static void main(String[] args) {
    Estante estanteRomance = new Estante("Romance", 60, "Corredor c");
    
    estanteRomance.adcLivros(40);
    estanteRomance.quantLivrosmt();
    System.out.println();
    
    estanteRomance.rmvLivros(50);
    estanteRomance.quantLivrosmt();
    System.out.println();
    
    estanteRomance.rmvLivros(500);
    estanteRomance.quantLivrosmt();
    }
}
