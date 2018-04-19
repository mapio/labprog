Isogramma
=========

Descrizione
-----------

Una parola è un *isogramma* se non contiene caratteri ripetuti. Scrivete un
programma che, data una sequenza di parole nel flusso di ingresso, emetta nel
flusso di uscita il numero di isogrammi tra esse.

Ad esempio, se il flusso di ingresso contiene

    tato
    come
    stai
    oggi

il programma emette `2` nel flusso di ingresso, in quanto `come` e `stai` sono
le due uniche parole in ingresso che non contengono caratteri ripetuti.


Vincoli
-------

Il flusso di ingresso contiene solo parole costituite da lettere minuscole
separate tra loro da uno, o più, caratteri di spaziatura *white-space* (tra cui
anche l'*a-capo*); va letto fino alla fine, ossia all'`EOF`. Non è garantito che
ci sia almeno una parola nel flusso di ingresso.


Esempio
-------

Eseguendo `soluzione` e avendo

    gatto matto
    ti ho nel
    sacco

nel flusso di ingresso, il programma emette `3` nel flusso di uscita.


Suggerimenti
------------

Implementate un metodo statico che, data una parola, determini se è un isogramma
o meno.
