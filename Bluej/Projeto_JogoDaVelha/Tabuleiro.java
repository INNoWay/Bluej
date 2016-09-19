
public class Tabuleiro {

    int nrLinhas;  
    int nrColunas; 
    char tabuleiro[][]; 
   
    public Tabuleiro(int nrLinhas, int nrColunas) {
       
        this.nrLinhas = nrLinhas;
        this.nrColunas = nrColunas;
        
        tabuleiro = new char [nrLinhas][nrColunas];
        
        this.esvaziarTabuleiro();
    }
    
    public void setPeca (int linha, int coluna, char peca) {
        this.tabuleiro[linha][coluna] = peca;
    }
    
    public char getPeca (int linha, int coluna) {
        return this.tabuleiro[linha][coluna];
    }
    
    public boolean estaLivre (int linha, int coluna) {
        return (this.tabuleiro[linha][coluna] == ' ');
    }
    
    public void esvaziarTabuleiro() {
        
        int i,j;
        for (i=0; i<this.nrLinhas; i++)
            for (j=0; j<this.nrColunas; j++)
                this.tabuleiro[i][j] = ' ';
    }
    
    public int getNrColunas() {
        return nrColunas;
    }
    
    public int getNrLinhas() {
        return nrLinhas;
    }
    
    public int getCountLivres () {
        int i,j,count=0;
            for (i=0; i<this.nrLinhas; i++){
                for (j=0; j<this.nrColunas; j++){
                    if (this.estaLivre(i,j)){
                        count++;
                    }
                }
            }
        return count;
    }
    
    public String[] getLista(boolean bLivres) {
        String lista[];
        if (bLivres) {
            lista = new String[getCountLivres()];
        } else {
            lista = new String[nrColunas*nrLinhas];
        }
        int z = 0;
       
        for(int i = 0; i < nrLinhas; i++) {
            for(int j = 0; j < nrColunas; j++) {
                if (estaLivre(i,j) || !bLivres) {
                    lista[z] = new String(Integer.toString(i)+Integer.toString((j)));
                    z++;
                }
            }
        }
        return(lista);
    }
    
}
