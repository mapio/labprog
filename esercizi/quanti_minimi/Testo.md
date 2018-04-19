Quanti minimi
=============

Descrizione
-----------

Scrivete un programma che, data nel flusso di ingresso una sequenza di numeri
interi positivi terminata dal numero `0`, emetta nel flusso di uscita il numero
di volte in cui il valore minimo (`0` escluso) presente nella sequenza vi
compare.


Vincoli
-------

Non ci sono vincoli sul numero di numeri nella sequenza; saranno considerate
errate tutte le soluzioni in cui verrà assunto in modo esplicito, o implicito,
che la sequenza contiene un numero limitato (per quanto alto) di numeri; in
particolare, questo significa che la sequenza non deve essere memorizzata (ad
esempio in un vettore, o in una struttura dati dinamica).

Viceversa tutti i numeri in gioco (ossia ciascun numero della sequenza ed il
numero di volte che il minimo può comparirvi), hanno dimensione tale da poter
essere rappresentati con variabili di tipo `int`.

Se la sequenza non contiene alcun numero (oltre allo `0` che la termina), il
programma deve emettere `0`.


Esempio
-------

Eseguendo `soluzione` e avendo

    2
    4
    6
    9
    6
    9
    2
    2
    9
    4
    0

nel flusso di ingresso, il programma emette `3` nel flusso di ingresso, infatti
il valore minimo della sequenza è `2` ed esso compare 3 volte.
