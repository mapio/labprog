Discesa rapida
==============

Descrizione
-----------

Per scendere da una *montagna* di numeri come, ad esempio,

      1
     2 3
    4 5 6

uno sciatore può scegliere di volta in volta se andare a sinistra, o a destra;
nell'esempio, può scendere da `1` a `2` e `3`, da `2` a `4` e `5`, infine da
`3` a `5` e `6`. La *durata* della sua discesa è pari alla somma di tutti i
numeri che scelto; nell'esempio la discesa più rapida ha durata pari a `7`, data
dalla sequenza `1 2 4`

Nella montagna

       3
      7 4
     2 4 6
    8 5 9 3

la discesa più rapida ha una durata pari a `16`, corrispondente alla sequenza `3
4 4 5`, o alla discesa `3 4 6 3`.


Vincoli
-------

Il flusso di ingresso contiene un numero intero `N` pari all'*altezza* (numero
di righe della montagna) della montagna seguito da altri `N (N + 1) / 2` numeri
(separati da *white-space*) corrispondenti ai valori della montagna stessa. Ogni
numero (sia in ingresso che uscita) può essere rappresentato con una variabile
di tipo `int`; il flusso di uscita deve contenere un solo numero intero seguito
da a-capo.


Esempio
-------

Eseguendo `soluzione` e avendo

    6 75 95 64 17 47 82 18 35 87 10 20 4 82 47 65 19 1 23 75 3 34

nel flusso di ingresso, il programma emette `210` corrispondente alla sequenza
`75 95 17 18 4 1`, nella montagna

              75
            95  64
          17  47  82
        18  35  87  10
      20   4  82  47  65
    19   1  23  75   3  34

descritta dai valori in ingresso.
