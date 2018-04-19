Il crivello di Eratostene
=========================

Descrizione
-----------

Eratostene di Cirene era un matematico alessandrino vissuto circa trecento anni
prima della nascita di Cristo. A lui si attribuisce una tecnica molto semplice
per trovare i numeri primi: il *crivello* (o setaccio). Per trovare i numeri
primi minori di un assegnato intero `N` secondo tale tecnica si procede in
questo modo:

- si predispone una tabella con `N` posti, inizialmente "vuoti";
- per ogni posizione P della tabella dalla seconda in poi, se è vuota si
  "riempiono" tutte le posizioni multiple di P;

al termine del procedimento, le posizioni "vuote" corrispondono ai numeri primi
(se infatti una posizione corrispondesse a un numero composto, sarebbe stata
riempita).

Scrivete un programma che, dato un intero `N` come parametro sulla linea di
comando, emetta nel flusso di uscita tutti e soli i numeri primi minori o uguali
di `N`.


Vincoli
-------

Il numero `N` è compreso tra 1 e 500000, estremi compresi. Il flusso di uscita
deve contenere un numero primo per riga.


Esempio
-------

Eseguendo `soluzione 11` il programma emette nel flusso di uscita

    2
    3
    5
    7
    11


Suggerimenti
------------

Quali posizioni vanno esaminate? Dovendo eliminare i multipli, è sufficiente
fermarsi a `N`/2 (come ultimo numero di cui eliminare i multipli), oppure si
possono esaminare ancora meno posizioni? Se `N` non è primo, quanto è grande al
più il suo più piccolo divisore?
