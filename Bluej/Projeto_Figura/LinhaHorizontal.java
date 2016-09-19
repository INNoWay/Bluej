 

public class LinhaHorizontal extends Figura {

    public LinhaHorizontal(char c) {
        super(c);
    }

    public void desenhar() {
        for (int i = 0; i < 4; i++) {
            System.out.print(meuChar);
        }
        System.out.println();
    }

}
