Forza quattro
=============

Descrizione
-----------

Questo esercizio è ispirato a "Forza quattro", un gioco da tavolo a due
giocatori in cui vince il primo giocatore che riesce ad allineare (in
verticale, orizzontale, o diagonale) quattro pedine disponendole secondo
opportune regole in una scacchiera di dimensione 6 x 7.

Chiamiamo *configurazione* una sequenza di `N` linee (terminate dal carattere
*a-capo*) composte di `M` caratteri scelti tra: `.`, o `*`; diciamo che una
configurazione è *vincente* se

- c'è una *riga+ che contiene 4 caratteri consecutivi uguali a `*`, oppure

- ci sono 4 righe consecutive che contengono il carattere `*` nella stessa
  posizione, ossia, c'è una *colonna* che contiene 4 caratteri consecutivi
  uguali a `*`.

Scrivete un programma che, data una configurazione nel flusso di ingresso,
emetta `*`, o `.`, nel flusso di uscita qualora essa sia, rispettivamente,
vincente, o meno.

Se ad esempio il flusso di ingresso contiene

    ...
    .*.
    .*.
    .*.
    .*.
    ...

il programma emette `*`; infatti, le 4 linee dalla seconda alla quinta
contengono il carattere `*` nella stessa posizione, ossia ci sono 4 caratteri `*`
consecutivi nella seconda colonna.


Vincoli
-------

Potete assumere che `N` ed `M` siano compresi tra 1 e 1000 estremi inclusi.


Esempio
-------

Eseguendo `soluzione` e avendo

    ......
    .****.
    ......

nel flusso di ingresso il programma emette `*` nel flusso di uscita.
