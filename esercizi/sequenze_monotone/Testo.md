Sequenze monotone
=================

Descrizione
-----------

Una sequenza non vuota di interi si dice *monotona crescente* se ogni numero
della sequenza è (strettamente) maggiore del precedente, similmente si dice
*monotona decrescente* se ogni numero della sequenza è (strettamente) minore del
precedente. Se, viceversa, capita sia che ci siano numeri maggiori, che minori,
del precedente, si dice che la sequenza è non monotona.

Scrivete un programma che, data una sequenza non vuota di interi nel flusso di
ingresso, emetta nel flusso di uscita `-1`, `0`, o `1` a seconda che la sequenza
sia rispettivamente: monotona decrescente, non monotona, o monotona crescente.

Ad esempio, data nel flusso di ingresso una delle tre sequenze

    5 4 2 1
    1 4 2 6 3
    2 5 7 9 10 32

il programma deve, rispettivamente, emettere nel flusso di uscita

    -1
    0
    1


Vincoli
-------

Ogni numero della sequenza può essere rappresentato da una variabile di tipo
`int`, non ci sono viceversa vincoli sul numero massimo di numeri della
sequenza.


Esempio
-------

Eseguendo `soluzione` e avendo

    1 2 0 4 5

nel flusso di ingresso il programma emette

    0

nel flusso di uscita.
