Minimo inventario
=================

Descrizione
-----------

Un *inventario* è una sequenza di coppie (*bene*, *quantità*) in cui il *bene* è
una stringa e la *quantità* un numero intero. Scrivete un programma che, dato un
inventario nel flusso di ingresso emetta nel flusso di uscita il primo bene di
cui è presente la minor quantità.

Ad esempio, dato l'inventario

    pane 10
    vino 1
    insalata 3
    tonno 1
    olio 2

nel flusso di ingresso, il programma emette `vino` nel flusso di uscita.


Vincoli
-------

Il flusso di ingresso contiene solo coppie di stringhe (sequenze massimali di
caratteri non contenenti *white-space*) e numeri interi, le due parti di una
coppia e le coppie sono separati da uno o più *white-space*. Non c'è vincolo sul
numero di coppie (il flusso va letto fino all'`EOF`), tutti i numeri coinvolti
possono essere rappresentati con variabili di tipo `int`. Se il flusso di
ingresso è vuoto, il programma non deve emettere nulla.


Esempio
-------

Eseguendo `soluzione` e avendo

    tre 3 due	 2   uno 1
    quattro 4 cinque 5

nel flusso di ingresso, il programma emette `uno` nel flusso di uscita; eseguendo
`soluzione` e non avendo alcuna coppia in ingresso il programma non emette nulla
nel flusso di uscita.
