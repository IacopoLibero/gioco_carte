import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;

public class App {
    public static void main(String[] args) throws Exception 
    {
        Giocatore g1=new Giocatore("pippo");
        Giocatore g2=new Giocatore("pallino");
        Giocatore g3=new Giocatore("giggi");
        System.out.println("\n"+g1.getName()+"--- il giocatore "+g1.getNome()+" sta giocando");
        System.out.println("\n"+g2.getName()+"--- il giocatore "+g2.getNome()+" sta giocando");
        System.out.println("\n"+g3.getName()+"--- il giocatore "+g3.getNome()+" sta giocando");

        g1.start();
        g1.join();
        g2.start();
        g2.join();
        g3.start();
        g2.join();

        ArrayList<Giocatore>lista=new ArrayList<>();
        lista.add(g1);
        lista.add(g2);
        lista.add(g3);
        
        Collection.sort(); 
        if(lista.get(0).getVALUE()==lista.get(1).getVALUE())
            System.out.println("\n"+lista.get(0).getNome()+" e "+lista.get(1).getNome()+" sono pari");
        else
        System.out.println("\nha vinto il giocatore "+lista.get(0).getNome());
        
        System.out.println("\nFINE PARTITA");
    }
}
