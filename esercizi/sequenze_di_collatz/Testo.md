Sequenze di Collatz
===================

Descrizione
-----------

Si consideri la sequenza ottenuta a partire da un qualunque intero positivo `N`
costruita secondo la seguente regola: se il numero è pari lo si divide per 2,
altrimenti, se è dispari, lo si moltiplica per 3 e si aggiunge 1 al risultato;
quando si arriva al numero `1` ci si ferma.

La sequenza che si costruisce in questo modo a partire dal numero `N` è detta
*sequenza di Collatz* di `N`.

Ad esempio, la sequenza di Collatz di 7 è:

	7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1

È un noto problema aperto stabilire se ogni sequenza di Collatz *termina* (cioè,
arriva a `1`).

Scrivete un programma che dato il numero `N` nel flusso di ingresso emette nel
flusso di uscita la sequenza di Collatz del numero dato, seguita dalla sua
lunghezza.


Vincoli
-------

Potete assumere che i numeri in gioco possano essere rappresentati da variabili
di tipo `int`. Non si può viceversa assumere che la sequenza abbia una lunghezza
massima nota a priori.

I numeri emessi nel flusso di uscita vanno separati tra loro con un singolo
spazio, l'ultimo numero va seguito da un *a-capo*.


Esempio
-------

Eseguendo `soluzione` e avendo `7` nel flusso di ingresso, il programma emette
nel flusso di uscita

    7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 17

(si osservi che i primi 17 numeri sono la sequenza di Collatz di `7`, mentre
l'ultimo numero emesso è `17` che è per l'appunto la lunghezza della sequenza
stessa).

Similmente, eseguendo `soluzione` e avendo `9` nel flusso di ingresso, il
programma emette

	9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 20
