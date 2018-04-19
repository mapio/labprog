La posizione della parola più pesante
=====================================

Descrizione
-----------

Definiamo *peso* di una parola il numero di volte che la lettera con cui inizia
compare in essa. Ad esempio, di seguito è riportato un elenco di parole ciascuna
preceduta dal suo peso

    3    mamma
    1    pino
    5    attanagliata
    2    calca

infatti `mamma` contiene `3` volte la lettera `m`, `pino` contiene una sola
volta la `p` e via discorrendo.

Scrivete un programma che, dato un elenco di parole nel flusso di ingresso,
emetta nel flusso di uscita il peso della parola più pesante.


Vincoli
-------

Non ci sono vincoli sul numero e sulla lunghezza delle parole in ingresso; il
peso di ciascuna parola può essere rappresentato con una variabile di tipo
`int`.

Le parole sono costituite dalle lettere dell'alfabeto minuscolo

    a, b, c, ..., z

e ciascuna parola (ultima compresa) è seguita dal carattere di *a-capo*.


Esempio
-------

Eseguendo `soluzione` e avendo

    mamma
    pino
    attanagliata
    calca

nel flusso di ingresso, il programma emette `5` nel flusso di uscita.
