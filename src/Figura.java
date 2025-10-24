import javax.swing.JOptionPane;

/**
 * Classe para demonstrar o recurso de sobrecarga de métodos
 * @author Luiz Felipe de Oliveira
 * @since Classe criada em 26/09/2024
 */
public class Figura {
    Integer a, b, c, d;
    
    //Contrutor para um Ponto
    public Figura(int a){
        this.a = a;
    }
    
    //Contrutor para uma Linha
    public Figura(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    //Contrutor para um Triangulo
    public Figura(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    //Contrutor para um Quadrado
    public Figura(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    //Método comum que indentifique o tipo do objeto
    public void exibirFigura(){
        if(a != null && b == null && c == null && d == null)
            exibirFigura(1);
        else if(a != null && b != null && c == null && d == null)
            exibirFigura("sogra", 1.3f);
        else if(a != null && b != null && c != null && d == null)
            exibirFigura("a", 1, 2);
        else   
            exibirFigura("a", 1, 2, 3);
    }
    
    //Método comum para exibir os dados de um Ponto
    private void exibirFigura(int x){
        System.out.println("É um Ponto de valor: " + a);
    }
    
    //Método comum para exibir os dados de uma linha
    private void exibirFigura(String w, float p){
        System.out.println("É uma Linha de coordenadas: " + a + " e " + b);
    }
    
    //Método comum para exibir os dados de um Triangulo 
    private void exibirFigura(String w, int t, int m){
        System.out.println("É um Triangulo de coordenadas: " + a + ", " + b + " e " + c);
    }
    
    //Método comum para exibir os dados de um Quadrado
    private void exibirFigura(String w, int t, int m, int j){
        System.out.println("É um Quadrado de coordenadas: " + a + ", " + b + ", " + c + " e " + d);
//        JOptionPane.showMessageDialog(null, "É um Quadrado de coordenadas: " + a + ", " + b + ", " + c + " e " + d,"Retangulo,1");
    }
}//fim da classe
