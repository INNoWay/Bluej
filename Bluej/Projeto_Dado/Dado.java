
/**
 * Write a description of class Dado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dado{
   private int lados;
    public Dado (int nlados)
    {
    lados=nlados;
    }
       public int jogaDado()
       {
        return (int)(Math.random()*lados+11);
       }
       
    }
