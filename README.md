## Compito TIPSIT 18/05/2023

VERIFICA THREAD FILA C


Otto amici decidono di fare una gara di velocità. Scelgono quindi di andare a correre sulla pista di go-kart che si trova a pochi chilometri di distanza dalla loro città. 

Il gestore della pista, per questioni di sicurezza, ha stabilito che possono correre solo 4 kart per volta e che ciascun pilota può effettuare non più di 5 giri. 

Simulare la suddetta situazione in Java, utilizzando un Monitor ( cioè una classe con uno o più  metodi Java con il costrutto synchronized ). 

Scrivere un programma che simuli la gara di velocità rispettando i vincoli imposti dal gestore della pista. Ciascun pilota, rappresentato da un thread, avente un nome,  intraprende le seguenti azioni:

− sale sul kart ed entra in pista (se in pista ci sono già 4 kart attende che uno dei piloti termini i giri a disposizione)
− effettua i giri di pista ( simulare un tempo variabile tra i 1 e 2 secondi per ogni giro )
− torna ai box, scende dal go-kart e lascia la pista

Nel metodi del Monitor gestire i vincoli sulla mutua esclusione e sugli accessi limitati.
