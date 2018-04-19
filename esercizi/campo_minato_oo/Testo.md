Campo minato
============

Descrizione
-----------

*Campo minato* è un ben noto gioco di strategia in cui il giocatore deve
individuare la posizione di alcune mine in un campo di battaglia rappresentato
come una matrice rettangolare di possibili posizioni.

Un ingrediente fondamentale del gioco è determinare, per ogni posizione del
campo, quante *mine* si trovino in posizioni adiacenti ad essa; per ciascuna
posizione si considerano adiacenti le (al più) otto posizioni che si ottengono
spostandosi di una riga e/o di una colonna nella matrice.

Ad esempio, nella matrice

    ........
    ..BBB...
    ..BAB...
    ..BBB...
    ........
    ......DD
    ......DC

le otto posizioni adiacenti a quella occupata dalla lettera `A` sono occupate
dalla lettera `B`; evidentemente, le posizioni sui bordi hanno meno di otto
posizioni adiacenti, fino ad un minimo di tre, come nel caso della posizione
occupata dalla lettera `C` che ha per adiacenti le posizioni occupate dalla
lettera `D`.

Se le posizioni libere sono rappresentate da un punto e le mine da un asterisco,
un campo di battaglia è ad esempio

    *...
    ....
    .*..
    ....

in questo esempio, il numero di mine attorno alla posizione di riga `0` e
colonna `1` è pari a `1`, così come il numero di mine attorno alla posizione di
riga `1` e colonna `0` è pari a `2`.

Si scriva un programma che sia in grado di gestire un insieme di `M` campi
minati rispondendo ai seguenti comandi:

- `leggi N R C` che legge il campo minato di numero 0 < `N` < `M` specificato
  sulle seguenti `R` righe di `C` caratteri ciascuna,
- `mine N R C` che stampa il numero di mine adiacenti alla posizioni di riga `R`
  e colonna `C` del campo minato di numero `N`.

Vincoli
-------

Ogni campo minato ha dimensione compresa tra 1 x 1 e 1000 x 1000, ci sono al più
100 campi minati.


Esempio
-------

Eseguendo `soluzione` e avendo nel flusso di ingresso

    leggi 1 8 8
    .*.*.*.*
    ........
    ***.....
    .......*
    ........
    ..**....
    ..**....
    .......*
    mine 1 0 0
    mine 1 0 1

    leggi 2 3 4
    *...
    ....
    .*..
    mine 2 0 0
    mine 2 1 1
    mine 1 1 1

il programma emette nel flusso di uscita

    1
    0
    0
    2
    4


Suggerimenti
------------

Potrebbe essere comodo raccogliere gli *attributi* necessari per la
rappresentazione di un campo minato assieme alle *operazioni* in una apposita
classe.
