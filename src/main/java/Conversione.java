public class Conversione extends Pila
{
    private int D;

    public Conversione(int D) 
    {
        this.D = D;
    }
    
    public void Binario()
    { 
        int Resto = 0;
        Pila p = new Pila();
        
        do
        {
            Resto = D % 2;
            p.push(Resto);
	    D = (D - Resto) / 2;
	} while (D != 0);
        
        System.out.println("La Conversione In Binario E': ");
        
         while(!p.vuota())
         System.out.print("|" + p.pop());
         System.out.println("|");
    }
}
