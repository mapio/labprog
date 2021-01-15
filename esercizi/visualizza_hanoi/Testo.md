Visualizza le mosse della torrre di Hanoi
=========================================

Descrizione
-----------

Una leggenda narra che dei monaci in un tempio Indù siano costantemente
indaffarati a spostare (secondo precise regole) sessantaquattro dischi
impilandoli da una palo a un altro e che, al termine della loro opera, il
mondo finirà. In realtà, si tratta solo di una trovata pubblicitaria con cui è
stato presentato un rompicapo, chiamato *Torre di Hanoi*, inventato dal
matematico francese Edouard Lucas nel 1883.

Il rompicapo prevede che, dati alcuni dischi forati di dimensione crescente
impilati sul primo di tre pali, il giocatore li sposti sull'ultimo palo seguendo
le seguenti regole:

- ogni mossa consiste nello sfilare da un palo il disco più in alto e infilarlo
  sulla cima un altro palo,
- si può muovere un solo disco per volta,
- non si può mettere un disco sopra uno di dimensioni minori.

Si osserva facilmente che una mossa è completamente specificata dalla coppia di
pali di partenza ed arrivo (il disco da spostare è univocamente determinato dal
contenuto dei pali). Nel caso di due dischi, se i pali sono numerati da 0 a 2,
la soluzione del rompicapo è data dalla sequenza di mosse

	0 -> 1
	0 -> 2
	1 -> 2

Scrivete un programma che, data una sequenza di mosse in tale formato nel flusso
di ingresso e il numero di dischi come parametro sulla linea di comando, emetta
nel flusso di uscita una "raffigurazione" dello stato delle torri a ogni mossa.
Ad esempio, date in input le mosse precedenti e 2 come numero di dischi, il
programma emette:

	  *|*   |    |   
	 **|**  |    |   
	-----------------

	   |    |    |   
	 **|** *|*   |   
	-----------------

	   |    |    |   
	   |   *|* **|**
	-----------------

	   |    |   *|*  
	   |    |  **|**
	-----------------


Vincoli
-------

Tutti i numeri coinvolti nel programma possono essere rappresentati con
variabili di tipo `int`. I pali sono numerati da 0 a 2. L'output deve contenere
una "raffigurazione" per ciascuna mossa, a partire dallo stato in cui tutti i
dischi sono impilati ordinatamente sul palo 0. Dato il numero N di dischi, in
ogni raffigurazione:

- c'è un disco per ogni dimensione D che varia da 1 a N,
- un disco di dimensione D è raffigurato con 2D copie del carattere `*`
  (di cui D prima e D dopo del palo su cui è posto),
- i 3 pali sono raffigurati ciascuno da N copie del carattere ´|´,
- i 3 pali hanno distanza pari a 2D caratteri l'uno dall'altro,
- la "base" su cui poggiano i pali è raffigurata 6D + 5 copie del carattere `–`,
- tra una "raffigurazione" e la successiva c'è una sola riga vuota,
- tutte le righe dell'output (eccetto quella vuota) sono costituite da 6D + 5 caratteri.

Potete assumere che la sequenza di mosse sia "valida" nel senso che rispetti
sempre le regole del gioco.


Esempio
-------

Eseguendo `soluzione 3` e avendo

	0 -> 2
	0 -> 1
	2 -> 1
	0 -> 2
	1 -> 0
	1 -> 2
	0 -> 2

nel flusso di ingresso, il programma emette nel flusso di uscita

	   *|*     |      |    
	  **|**    |      |    
	 ***|***   |      |    
	-----------------------

	    |      |      |    
	  **|**    |      |    
	 ***|***   |     *|*   
	-----------------------

	    |      |      |    
	    |      |      |    
	 ***|*** **|**   *|*   
	-----------------------

	    |      |      |    
	    |     *|*     |    
	 ***|*** **|**    |    
	-----------------------

	    |      |      |    
	    |     *|*     |    
	    |    **|** ***|***
	-----------------------

	    |      |      |    
	    |      |      |    
	   *|*   **|** ***|***
	-----------------------

	    |      |      |    
	    |      |    **|**  
	   *|*     |   ***|***
	-----------------------

	    |      |     *|*   
	    |      |    **|**  
	    |      |   ***|***
	-----------------------


Suggerimenti
------------

Tenete traccia delle dimensioni dei dischi su ciascun palo con tre vettori di
interi dimensione N ciascuno, e dell'altezza delle pile su ciascun palo con un
vettore di 3 interi.
