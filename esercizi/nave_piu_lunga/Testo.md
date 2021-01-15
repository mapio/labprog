La nave più lunga
=================

Descrizione
-----------

Scrivete un programma che calcoli la lunghezza della nave più lunga tra quelle
presenti in una configurazione della battaglia navale.

Per *configurazione* si intende una matrice di 10 x 10 caratteri scelti tra `#`
e `.`; per *nave* si intende una sequenza massimale di caratteri `#` disposti
uno accanto all'altro e circondati da `.` (ossia una "barretta" orizzontale, o
verticale, composta di caratteri `#` in cui "all'interno" non figurino
caratteri `.`, ma che abbia tutt'attorno a se il carattere `.`); la *lunghezza*
di una nave è il numero di caratteri `#` di cui è composta.

Il programma riceve una configurazione nel flusso di ingresso (data come 10
linee contenenti 10 caratteri ciascuna – ovviamente seguiti dal carattere di
a-capo) ed emette nel flusso di uscita la lunghezza della nave più lunga tra
quelle presenti nella configurazione.

Ad esempio, nella configurazione

	..........
	..........
	..#...###.
	..#.......
	....##....
	..........
	........#.
	........#.
	..........
	..........

sono presenti 4 navi, due in vertiale (lunghe 2), due in orizzontale (lunghe 2 e
3); il programma pertanto emette `3`.


Vincoli
-------

Non ci sono vincoli sul numero di navi (che può essere eventualmente nullo). Non
ci sono navi che hanno il primo, o ultimo, carattere `#` disposto "sul bordo"
(ossia come primo, o ultimo, carattere della riga, o colonna, che occupano).
Altrimenti detto, il "bordo" della configurazione è sempre sgombro da navi.


Esempio
-------

Eseguendo `soluzione` e avendo

	..........
	..........
	........#.
	..........
	..#######.
	..........
	..#...###.
	..........
	........#.
	..........

nel flusso di ingresso, il programma emette `7` nel flusso di uscita.
