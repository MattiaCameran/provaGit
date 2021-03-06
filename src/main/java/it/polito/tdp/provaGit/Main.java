package it.polito.tdp.provaGit;

public class Main {
	public static void main(String[] args) {
        EntryPoint.main(args);
    }
}

//Voglio creare un REPOSITORY LOCALE da agganciare al progetto
//Inizializzazione del REPOSITORY
//Tasto destro sul progetto -> Team -> Share Project -> Creare il REPOSITORY
//sulla cartella dove è presente il progetto (in modo da tenerli legati).

//I file acquisiscono un punto interrogativo. I file non sono utilizzati, quindi Eclipse
//non sa se vadano posizionati nel repository... Questo è lo stato iniziale della working copy 
//prima del primo COMMIT (inserimento della working copy nel repository)

//Fare quindi il primo COMMIT (tasto destro -> Team -> Commit).

//Appare una finestrella di Commit: in basso a destra si trova l'autore che ha effettuato il commit.
//A sinistra in alto (Unstaged Changes) ci sono tutti i file cambiati dall'ultimo commit (per il primo tutti).
//Nella parte bassa(Staged Changes) sono presenti tutti i file cambiati che io voglio immettere nel Repository (in questo caso tutti).
//Basta trascinarli dentro, di questi file sarà fatto il commit, cosa che avverrà anche nelle future modifiche. (il doppio + li aggiunge tutti).

//In alto a destra è presente la finestra "Commit Message", ovvero il messaggio/commento che accompagna il mio Commit (spiego le modifiche).

//Dopo che effettuo il Commit, i punti interrogativi diventano dei + (file di progetto aggiunti al repository).
//Quando modifico uno dei file precedentemente "Committati", appare a sinistra il simbolo >, che mi indica appunto che il file è stato modificato dall'ultimo Commit.'