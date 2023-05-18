public class Amico extends Thread{
    
    // Dichiarazione Parametri
    private Pista pista;

    // Costruttore
    public Amico(String NomeAmico, Pista pista) {
        super(NomeAmico);
        this.pista = pista;
    }

    /**
     * Override della funzione run ereditata
     * dalla classe {@code Thread}
     */
    @Override
    public void run() {
        System.out.println(">>> " + Thread.currentThread().getName() + " arriva al circuito dei Kart");
        pista.EntraInPista(); 
        TempoGara();
        pista.EsciDallaPista();
    }

    /**
     * Funzione che calcola la permanenza dei Thread {@code Amici}
     * nella pista
     */
    public void TempoGara(){
        int NumeriGiri = ((int) ((Math.random()*5)+1)); // Numeri di giri fatti dall'amico in questione
        System.out.println("### " + Thread.currentThread().getName() + " fara " + NumeriGiri + " giri" ); //Comunica all'utente il valore della variabile NumeriGiri (Quindi il numero di giri compiuti da questo Thread)
        for (int i = 0; i < NumeriGiri; i++) {
            long TempoGiro = (long) (((Math.random()*2000)+1) + 1);//Calcola il tempo per questo giro
            try {
                sleep(TempoGiro);// Simula il compimento del giro
            } catch (InterruptedException e) {}
            System.out.println("### " + Thread.currentThread().getName() + " ha compiuto il Giro " + (i+1) + "/" + NumeriGiri + " in " + TempoGiro + " ms");//Aggiorna l'utente sullo stato di completamento della gara            
        }
    }
    
}
