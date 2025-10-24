/**
 * Classe para instanciar objetos do tipo figura
 * @author Luiz Felipe de Oliveira
 * @since Classe criada em 26/09/2024
 */
public class Desenho {
    public static void main(String[] args) {
        Figura f1 = new Figura(500);
        Figura f2 = new Figura(10, 35);
        Figura f3 = new Figura(3, 4, 5);
        Figura f4 = new Figura(8, 7, 8, 7);
        
        f1.exibirFigura();
        f2.exibirFigura();
        f3.exibirFigura();
        f4.exibirFigura();
    }//fim do main
}//fim da classe
