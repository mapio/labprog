Calcola il "bounding box"
=========================

Descrizione
-----------

Il *bounding box* di una *figura bidimensionale* è il più piccolo rettangolo che
la contenga interamente. Per semplicità, assumeremo che una *figura
bidimenzionale* sia costituita dai caratteri `*` contenuti in una sequenza di
linee (tutte della stessa lunghezza) costituite dai caratteri `.` e `*`. Ad
esempio, la seguente sequenza di linee

    ......................
    ...**************.....
    ...**************.....
    ...**.................
    ...******.............
    ...******.............
    ...**.................
    ...**.................
    ...**.............**..
    ...**.............**..
    ......................

rappresenta la figura bidimensionale "F."; il suo bounding box ha dimensioni `9`
x `17` perché per contenere tutti i caratteri `*` servono `17` colonne e `9`
righe. In modo analogo, la figura

    .......
    ...*...
    ..***..
    .*****.
    ..***..
    ...*...
    .......

ha un bounding box di dimensioni `5` x `5`.

Scrivete un programma che, data una figura bidimensionale nel flusso di
ingresso, emetta il numero di righe e colonne del suo bounding box nel flusso di
uscita.

Vincoli
-------

Le dimensioni del bounding box e il numero massimo di caratteri per riga possono
essere rappresentati da variabili di tipo `int`; c'è sempre almeno una riga in
ingresso, tutte le linee hanno lo stesso numero di caratteri e nell'input è
contenuto almeno un carattere `*`.

Esempio
-------

Eseguendo `soluzione` e avendo

    **

il programma emette `1 2` nel flusso di uscita.
