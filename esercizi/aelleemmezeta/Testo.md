Aelle Emmezeta
==============

Descrizione
-----------

L'ufficio immatricolazioni fornisce alla segreteria studenti l'elenco degli
studenti iscritti ad un dato corso come sequenza di cognomi separati ciascuno
dal successivo da un asterisco, ad esempio:

    ROSSI*FERRARI*COLOMBO*BIANCHI*VILLA*BRAMBILLA*RUSSO*CATTANEO*SALA*GALLI

La segreteria deve calcolare da tale elenco il numero di studenti il cui cognome
inizia con una lettera compresa tra `A` ed `L`, o tra `M` e `Z` (estremi
inclusi).

Scrivete un programma che, dato nel flusso di ingresso l'elenco di studenti,
emetta nel flusso di uscita una riga contenente due numeri interi separati da
uno spazio corrispondenti rispettivamente alle numerosità dei due gruppi
descritti sopra; nel caso dell'esempio, dovrebbe emettere

    6 4


Vincoli
-------

Il numero di studenti di ciascun gruppo è rappresentabile con una variabile di
tipo `int`, non ci sono altri vincoli sul numero di cognomi in ingresso, o sulla
lunghezza massima del flusso, o di ciascun cognome. I cognomi sono composti di
lettere maiuscole comprese tra `A` e `Z` (estremi inclusi) e hanno lunghezza
minima pari ad una lettera.


Esempio
-------

Eseguendo `soluzione` ee avendo

    VITALI*FALCIONI*MONTANARI*OMICCIOLI*FERRI*ROSSI*MATTIOLI*TONUCCI*TONELLI*BARTOLUCCI

nel flusso di ingresso, il programma emette nel flusso di uscita

    3 7

infatti appartengono al gruppo `A`-`L` i cognomi `FALCIONI`, `FERRI` e
`BARTOLUCCI` mentre gli altri sette appartengono al gruppo `M`-`Z`.
