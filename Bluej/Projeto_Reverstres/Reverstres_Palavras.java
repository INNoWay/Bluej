

public class Reverstres_Palavras{ 
 public static String revert (String s) {   
        if (s.length() <= 1) {   
            return s;   
        } else {   
            return revert (s.substring (1)) + s.charAt (0);   
        }   
    }   
       
    public static void main (String[] args) {   
        System.out.println (revert ("bela vista"));   
        System.out.println (revert ("Socorram-me, subi no onibus em Marrocos"));   
    }   
}
