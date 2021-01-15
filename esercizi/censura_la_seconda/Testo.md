Censura la seconda
==================

Descrizione
-----------

Scrivete un programma che, date tre parole nel flusso di ingresso, le emetta su
una sola riga nel flusso di uscita, sostituendo la seconda parola con una
sequenza di `#` lunga quanto tale parola.

Ad esempio, se le tre parole in ingresso sono `UN`, `CALDO` e `POMERIGGIO` il
programma emette `UN ##### POMERIGGIO`.


Vincoli
-------

Le parole in ingresso sono una per linea e hanno ciascuna lunghezza minore o
uguale a 20 caratteri. Nel flusso di uscita le parole devono essere sulla stessa
linea, separate da uno spazio bianco l'una dall'altra.


Esempio
-------

Eseguendo

    soluzione

e avendo nel flusso di ingresso

    PAROLE
    NUDE
    CRUDAMENTE

il programma emette nel flusso di uscita

    PAROLE #### CRUDAMENTE


Suggerimenti
------------

Per ottenere una stringa di `#` di lunghezza variabile, potete usare il metodo
`substring` della classe `String` a partire da una stringa di lunghezza fissata
(pari alla massima necessaria).
