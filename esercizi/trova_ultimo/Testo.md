Trova l'ultimo
==============

Descrizione
-----------

Scrivere un programma che dato un intero come argomento sulla riga di comando ed
una sequenza di interi nel flusso in ingresso, uno per linea, emetta nel flusso
di uscita il numero dell'ultima linea in ingresso dove compare il valore
specificato sulla riga di comando, o `-1` se esso non compare in alcuna linea.


Vincoli
-------

Non ci sono vincoli sul numero di linee in ingresso (la sequenza termina per
`EOF`), tutti i numeri coinvolti possono essere rappresentati da variabili di
tipo `int`; le linee sono numerate da 0.


Esempio
-------

Eseguendo `soluzione 3` d avendo nel flusso di ingresso

    1
    3
    2
    4
    5
    6
    3
    2
    9

il programma emette `6` nel flusso in ingresso, infatti l'ultima volta che `3`
compare tra le linee in ingresso è sulla settima linea (le linee sono numerate a
partire da 0). Viceversa, eseguendo `soluzione 7` e avendo nel flusso di ingresso

    1
    4
    2
    5
    8
    6

il programma emette `-1` in quanto `7` non figura tra i numeri nel flusso di
ingresso.
