Quanti massimi
==============

Descrizione
-----------

Scrivete un programma che, data nel flusso di ingresso una sequenza di numeri
interi positivi terminata dal numero `0`, emetta nel flusso di uscita il numero
di volte in cui il valore massimo presente nella sequenza vi compare.


Vincoli
-------

La sequenza può contenere un numero di elementi che va da 0 a 1000, inoltre
tutti i numeri in gioco (ossia i numeri della sequenza ed il numero di volte
che il massimo può comparirvi), possono essere rappresentati con variabili di
tipo `int`.

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
    1
    9
    4
    0

nel flusso di ingresso, il programma emette `3` nel flusso di ingresso, infatti
il valore massimo della sequenza è `9` ed esso compare 3 volte.
