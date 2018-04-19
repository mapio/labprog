L'ultimo caporale
=================

Descrizione
-----------

Data una sequenza di numeri interi positivi, diciamo che un numero della
sequenza è un *caporale* se non è l'ultimo numero della sequenza ed è maggiore
di tutti i numeri che lo seguono. Ad esempio, data la sequenza

    10 8 6 4 5 7 3 2 6

sono caporali il `10`, l'`8` e il `7`. Scrivete un programma che, data una
sequenza di interi positivi nel flusso di ingresso, stampi l'ultimo caporale
della sequenza, oppure nulla se nella sequenza non ci sono caporali.
Nell'esempio precedente, il programma deve emettere `7`. Viceversa, nella sequenza

    1 2 3 4

non ci sono caporali, perché ciascun numero (tranne l'ultimo) è seguito da
numeri maggiori di esso; su tale input, il programma non deve emettere nulla.


Vincoli
-------

La sequenza comprende un numero di interi tra 2 e 10000 (estremi inclusi): tutti
i numeri coinvolti sono rappresentabili con variabili di tipo `int`.


Esempio
-------

Eseguendo `soluzione` e avendo

    10 8
    8 7 6    5
    4 3 9

nel flusso di ingresso, il programma emette `10` nel flusso di uscita.
