Numeri narcisi
==============

Descrizione
-----------

Un numero decimale di *d* cifre è *narciso* se è pari alla somma delle *d*-esime
potenze delle sue cifre. Ad esempio

    153

è narciso perché le sue 3 cifre `1`, `5` e `3`, elevate alla terza potenza sono
tali che `1`³ + `5`³ + `3`³ = `153`.

Viceversa, il numero `41` non è narciso perché `4`² + `1`² = `17` e `17` è
diverso da `41`.

Scrivere un programma che, data una sequenza di interi positivi nel flusso
di ingresso, stampi quanti tra essi sono narcisi.


Vincoli
-------

Non si possono assumere vincoli sul numero di interi in ingresso, viceversa si
assuma che ciascun numero coinvolto possa essere rappresentato con una
variabile di tipo `long` (ma non necessariamente di tipo `int`).


Esempio
-------

Eseguendo `soluzione` e avendo nel flusso di ingresso

    100
    153
    200
    370
    124
    371
    424
    407

il programma emette `4` nel flusso di uscita, infatti `153`, `370`, `371`, `407`
sono narcisi, mentre gli altri numeri non lo sono.

Similmente, eseguendo `soluzione` e avendo

    32164049651

nel flusso di ingresso, il programma emette `1` nel flusso di uscita perché tale
numero è narciso (si osservi, per inciso, che tale numero non è rappresentabile
come `int`, ma solo come `long`).
