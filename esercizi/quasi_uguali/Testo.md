Quasi uguali
============

Descrizione
-----------

Date due stringhe composte dai caratteri `A`, `B`, `C`, ..., `Z` e `-` diciamo
che sono *quasi uguali* quando sono (ordinatamente) uguali tutti i loro
caratteri diversi da `-`; altrimenti detto, quando sono uguali le stringhe che
si otterrebbero cancellando tutte e sole le occorrenze di `-` da entrambe.

Ad esempio, sono quasi uguali le coppie di stringhe

    --P---A-NE-- PANE
    SA-LE --SAL---E
    -T-O-N-N-O-- ------TONN----O

mentre non lo sono

    CANE PANE
    C-ARNE --PESSCE-

Scrivete un programma che, data una sequenza di linee nel flusso di ingresso
contenente ciascuna due stringhe (nel formato specificato sopra e separate da
un singolo spazio), emetta nel flusso di uscita una sequenza di linee
contenenti ciascuna `s`, o `n`, a seconda che la corrispondente riga del
flusso di ingresso contenga, o meno, due stringhe quasi uguali.


Vincoli
-------

Le stringhe in ingresso sono al più lunghe 1024 caratteri ciascuna, mentre non
c'è vincolo sul numero di linee nel flusso di ingresso (che termina
esclusivamente al raggiungimento dell'`EOF`).


Esempio
-------

Eseguendo

    `soluzione`

e avendo nel flusso di ingresso

    --P---A-NE-- PANE
    SA-LE --SAL---E
    CANE PANE
    -T-O-N-N-O-- ------TONN----O
    C-ARNE --PESSCE-

il programma emette

    s
    s
    n
    s
    n

nel flusso di uscita.
