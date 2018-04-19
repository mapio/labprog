Somma alternata
===============

Descrizione
-----------

Scrivete un programma che legga dal flusso di ingresso una sequenza di numeri
interi positivi

    n_0
    n_1
    n_2
    n_3
    ...
    n_k

e calcoli la sequenza di somme

    n_0
    n_0 - n_k
    n_0 - n_k + n_2
    n_0 - n_k + n_2 - n_(k-1)
    n_0 - n_k + n_2 - n_(k-1) - n_4 ...

(ossia sommi il primo numero, sottragga al risultato l'ultimo, poi sommi al
risultato il terzo, quindi sottragga al risultato il penultimo e così di
seguito) arrestandosi la prima volta che il risultato è negativo, ed emetta
quindi tale valore nel flusso di ingresso.

Se il risultato non diventa mai negativo, il programma non deve emettere nulla.


Vincoli
-------

Tutti i numeri coinvolti possono essere rappresentati con variabili di tipo
`int`, e il flusso di ingresso contiene al più 1000 numeri (ma non
necessariamente un numero pari di essi).


Esempio
-------

Eseguendo `soluzione` e avendo

    10
    20
    30
    60
    70
    80
    50
    13
    3

nel flusso di ingresso, il programma emette `-6` nel flusso di uscita, infatti:

    10 > 0
    10 - 3 = 7 > 0
    10 - 3 + 20 = 27  > 0
    10 - 3 + 20 - 13 = 14 > 0
    10 - 3 + 20 - 13 + 30 = 44 > 0
    10 - 3 + 20 - 13 + 30 - 50 = -6 < 0
