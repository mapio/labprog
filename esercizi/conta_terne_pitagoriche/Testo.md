Conta terne pitagoriche
=======================

Descrizione
-----------

Una terna di numeri naturali a, b e c è *pitagorica* se e solo se

    a² + b² = c²

un esempio di terna pitagorica è dato dai numeri 3, 4 e 5.

Scrivete un programma che, data una sequenza di interi positivi nel flusso di
ingresso, emetta nel flusso di uscita il numero di quante terne consecutive di
numeri sono pitagoriche.


Vincoli
-------

La sequenza in ingresso è in ordine crescente; il numero di terne, così come
ciascun numero della sequenza e il suo quadrato, possono essere rappresentati
con una variabile di tipo `int`.


Esempio
-------

Eseguendo `soulzione`e avendo nel flusso di ingresso

    3
    4
    5
    6
    7
    24
    25

il programma emette `2` nel flusso di uscita, infatti le uniche due terne di
numeri consecutivi che sono pitagoriche sono 3, 4, 5 e 7, 24, 25.

Eseguendo `soluzione`e avendo nel flusso di ingresso

    3
    4
    5
    12
    13
    14

il programma emette `2` essendo sia 3, 4, 5 che 5, 12, 13 due terne pitagoriche.
