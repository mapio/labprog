Somma telescopica
=================

Descrizione
-----------

Scrivete un programma che legga dal flusso di ingresso una sequenza di numeri
interi positivi

    n_0
    n_1
    n_2
    n_3
    ...

e calcoli la sequenza di somme

    n_0
    n_0 - n_1
    n_0 - n_1 + n_2
    n_0 - n_1 + n_2 - n_3
    n_0 - n_1 + n_2 - n_3 - n_4 ...

(ossia sommi il primo numero, sottragga al risultato il secondo, poi sommi al
risultato il terzo, quindi sottragga al risultato il quarto e così di seguito)
arrestandosi la prima volta che il risultato è negativo, ed emetta quindi tale
valore nel flusso di uscita.

Se il risultato non diventa mai negativo, il programma non deve emettere nulla.


Vincoli
-------

Tutti i numeri coinvolti possono essere rappresentati con variabili di tipo
`int`, non ci sono vincoli sul numero di interi nel flusso di ingresso (che in
particolare possono non essere in numero pari).

Esempio
-------

Se il flusso di ingresso contiene

    10
    3
    20
    13
    30
    50
    60
    70
    80

eseguendo `soluzione` il programma emette

    -6

infatti:

    10 > 0
    10 - 3 = 7 > 0
    10 - 3 + 20 = 27  > 0
    10 - 3 + 20 - 13 = 14 > 0
    10 - 3 + 20 - 13 + 30 = 44 > 0
    10 - 3 + 20 - 13 + 30 - 50 = -6 < 0
