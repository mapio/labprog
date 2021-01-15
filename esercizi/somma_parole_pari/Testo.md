Somma parole pari
=================

Descrizione
-----------

Scrivere un programma che, dato un elenco di parole nel flusso di ingresso,
emetta nel flusso di uscita la somma delle lunghezze delle parole di lunghezza
pari presenti nell'elenco.

Ad esempio, se il flusso di ingresso contiene

    a me e a te piace il pane e formaggio

il programma emette

    10

in quanto le parole di lunghezza pari sono: `me`, `te`, `il` e `pane` e la somma
delle loro lunghezze è pari a 2 + 2 + 2 + 4 = 10.


Vincoli
-------

Non si possono fare assunzioni sul numero di caratteri presenti sulla linea. Le
parole sono costituite da lettere minuscole e separate tra di loro da un solo
spazio.

Il numero di parole e la loro lunghezza sono rappresentabili con variabili di
tipo `long` (ma non si possono assumere altri vincoli sul numero massimo, o
sulla lunghezza massima delle parole).


Esempio
-------

Eseguendo `soluzione` e avendo

    la mia casa e la mia citta sono la

nel flusso di ingresso, il programma emette

    14

nel flusso di uscita.
