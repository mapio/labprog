Massima distanza
================

Descrizione
-----------

Data una sequenza di interi positivi (terminata da `0`), chiamiamo *distanza*
tra due interi positivi consecutivi la differenza tra il maggiore ed il minore
dei due o, detto altrimenti, il valore assoluto della loro differenza.

Ad esempio, nella sequenza

    1 2 3 6 4 8 5 0

le distanze sono

    1 1 3 2 4 3

in quanto

    2 - 1 = 1
    3 - 2 = 1
    6 - 3 = 3
    6 - 4 = 2
    8 - 4 = 4
    8 - 5 = 3

si osservi che lo `0`, che non è positivo, non viene considerato.

Scrivete un programma che, data una sequenza di interi positivi (terminata da
`0`) nel flusso di ingresso, emetta nel flusso di uscita la massima distanza tra
due interi positivi consecutivi della sequenza.

Ad esempio, data la precedente sequenza, il programma deve emettere `4`.

Vincoli
-------

Non si possono assumere vincoli sul numero di interi nel flusso di ingresso,
viceversa, si può assumere che essi siano tutti rappresentabili con variabili di
tipo `int` e che ci siano sempre almeno due numeri (oltre allo `0`) nel flusso.


Esempio
-------

Eseguendo `soluzione` e avendo

    1
    2
    3
    6
    4
    8
    5
    0

nel flusso di ingresso, il programma emette `4` nel flusso di uscita.
