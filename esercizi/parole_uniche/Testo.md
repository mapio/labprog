Parole uniche
=============

Descrizione
-----------

Scrivere un programma che, dato una riga terminata da un punto e contenente un
elenco di parole, emetta nel flusso di uscita un elenco di parole ottenuto da
esso eliminando le ripetizioni successive di ciascuna parola.

Ad esempio, se il flusso di ingresso contiene

    a me e a te non piace il pane e il formaggio.

il programma emette

    a me e te non piace il pane formaggio

avendo eliminato le ripetizioni di `e`, `a` ed `il` dopo la loro prima
comparsa nella lista.


Vincoli
-------

La linea contiene al più 1024 caratteri, le parole sono separate tra loro da
uno spazio.


Esempio
-------

Eseguendo `soluzione` e avendo

    la mia casa e la mia citta sono qui e la.

nel flusso di ingresso, il programma emette

    la mia casa e citta sono qui

nel flusso di uscita.
