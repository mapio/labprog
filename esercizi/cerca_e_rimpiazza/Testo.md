Cerca e rimpiazza
=================

Descrizione
-----------

Molti editor offrono l'opportunità di cercare una parola nel testo e di
rimpiazzarla con un'altra. Scopo di questo esercizio è implementare una versione
semplificata di questa funzionalità.

In particolare, date due stringhe come argomenti della riga di comando e un
testo nel flusso di ingresso si chiede di emettere nel flusso di uscita il testo
in ingresso dove tutte e sole le occorrenze della prima stringa siano sostituite
con quelle della seconda.


Vincoli
-------

Non ci sono vincoli di alcun tipo sul contenuto delle stringhe o del testo in
ingresso. Le stringhe possono avere lunghezza arbitraria, viceversa il testo in
ingresso può avere lunghezza massima pari a 1000 caratteri.


Esempio
-------

Eseguendo `soluzione riso pasta` e avendo nel flusso di ingresso

    a me piace mangiare il riso,
    perché penso che il riso sia più buono della pasta!

il programma emette nel flusso di uscita

    a me piace mangiare il pasta,
    perché penso che il pasta sia più buono della pasta!

Similmente, eseguendo `soluzione 00 pippo` e avendo nel flusso di ingresso

    12300456

il programma emette nel flusso di uscita

    123pippo456


Suggerimenti
------------

Si consiglia di leggere tutto il testo in un vettore di caratteri prima di
iniziare ad emettere l'output.
