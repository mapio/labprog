Stampa la riga
==============

Descrizione
-----------

Dato un numero di riga, specificato come intero sulla linea di comando, e una
sequenza di righe nel flusso di ingresso, il programma deve emettere nel flusso
di ingresso la riga corrispondente al numero dato (le righe sono numerate da 0).

Ad esempio, se il flusso di ingresso contiene le righe

    pane
    formaggio
    cacio
    pere
    tonno
    cipolle

e sulla linea di comando viene specificato il numero `2`, il programma deve
emettere `cacio`, similmente, se viene specificato `4`, deve emettere `tonno`,
in fine, se viene specificato `10` non deve emettere nulla (in quanto nel flusso
di ingresso ci sono meno di undici righe).


Vincoli
-------

Il numero di riga specificato sulla linea di comando è rappresentabile con una
variabile di tipo `int`, non ci sono vincoli sul numero, o sulla lunghezza,
delle righe nel flusso di ingresso.


Esempio
-------

Eseguendo

    soluzione 3

e avendo nel flusso di ingresso

    due
    uno
    quattro
    cinque
    tre

il programma emette nel flusso di uscita

    cinque
