 

public class Teste {

    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];
        figuras[0] = new Quadrado('*');
        figuras[1] = new LinhaHorizontal('-');
        figuras[2] = new LinhaHorizontal('O');
        for (int i = 0; i < figuras.length; i++) {
            figuras[i].desenhar();
        }
    }

}
