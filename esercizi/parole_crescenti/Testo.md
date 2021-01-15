Parole crescenti
================

Descrizione
-----------

Diciamo che una parola è crescente se i suoi caratteri sono in ordine alfabetico
strettamente crescente (ossia se ogni carattere viene dopo il precedente in
ordine alfabetico).

Ad esempio, sono crescenti: "abet", "benz",  e "struz"; non sono invece
crescenti: "casa" (perché la "a" viene prima della "c" che la precede) e
"struzz" (perché la seconda "z" non viene strettamente dopo la prima "z" in
ordine alfabetico).

Scrivere un programma che, data una sequenza di parole nel flusso di ingresso,
emetta nel flusso di uscita il numero di parole crescenti della sequenza.

Ad esempio, avendo

    abet
    casa
    struzzo
    xyz

nel flusso di ingresso, il programma emette `2` nel flusso di uscita, in quanto
solo `abet` e `xyz` sono crescenti.


Vincoli
-------

Non si possono fare assunzioni sul numero di caratteri presenti su ciascuna
linea. Le parole sono costituite da lettere minuscole e seprate tra di loro da
simboli di spaziatura (ossia *white-space* come ad esempio: spazio, "a capo" e
segni di tabulazione).

Il numero di parole sono rappresentabili con variabili di tipo `long` (ma non si
possono assumere altri vincoli sul numero massimo, o sulla lunghezza massima
delle parole).


Esempio
-------

Eseguendo `soluzione` e avendo

    casa
    struzzo
    xyz
    benz
    zuppa
    abc

nel flusso di ingresso, il programma emette `3` nel flusso di uscita.
