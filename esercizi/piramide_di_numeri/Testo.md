Piramide di numeri
==================

Descrizione
-----------

Scrivete un programma che, dato un intero N non negativo come parametro sulla
linea di comando, disegni una "piramide di numeri" di N righe secondo l'esempio
seguente:

    ...0...
    ..010..
    .01210.
    0123210

che corrisponde alla piramide per N pari a `4`.

Più formalmente, ogni riga è una stringa palindroma di lunghezza dispari
composta da cifre decimali e `.` in cui *i*-esima cifra decimale (per *i* minore
o uguale a metà del numero di cifre, arrotondata per eccesso) è l'ultima cifra
decimale di *i* (contando a partire da 0).

Ad esempio, per N pari a `15` le ultime 5 righe della piramide saranno:

    ....012345678909876543210....
    ...01234567890109876543210...
    ..0123456789012109876543210..
    .012345678901232109876543210.
    01234567890123432109876543210

dove ad esempio si nota, sull'ultima riga, che dopo la cifra `9`, invece di
`10`, `11`, `12`, `13` e `14` compaiono solo `0`, `1`, `2`, `3`, `4`.


Vincoli
-------

Tutti i numeri coinvolti nel programma possono essere rappresentati da una
variabile di tipo `int`, viceversa non può essere assunto alcun limite sul
valore del numero N, che è solo garantito non essere negativo. Nel caso in cui è
pari a 0 il programma non deve emettere nulla.


Esempio
-------

Eseguendo `soluzione 1` il programma emette `0` nel flusso di uscita, mentre
seguendo `soluzione 13` il programma emettere

    ............0............
    ...........010...........
    ..........01210..........
    .........0123210.........
    ........012343210........
    .......01234543210.......
    ......0123456543210......
    .....012345676543210.....
    ....01234567876543210....
    ...0123456789876543210...
    ..012345678909876543210..
    .01234567890109876543210.
    0123456789012109876543210

nel flusso di uscita.
