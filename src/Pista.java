public class Pista {

    // Dichiarazione Parametri
    final int NumeroMaxKart = 4;
    private int NumeroKartInPista = 0;

    // Costruttore
    public Pista() {

    }

    /**
     * Funzione per controllare se le spazio in
     * pista è esaurito.
     * @return {@code true} se lo spazio in pista è esaurito <br></br>
     * {@code false} se c'è ancora spazio in pista 
     */
    public boolean SpazioInPistaEsaurito(){
        return NumeroKartInPista >= NumeroMaxKart;
    }

    /**
     * Entrata in pista di un Thread di tipo {@code Amico}
     */
    public synchronized void EntraInPista(){

        while(SpazioInPistaEsaurito()){ //Nel caso che non ci siano più posti liberi
            try {
                System.out.println("!!! " + Thread.currentThread().getName() + " aspetta che si liberi spazio per un Kart");
                wait();// Mette in stato di wait un Thread visto che tutti i posti sono pieni
            } catch (InterruptedException e) {}
        } if (!SpazioInPistaEsaurito()){// se ci sono posti liberi
            System.out.println(">>> " + Thread.currentThread().getName() + " prende un Kart e entra in pista!");
            NumeroKartInPista++;// Aumento il numero dei Kart in pista dopo l'entrata di questo Kart
            System.out.println("---" + "Numero Kart In Pista con Kart " + Thread.currentThread().getName() + " : " + NumeroKartInPista);
        }
    }

    /**
     * Uscita dalla pista di un Thread di tipo {@code Amico}
     */
    public synchronized void EsciDallaPista(){
        System.out.println("<<< " + Thread.currentThread().getName() + " esce dalla pista!");
        NumeroKartInPista--;// Diminuisce il numero dei Kart in pista dopo l'uscita di questo Kart
        System.out.println("---" + "Numero Kart In Pista dopo che Kart " + Thread.currentThread().getName() + " è uscito : " + NumeroKartInPista);
        notifyAll();//Sveglia eventuali Thread in caso di wait
    }
}
