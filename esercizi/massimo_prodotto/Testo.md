Massimo prodotto
================

Descrizione
-----------

Data una sequenza di interi, chiamiamo *segmento* una sua sottosequenza
massimale non vuota costituita da numeri diversi da `0`.

Ad esempio, data la sequenza

    1 2 0 3 6 4 0 8 -1 5 0 7 9

i suoi segmenti sono le sottosequenze

    1 2
    3 6 4
    8 -1 5
    7 9

ma non lo è `3 6`, in quanto potendo essere estesa a `3 6 4` non è massimale;
osservate che non è detto che l'ultimo numero della sequenza sia uno `0`.

Scrivete un programma che, data una sequenza di numeri interi nel flusso di
ingresso, emetta nel flusso di uscita il valore più grande ottenibile
moltiplicando tra loro tutti gli elementi di un suo segmento.

Ad esempio, data la precedente sequenza, i valori ottenibili come prodotto
sono

    2 = 1 * 2
    72 = 3 * 6 * 4
    -40 = 8 * -1 * 5
    63 = 7 * 9

quindi il programma deve emettere `72`.

Vincoli
-------

Non si possono assumere vincoli sul numero di interi nel flusso di ingresso,
viceversa, si può assumere che essi siano tutti rappresentabili con variabili
di tipo `int` e che tutti i prodotti possano essere rappresentati con variabili
di tipo `long`.


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
    8
    -1
    5
    0
    7
    9

nel flusso di ingresso, il programma emette `72` nel flusso di uscita.
