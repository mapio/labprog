Calcolatrice elementare
=======================

Descrizione
-----------

Scrivete un programma che, data una semplice operazione aritmetica nel flusso di
ingresso, ne emetta il risultato nel flusso di uscita. Il programma deve
considerare solo somma `+` tra due operandi interi.

Vincoli
-------

I numeri coinvolti possono tutti essere rappresentati da variabili di tipo
`int`.

Gli operandi e l'operatore sono separati da *white-space*, l'operatore è la
stringa `+` (non deve essere cioè gestito il caso in cui vengano introdotte
operazioni "sintatticamente errate").

L'output deve seguire esattamente il formato illustrato negli esempi.


Esempio
-------

Eseguendo

    soluzione

e avendo nel flusso di ingresso

    3 + 7

il programma emette nel flusso di uscita

    10

Eseguendo

    soluzione

e avendo nel flusso di ingresso

    10 + 3

il programma emette nel flusso di uscita

    13

Suggerimenti
------------

Potete leggere l'operazione tramite la sequenza di istruzioni

    int primoOperando = s.nextInt();
    String operatore = s.next();
    int secondoOperando = s.nextInt();

dove `s` è una variabile di tipo `Scanner` opportunamente inizializzata.
