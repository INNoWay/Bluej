
public class Jogador {
    
    char simbolo;
    int vitorias; 
     
    public Jogador(char simbolo) {
       
        this.simbolo = simbolo;
    }
    
    public void incrementaVitorias() {
        this.vitorias++;
    }
    
    public void zerarVitorias() {
        this.vitorias = 0;
    }
    
    public char getSimbolo() {
        return simbolo;
    }
    
    public int getVitorias() {
        return this.vitorias;
    }
    
    
    
}
