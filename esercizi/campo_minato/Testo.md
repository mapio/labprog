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

Obiettivo del programma, dato in ingresso un campo di battaglia in cui le
posizioni libere sono rappresentate da un punto e le mine da un asterisco, è
emettere una matrice che abbia un asterisco in corrispondenza di ogni mina e, in
corrispondenza delle posizioni senza mine, un numero (compreso tra `0` e `8`)
pari a quante mine sono contenute nelle posizioni adiacenti del campo.

Ad esempio, dato in ingresso il campo minato

    *...
    ....
    .*..
    ....

il programma deve emettere la matrice

    *100
    2210
    1*10
    1110

Per capire meglio il risultato, consideriamo la matrice

    XX..
    YX..
    XX..
    ....

il `2` presente nella soluzione nella posizione corrispondente alla lettera `Y`
indica il fatto che nelle posizioni adiacenti, marcate con la lettera `X`, ci
sono complessivamente `2` mine.


Vincoli
-------

Il campo minato ha dimensione compresa tra 1 x 1 e 1000 x 1000.


Esempio
-------

Eseguendo `soluzione` e avendo nel flusso di ingresso

    .*.*.*.*
    ........
    ***.....
    .......*
    ........
    ..**....
    ..**....
    .......*

il programma emette nel flusso di uscita

    1*2*2*2*
    34422121
    ***10011
    2321001*
    01221011
    02**2000
    02**2011
    0122101*


Suggerimenti
------------

Per contare il numero di mine adiacenti a una posizione (*r*, *c*) conviene
definire una funzione (o metodo) che (per una fissata matrice *M*) dati due
interi *i* e *j*, restituisca:

-) 1 se *i* corrisponde a una riga di *M*, *j* corrisponde a una colonna di *M*
   e nella posizione (*i*, *j*) di *M* c'è un asterisco;

-) 0 altrimenti.
