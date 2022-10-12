package it.polito.tdp.provaGit;

public class Main {
	public static void main(String[] args) {
        EntryPoint.main(args);
    }
}

//Voglio creare un REPOSITORY LOCALE da agganciare al progetto
//Inizializzazione del REPOSITORY
//Tasto destro sul progetto -> Team -> Share Project -> A questo punto Eclipse ci chiede dove vogliamo creare/salvare il repository.
//E' buona prassi creare il REPOSITORY sulla cartella dove è presente il progetto (in modo da tenerli legati) spuntando la casellina.

//Vicino al progetto appare un bidoncino giallo, che corrisponde al repository
//I file acquisiscono un punto interrogativo. I file non sono utilizzati, il repository è vuoto e quindi Eclipse
//non sa se vadano posizionati nel repository... Questo è lo stato iniziale della working copy 
//prima del primo COMMIT (inserimento della working copy nel repository)

//Fare quindi il primo COMMIT (tasto destro -> Team -> Commit).

//Appare una finestrella di Commit: in basso a destra si trova l'autore che ha effettuato il Commit.
//A sinistra in alto (Unstaged Changes) ci sono tutti i file cambiati dall'ultimo commit (per il primo tutti).
//Nella parte bassa (Staged Changes) sono presenti tutti i file cambiati che io voglio immettere nel Repository (in questo caso tutti).
//Basta trascinarli dentro (il doppio + li aggiunge tutti), di questi file sarà fatto il commit. A questo punto Eclipse si ricorderà di questi file e nei prossimi Commit saranno già posizionati in questa casella per le future modifiche.

//In alto a destra è presente la finestra "Commit Message", ovvero il messaggio/commento che accompagna il mio Commit (spiego le modifiche). Per il primo Commit posso scrivere "Versione iniziale".

//Dopo che ho fatto ste cose effettuo il commit in basso a destra. Dopo che effettuo il Commit, i punti interrogativi diventano dei + (file di progetto aggiunti al repository).
//Quando modifico uno dei file precedentemente "Committati", appare a sinistra il simbolo >, che mi indica appunto che il file è stato modificato dall'ultimo Commit.

//Se voglio salvare le modifiche sul Repository bisogna sempre fare Team-> Commit (RICORDARSI SEMPRE IL MESSAGGIO).

//Al momento ho lavorato in locale, ora voglio salvare su GitHub.

//Per salvare su GitHub vado su Team -> Push (ho già salvato nome utente e password).
//Dopo il primo Push (che di solito avrà il nome "origin"), io quando faccio nuovi Commit posso scegliere di fare "Commit and Push", facendo insieme le operazioni.
