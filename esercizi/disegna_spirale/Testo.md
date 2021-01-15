Spirale numerica
================

Descrizione
-----------

Scopo dell'esercizio è, dato un intero positivo `N` sulla linea di comando,
emettere nel flusso di uscita una matrice di lato `N` contenente i numeri interi
da `1` a `N²` (estremi compresi) disposti in senso orario "a spirale".

Ad esempio, se `N` è pari a `4` il programma emette

     1   2   3   4
    12  13  14   5
    11  16  15   6
    10   9   8   7

mentre se `N` è pari a `10` il programma emette

     1   2   3   4   5   6   7   8   9  10
    36  37  38  39  40  41  42  43  44  11
    35  64  65  66  67  68  69  70  45  12
    34  63  84  85  86  87  88  71  46  13
    33  62  83  96  97  98  89  72  47  14
    32  61  82  95 100  99  90  73  48  15
    31  60  81  94  93  92  91  74  49  16
    30  59  80  79  78  77  76  75  50  17
    29  58  57  56  55  54  53  52  51  18
    28  27  26  25  24  23  22  21  20  19


Vincoli
-------

Il numero `N` è compreso tra `1` e `30` estremi inclusi.


Esempio
-------

Eseguendo `soluzione 2` il programma emette nel flusso di uscita

    1   2
    4   3

oppure, eseguendo `soluzione 5` il programma emette nel flusso di uscita

     1   2   3   4   5
    16  17  18  19   6
    15  24  25  20   7
    14  23  22  21   8
    13  12  11  10   9


Suggerimenti
------------

Usate l'istruzione `System.out.printf` con stringa di formato uguale a `"%4d"`
per stampare i numeri, in modo che siano opportunamente spaziati; detto
altrimenti, usate l'istruzione

    System.out.printf("%4d", v);

per stampare il valore `v` di una data riga e colonna della matrice.
