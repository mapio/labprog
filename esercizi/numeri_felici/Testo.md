Numeri felici
=============

Descrizione
-----------

Dato un numero decimale di D cifre si consideri la trasformazione ottenuta
sommando il quadrato delle sue cifre. Ad esempio

	13

è trasformato in

	10

in quanto le sue cifre 1 e 3 elevate al quadrato e sommate 1² + 3² valgono 10.
Tale trasformazione può essere ripetuta sul numero così ottenuto. Di nuovo, ad
esempio

	10

è trasformato in 1 = 1² + 0² che, evidentemente, si trasforma a sua volta in 1.
Ancora, ad esempio, se si parte da 4 i valori che si ottengono sono

	4
	16 = 4²
	37 = 1² + 6²
	58 = 3² + 7²
	89 = 5² + 8²
	145 = 8² + 9²
	42 = 1² + 4² + 5²
	20 = 4² + 2²
	4 = 2² + 0²

si osservi che la sequenza costituisce un "ciclo" infinito di valori.

Si congettura che, qualunque sia il numero di partenza, applicando questa
trasformazione in sequenza, possono accadere solo due cose:

- la sequenza di valori arriva al valore 1
  (dopodiché resta costantemente 1),
- oppure la sequenza arriva a uno dei valori nell'insieme
  {4, 16, 37, 58, 89, 145, 42, 20} e questo produce un "ciclo" infinito.

Diciamo che un numero è "felice" se la sequenza di trasformazioni ottenuta a
partire da esso termina nel valore 1.

Scrivete un programma che, dato un intero nel flusso di ingresso, emetta nel
flusso di uscita "si" se il numero è felice, oppure "no" se non lo è.


Vincoli
-------

Si assuma che ciascun numero coinvolto possa essere rappresentato con una
variabile di tipo long (ma non necessariamente di tipo int).


Esempio
-------

Eseguendo

	soluzione

e avendo `13` nel flusso di ingresso, il programma emette `si` nel flusso
di uscita. Eseguendo

	soluzione

e avendo `145` nel flusso di ingresso, il programma emette `no` nel flusso
di uscita.
