Distanza tra pari
=================

Descrizione
-----------

Data una sequenza di numeri interi diremo che due numeri pari sono a *distanza*
`N` se tra di loro si trovano esattamente `N` numeri dispari e nessun numero
pari.

Ad esempio, data la sequenza

    1 2 3 4 9 5 6 7 11 3 5 8 13

la distanza tra `2` e `4` è `1`, tra `4` e `6` è `2` e tra `6` e `8` è `4`.

Scrivere un programma che, data una sequenza di numeri interi terminata da `0`
nel flusso di ingresso, emetta nel flusso di uscita la massima distanza tra i
numeri pari in essa contenuti, o `-1` se nella sequenza non ci sono almeno due
numeri pari.


Vincoli
-------

Non ci sono vincoli sulla quantità di numeri nella sequenza, viceversa, tutti i
numeri coinvolti possono essere rappresentati con variabili di tipo `int`. I
valori nel flusso di uscita devono essere tutti su una sola riga, separati da un
singolo spazio.

Esempio
-------

Eseguendo `soluzione` e avendo

    4 1 3 2 3 4 22 4 5 6 7 8 10 6 12 9 0

nel flusso di ingresso, il programma emette `2` nel flusso di uscita.
