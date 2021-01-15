Numeri scala
============

Descrizione
-----------

Un *numero scala* è un intero positivo `X` tale che la sua *n*-esmia cifra (a
partire dalla meno significativa, ossia da destra) è uguale al resto di `X`
diviso *n* + 1. Facendo un esempio, il numero `7211311` è un numero scala perché

    7211311 % 2 = 1
    7211311 % 3 = 1
    7211311 % 4 = 3
    7211311 % 5 = 1
    7211311 % 6 = 1
    7211311 % 7 = 2
    7211311 % 8 = 7

Scrivete un programma che, dato un numero come parametro sulla linea di comando,
emetta nel flusso di uscita `si`, oppure `no`, se il numero dato è,
rispettivamente, un numero scala, o meno.


Vincoli
-------

Tutti i numeri coinvolti possono essere rappresentati con variabili di tipo
`long` (ma non necessariamente `int`). Il flusso di uscita deve contenere
esclusivamente la stringa `si`, oppure `no`, terminata da a-capo.


Esempio
-------

Eseguendo `soluzione 13` il programma emette `no` nel flusso di uscita; eseguendo

    soluzione 8084220020

il programma emette `si` nel flusso di uscita.
Infine, eseguendo

	soluzione 9117311311

il programma emette `si` nel flusso di uscita.
