Amitlu parola
=============

Descrizione
-----------

Scrivete un programma che, data una sequenza di parole nel flusso di ingresso,
emetta nel flusso di uscita la parola che risulterebbe ultima rovesciando (dal
primo all'ultimo carattere) le parole in ingresso e disponendo le parole così
ottenute in ordine alfabetico.

Ad esempio, avendo nel flusso di ingresso le parole

    zorro
    cane
    fuzz
    mela

il programma emette `fuzz` nel flusso di uscita, infatti rovesciando ed ordinano
le parole si ottiene

    alem
    enac
    orroz
    zzuf

da cui si evince che l'ultima parola è `fuzz`.


Vincoli
-------

Per parola si intende una sequenza di caratteri alfabetici minuscoli, le parole
sono separate da uno (o più) simboli di spaziatura (spazio, o *a-capo*). Non ci
sono però limiti sul numero di parole nel flusso di ingresso.


Esempio
-------

Eseguendo `soluzione` e avendo

    uno
    due
    tre

nel flusso di ingresso, il programma emette `uno` nel flusso di uscita.


Suggerimenti
------------

Si osservi che le soluzioni che memorizzano tutte le parole lette non saranno
considerate corrette dal momento che non è dato alcun vincolo sul numero di
parole e la loro memorizzazione potrebbe esaurire la memoria disponibile.
