 

public class Quadrado extends Figura {

    public Quadrado(char c) {
        super(c);
    }

    public void desenhar() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(meuChar);
            }
            System.out.println();
        }
    }

}
