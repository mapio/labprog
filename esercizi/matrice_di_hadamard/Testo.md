Matrice di Hadamard
===================

Descrizione
-----------

Si consideri una sequenza di matrici di dimensione `N` x `N` a valori in
`0` e `1` costruita come segue:

- per `N` uguale a `1` la matrice è

      1

- ad ogni raddoppio di dimensione, la nuova matrice è ottenuta giustapponendo
  quattro copie della matrice della dimensione precedente, invertendo però i
  valori della quarta copia, posta "in basso a sinistra".

Le prime tre matrici della sequenza sono:

    1

    1 1
    1 0

    1 1 1 1
    1 0 1 0
    1 1 0 0
    1 0 0 1


Si scriva un programma che, data la dimensione `N` come parametro sulla linea di
comando, emetta nel flusso di ingresso la matrice di dimensione `N` x `N`.


Vincoli
-------

La dimensione `N` è sempre positiva e pari a una potenza di due, non è garantito
che `N` sia sufficientemente piccolo perché una matrice `N` x `N` possa essere
contenuta in memoria.

Il flusso di uscita deve contenere esclusivamente i caratteri `0`, `1` e
*a-capo*, i valori su ciascuna riga della matrice non vanno quindi separati da
spazio, viceversa le righe della matrice vanno emesse una per ciascuna riga
dell'output.


Esempio
-------

Eseguendo `soluzione 8` il programma emette

    11111111
    10101010
    11001100
    10011001
    11110000
    10100101
    11000011
    10010110

nel flusso di uscita.


Suggerimenti
------------

Non è necessario memorizzare la matrice per poterla emettere: è sufficiente
riflettere sul fatto che il valore presente in una certa posizione della matrice è
uguale a quello che avrebbe il valore "corrispondente" nella matrice di metà
dimensione (eventualmente scambiando gli `0` e gli `1`).
