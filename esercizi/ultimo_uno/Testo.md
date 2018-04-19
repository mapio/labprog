Ultimo uno
==========

Descrizione
-----------

Scrivete un programma che, data una sequenza di zeri e uni (tarminata da un
punto) nel flusso di ingresso, emettere nel flusso d'usita l'indice dell'ultimo
uno che vi compare (contando a partire da zero).

Ad esempio, se il flusso di ingresso contiene

    01001010110101001000.

il programma deve emettere nel flusso di uscita

    16

poiché la sedicesima posizione contiene un uno e tutte le successive uno zero.


Vincoli
-------

Non ci sono vincoli sul numero di caratteri in ingresso, fatto salvo che la
posizione dell'ultimo uno può essere rappresentata con una variabile di tipo
`long`. Si può assumere che sia sempre presente almeno un uno (e che il flusso
termini con un punto) e che il flusso non contenga spazi.


Esempio
-------

Eseguendo `soluzione` e avendo

    00010.

nel flusso di ingresso, il programme emette `3`.
