L'ultima lettra
===============

Descrizione
-----------

Scrivere un programma che, dato un elenco di parole come argomenti sulla linea
di comando, emetta nel flusso di ingresso la parola tra esse che termina con il
carattere che compare per ultimo in ordine alfabetico (tra tutti i caratteri con
cui terminano le parole date).

Ad esempio, se gli argomenti sulla linea di comando sono

    mi piaceva con amor il formaggio

il programma deve emettere nel flusso di ingresso

    amor

in quanto termina con `r` che è l'ultima lettera in ordine alfabetico tra: `i`,
`a`, `n`, `l` e `o` (che sono le ultime lettere delle altre parole).


Vincoli
-------

Non ci sono vincoli sul numero e lunghezza delle parole in ingresso. Potete
assumere che le parole terminino tutte con lettere diverse e che ci sia sempre
almeno una parola come argomento.


Esempio
-------

Eseguendo `soluzione mi piace il burro con marmellata` il programma emette
`burro` nel flusso di uscita.
