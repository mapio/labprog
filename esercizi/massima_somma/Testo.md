Massima somma
=============

Descrizione
-----------

Data una sequenza di interi, chiamiamo *segmento* una sua sottosequenza
massimale non vuota costituita da numeri diversi da `0`.

Ad esempio, data la sequenza

    1 2 0 3 6 4 0 7 9 0 8 -1 5

i suoi segmenti sono le sottosequenze

    1 2
    3 6 4
    7 9
    8 -1 5

ma non lo è `3 6`, in quanto potendo essere estesa a `3 6 4` non è massimale;
osservate che non è detto che l'ultimo numero della sequenza sia uno `0`.

Scrivete un programma che, data una sequenza di numeri interi nel flusso
di ingresso, emetta nel flusso di uscita il valore più grande ottenibile
sommando tra loro tutti gli elementi di un suo segmento.

Ad esempio, data la precedente sequenza, i valori ottenibili come somma
sono

    3 = 1 + 2
    13 = 3 + 6 + 4
    16 = 7 + 9
    12 = 8 + ( -1 ) + 5

quindi il programma deve emettere `16`.

Vincoli
-------

Non si possono assumere vincoli sul numero di interi nel flusso di ingresso,
viceversa, si può assumere che essi siano tutti rappresentabili con variabili di
tipo `int` e che tutte le somme possano essere rappresentati con variabili di
tipo `long`.


Esempio
-------

Eseguendo `soluzione` e avendo

    1
    2
    0
    3
    6
    4
    0
    7
    9
    0
    8
    -1
    5

nel flusso di ingresso, il programma emette `16` nel flusso di uscita.
