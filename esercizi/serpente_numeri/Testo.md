Serpente di numeri
==================

Descrizione
-----------

Scrivete un programma che, dato un intero positivo `N` come argomento sulla
linea di comando, emetta nel flusso di uscita un quadrato di lato `N` ottenuto
disponendo consecutivamente i numeri compresi tra 1 e `N` * `N` da sinistra a
destra sulle linee dispari e da destra a sinistra su quelle pari, seguendo per
così dire il percorso

    -------------+
                 |
    +------------+
    |
    -------------+
                 |
    +------------+
    |
    +---...

Detto altrimenti (posto che `N` sia ad esempio `7`) le prime due righe sarnno
ottenute disponendo i numeri

    1, 2, 3, ... -> ... 7
    14, 13, 12, ... <- ... 8

e così via per le righe successive.


Vincoli
-------

Il numero `N` è compreso tra 1 e 10.

Per ragioni di allineamento, ciascun numero dev'essere stampato con un numero
di spazi bianchi che lo precedano in modo che la lunghezza complessiva (degli
spazi bianchi e delle cifre che lo compongono) sia sempre pari a 3.


Esempio
-------

Eseguendo `soluzione 3` il programma emette nel flusso di uscita

    1  2  3
    6  5  4
    7  8  9

si osservi che l'ultimo numero emesso è `9`, pari `3` * `3`. Similmente,
eseguendo `soluzione 5` il programma emette nel flusso di uscita

      1  2  3  4  5
     10  9  8  7  6
     11 12 13 14 15
     20 19 18 17 16
     21 22 23 24 25
