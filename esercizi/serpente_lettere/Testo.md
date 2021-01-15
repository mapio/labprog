Serpente di lettere
===================

Descrizione
-----------

Scrivete un programma che, dato un intero positivo N` come argomento sulla linea
di comando, emetta nel flusso di uscita un quadrato di lato `N` ottenuto
disponendo consecutivamente le prime `N` * `N` lettere minuscole (eventualmente
ripartendo da `a` dopo la `z`) da sinistra a destra sulle linee dispari e da
destra a sinistra su quelle pari, seguendo per così dire il percorso

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

    a, b, c, ... -> ... g
    n, m, l, ... <- ... h

e così via per le righe successive.


Vincoli
-------

`N`on ci sono limiti sul valore di `N`: se disponendo le lettere si raggiunge la
`z`, si deve ricominciare dalla `a` (anche più volte, se necessario). Il
programma non deve emettere spazi tra le lettere, ma solo un *a-capo* alla fine
di ogni riga.

Dal momento che non è dato alcun limite al valore di `N`, saranno considerate
errate tutte le soluzioni che memorizzano le lettere da stampare in una
qualunque struttura dati di dimensione proporzionale a `N` (ad esempio, in una
matrice quadrata `N` * `N`).


Esempio
-------

Eseguendo `soluzione 3` il programma emette nel flusso di uscita

    abc
    fed
    ghi

Similmente, eseguendo `soluzione 6` il programma emette nel flusso di uscita

    abcdef
    lkjihg
    mnopqr
    xwvuts
    yzabcd
    jihgfe
