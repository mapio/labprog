Disegna un diamante
===================

Descrizione
-----------

Il *diamente* corrispondente a una data lettera dell'alfabeto maiuscolo è una
figura composta di lettere maiuscole e punti in cui le lettere occupano le
posizioni di un rombo; ad esempio, il diamante corrispondente alla `B` è

    .A.
    B.B
    .A.

e quello corrispondente alla `E` è

    ····A····
    ···B·B···
    ··C···C··
    ·D·····D·
    E·······E
    ·D·····D·
    ··C···C··
    ···B·B···
    ····A····

Scrivete un programma che data una lettera compresa tra `A` e `Z` nel flusso di
ingresso emetta il corrispondente diamante nel flusso di uscita.


Vincoli
-------

La lettera è il primo carattere contenuto nel flusso di ingresso. Il flusso
di uscita deve contenere solo lettere maiuscole, il segno di punto e il carattere
di *a-capo*.

Esempio
-------

Eseguendo `soluzione` e avendo `C` nel flusso di ingresso, il programma emette

    ··A··
    ·B·B·
    C···C
    ·B·B·
    ··A··

nel flusso di uscita.


Suggerimenti
------------

Potete scrivere un metodo statico in grado di emettere l'assegnato numero di `.`
e quindi usarlo per scrivere due altri metodi statici: uno in grado di emettere
la prima (o ultima) riga del disegno (che contiene una sola lettera) e un
secondo in grado di mettere una delle altre righe del disegno (che contengono
due lettere ciascuna).
