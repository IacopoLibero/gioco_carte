public class Giocatore extends Thread implements Comparable
{
    private String nome;
    private int valore;

    public Giocatore(String nom)
    {
        nome=nom;
        valore=(Integer) null;
    }
    public String getNome()
    {
        return nome;
    }
    public int getVALUE()
    {
        return valore;
    }
    @Override
    public void run() 
    {
        super.run();
        valore=(int)(10*Math.random())+1;
        System.out.println("\nil giocatore "+nome+"  ha estratto la carta "+valore);
    }
    @Override
    public int compareTo(Object o) {
        Giocatore a=(Giocatore)o;

        return this.getVALUE()-a.getVALUE();
    }
    
}
