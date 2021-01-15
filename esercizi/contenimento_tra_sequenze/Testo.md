Contenimento tra sequenze
=========================

Descrizione
-----------

Date due sequenze di interi diciamo che la prima è *compresa* nella seconda se e
solo se tutti i numeri che compaiono (eventualmente ripetuti) nella prima
compaiono anche nella seconda.

Ad esempio

	1 2 30 1 4 2

è compresa in

	4 1 30 2 5

ma

	1 2 3 20 30

non è compresa in

	20 30

Scrivete un programma che, date due sequenze di numeri interi positivi terminate
ciascuna dal numero `0` nel flusso di'ingresso, emetta nel flusso di uscita `si`,
o `no`, a seconda che la prima sia, o meno, compresa nella seconda.


Vincoli
-------

Tutti i numeri coinvolti possono essere rappresentati da variabili di tipo
`int`. La prima sequenza contiene al più 1024 interi, viceversa non ci sono
limiti sul numero di interi contenuti nella seconda sequenza. Il flusso
contiene esclusivamente numeri, spazi ed eventualmente (ma non
necessariamente) "a capo".


Esempio
-------

Eseguendo `soluzione` e avendo

	1 2 30 1
	4 2 0 4 1 30 2
	5 0

nel flusso di ingresso il programma emette

	si

nel flusso di uscita.


Suggerimenti
------------

Si suggerisce di memorizzare la prima sequenza e di "spuntare" i suoi elementi
man mano che si leggono quelli della seconda (senza memorizzarli).
