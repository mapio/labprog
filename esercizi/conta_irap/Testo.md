Conta i numeri irap
===================

Descrizione
-----------

Diciamo che un numero è *irap* se rovesciando le sue cifre dalla prima
all'ultima si ottiene un numero pari. Ad esempio, è irap `431` (perché 134 è
pari) e `221` (perché 122 è pari); non è viceversa irap `12` (perché 21 non è
pari) e neppure e `1734` (perché 4371 non è pari).

Scrivere un programma che, data una sequenza di interi positivi terminata da `0`
nel flusso di ingresso, emetta nel flusso di uscita quanti tra essi sono numeri
irap (senza contare lo `0`).


Vincoli
-------

Tutti i numeri coinvolti possono essere rappresentati con variabili di tipo
`int`, viceversa non c'è vincolo sul numero di interi nella sequenza che (a
parte lo `0` finale) può essere anche vuota.


Esempio
-------

Eseguendo `soluzione` e avendo

    431
    12
    221
    734
    55
    72

nel flusso di ingresso, il programma emette `2` nel flusso di uscita.
