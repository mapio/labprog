Conta i quadrati
================

Descrizione
-----------

Scrivete un programma che, data una sequenza di interi positivi terminata da `0`
nel flusso di ingresso, emetta nel flusso di uscita il numero di volte in cui
accade che un numero di tale sequenza sia il quadrato del numero che lo precede.
Ad esempio, su ingresso

    3
    5
    25
    2
    9
    2
    4
    16
    0

il programma emette `3` perché: `25` è il quadrato di `5`, `4` lo è di `2` e
`16` lo è di `4`. Si osservi che il numero `9` non è contato perché è un
quadrato, ma non il quadrato di `2` che è il numero che lo precede.


Vincoli
-------

Non ci sono vincoli sul numero di interi in ingresso, ogni numero coinvolto nel
programma può essere rappresentato con una variabile di tipo `int`.


Esempio
-------

Eseguendo `soluzione` e avendo

    4
    2
    4
    16
    3
    9
    81
    0

nel flusso di ingresso, il programma emette `4` nel flusso di uscita.
