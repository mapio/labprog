Distanza tra dispari
====================

Descrizione
-----------

Data una sequenza di numeri interi diremo che due numeri dispari sono a distanza
`N` se tra di loro si trovano esattamente `N` numeri pari.

Ad esempio

    1 2 3 4 4 5 6 7 8 10 6 12 9

la distanza tra `1` e `3` è 1, tra `3` e `5` è 2, tra `5` e `7` è 1 e tra `7` e `9` è 4.

Scrivere un programma che, data una sequenza di numeri interi, terminata da `0`,
nel flusso di ingresso emetta nel flusso di uscita la massima distanza tra i
numeri dispari in essa contenuti.


Vincoli
-------

Non ci sono vincoli sulla quantità di numeri nella sequenza, viceversa, tutti i
numeri coinvolti possono essere rappresentati con variabili di tipo `int`.


Esempio
-------

Eseguendo `soluzione` e avendo

    1 2 3 4 4 5 6 7 8 10 6 12 9 0

nel flusso di ingresso, il programma emette 4 nel flusso di uscita.
