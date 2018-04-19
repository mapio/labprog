Parole precedute
================

Descrizione
-----------

Scrivere un programma che, data una sequenza di parole nel flusso di ingresso,
emetta nel flusso di uscita ciascuna parola letta se e solo se è immediatamente
preceduta da una parola uguale.

Ad esempio, se il flusso contiene

    girate
    una
    volta
    volta
    la
    vostra
    mano
    mano
    mano
    a
    destra
    non
    non
    sinistra

il programma emette

    volta
    mano
    mano
    non

si noti che la parola `mano` è emessa due volte perché, per due volte, compare
preceduta dalla `mano`.


Vincoli
-------

Non ci sono vincoli sul numero di parole, l'input contiene solo lettere
minuscole e *white-space*.


Esempio
-------

Eseguendo `soluzione` e avendo nel flusso di ingresso

    una
    volta
    due
    due
    volte
    ma
    non
    tre
    tre
    tre
    volte

il programma emette

    due
    tre
    tre

nel flusso di uscita
