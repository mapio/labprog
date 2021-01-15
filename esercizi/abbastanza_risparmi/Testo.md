Abbastanza risparmi
===================

Descrizione
-----------

Scrivete un programma che vi aiuti a calcolare, dato l'ammontare di quanto avete
messo da parte ogni giorno, quanti giorni dovete aspettare prima di poter
acquistare una cosa che desiderate.

Il programma riceve nel flusso di ingresso il numero intero positivo
corrispondente al costo dell'oggetto che volete acquistare, seguito da una
successione (eventualmente vuota e terminata dal numero `0`) di numeri interi
positivi, corrispondenti ciascuno a quanto avete risparmiato in un giorno.

Il programma deve emettere nel flusso di uscita il minimo numero di giorni dopo
cui potete effettuare l'acquisto, oppure `0` se non avete risparmiato
abbastanza.

Ad esempio, se il flusso di ingresso contiene

    10 1 1 3 4 6 9 0

il programma emette `5`, infatti i risparmi complessivamente accumulati nei sei
giorni sono

    1 2 5 9 15 24

e il primo giorno in cui il totale è pari, o superiore, a `10` è il quinto giorno.


Vincoli
-------

Tutti i numeri coinvolti possono essere rappresentati da variabili di tipo
`int`; non si può viceversa assumere alcun limite per la lunghezza della
sequenza di risparmi (che può essere anche vuota).


Esempio
-------

Eseguendo `soluzione` e avendo

    100 1 1 1 1 1 1 0

nel flusso di ingresso, il programma emette `0` (infatti i risparmi non bastano
mai). Similmente, eseguendo `soluzione` e avendo

    10 20 0

nel flusso di ingresso, il programma emette `1` (infatti, poiché i risparmi del
primo giorno sono superiori al prezzo dell'oggetto desiderato, non occorre
attendere oltre). Infine, avendo

    1 0

il programma emette `0` in quanto non è stato risparmiato nulla, quindi non è
possibile procedere all'acquisto.
