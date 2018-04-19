Coppie consecutive
==================


Descrizione
-----------

Scrivere un programma che conti il numero di coppie di naturali consecutivi
uguali in una data sequenza. Ad esempio, nella sequenza

    3 12 4 2 2 3 5 6 7 7 7 9 11

ci sono tre coppie di numeri consecutivi uguali, una è composta dalla coppia di
`2`, mentre le altre due sono composte dalla prima e seconda coppia di `7` (che
sono parzialmente sovrapposte).


Più precisamente, data nel flusso di ingresso una sequenza di (al più 1000)
numeri interi terminata da `0`, il programma deve emettere nel flusso di uscita
il numero di coppie di numeri consecutivi uguali presenti nella sequenza.


Vincoli
-------

I numeri coinvolti possono essere rappresentati con variabili di tipo `int`. La
sequenza contiene almeno 1 ed al più 1000 numeri diversi da `0`. L'ultimo numero
presente nel flusso di ingresso è lo `0`.


Esempio
-------

Eseguendo `soluzione` e avendo

    3 12 4 2 2 3 5 6 7 7 7 9 11 0

nel flusso di ingresso, il programma emette `3` nel flusso di uscita. Esguendo
`soluzione` e avendo

    1 2 3 0

nel flusso di ingresso il programma emette `0` nel flusso di uscita.
