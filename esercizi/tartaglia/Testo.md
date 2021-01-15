Tartaglia
=========

Descrizione
-----------

Il triangolo di Tartaglia

     1
     1     1
     1     2     1
     1     3     3     1
     1     4     6     4     1
     1     5    10    10     5     1
     1     6    15    20    15     6     1
    ...

si può costruire a partire dalla prima riga (che contiene il numero 1),
ottenendo la riga successiva come segue:

- il primo e l'ultimo elemento sono pari a 1,
- ciascun altro elemento è dato dalla somma dell'elemento sopra esso e di
  quello sopra e a sinistra di esso.

Ad esempio, la quinta riga è data da

    1     4     6     4     1

l'elemento `4` (sostituito di seguito da un `=`) è ottenuto sommando i numeri della
riga precedente (sostituiti di seguito da un `+`)

    +     +     3     1
    1     =     6     4     1

e similmente l'elemento `6` è stato ottenuto da

    1     +     +     1
    1     4     =     4     1

Scrivete un programma che, dato un intero positivo N nel flusso di ingresso,
emetta nel flusso di uscita la N-esima riga del triangolo di Targaglia.


Vincoli
-------

I numeri coinvolti sono rappresentabili con variaibli di tipo `int`. La riga va
emessa separando i numeri l'uno dall'altro con un solo spazio.


Esempio
-------

Eseguendo

    soluzione

e avendo `10` nel flusso di ingresso, il programma emette nel flusso di uscita

    1 9 36 84 126 126 84 36 9 1


Suggerimenti
------------

Definite un metodo statico con segnatura `public static int triangolo(int riga,
int colonna)` che resituisca il valore del triangolo di Tartaglia nella
posizione specificata. Nell'implementazione di tale metodo, secondo la
definizione data di triangolo di Tartaglia, potete richiamare questo stesso
metodo (su coordinate minori).
