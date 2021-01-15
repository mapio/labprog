Stampa la colonna
=================

Descrizione
-----------

Dato un numero di colonna, specificato come intero sulla linea di comando, e
una sequenza di righe nel flusso di ingresso, il programma deve emettere sul
flusso di ingresso, per ciascuna riga, il carattere corrispondente alla
colonna data (le colonne sono numerate da 0).

Ad esempio, se il flusso di ingresso contiene le righe

    pane
    formaggio
    cacio
    pere
    tonno
    cipolle

e sulla linea di comando viene specificato il numero `2`, il programma deve
emettere

    n
    r
    c
    r
    n
    p

similmente, se viene specificato `4`, deve emettere


    a
    o

    o
    l

perché la prima e quarta riga sono lunghe meno di cinque caratteri.


Vincoli
-------

Il numero di colonna specificato sulla linea di comando è rappresentabile con
una variabile di tipo `int`, non ci sono vincoli sul numero, o sulla lunghezza,
delle righe nel flusso di ingresso.


Esempio
-------

Eseguendo `soluzione 2` e avendo nel flusso di ingresso

    due
    uno
    quattro
    cinque
    tre

il programma emette nel flusso di uscita

    e
    o
    a
    n
    e
