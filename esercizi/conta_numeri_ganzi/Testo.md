Conta i numeri ganzi
====================

Descrizione
-----------

Un numero è ganzo se si ottiene sommando uno al prodotto di un certo numero di
numeri interi positivi consecutivi. I primi numeri ganzi sono:

	2 = 1 + 1
	3 = 1 * 2 + 1
	7 = 1 * 2 * 3 + 1
	25 = 1 * 2 * 3 * 4 + 1
	121 = 1 * 2 * 3 * 4 * 5 + 1
	...

Scrivere un programma che, data una sequenza di numeri interi positivi nel
flusso di ingresso emetta nel flusso di uscita il numero di essi che sono ganzi.

Ad esempio, se la sequenza in ingresso è `2 10 4 7 11 28 25 9` il programma deve
emettere `3` in quanto essa contiene i numeri ganzi 2, 7 e 25.


Vincoli
-------

Tutti i numeri coinvolti possono essere rappresentati con delle variabili di
tipo `int`. Inoltre, non si può assumere alcun limite sulla lunghezza della
sequenza nel flusso di ingresso; il flusso di ingresso contiene solo numeri e
*white-space* e termina esclusivamente al raggiungimento dell'`EOF`.


Esempio
-------

Eseguendo

	soluzione

e avendo nel flusso di ingresso

	2 1 3 44 7 55 25 66 121

il programma emette

	4

nel flusso di uscita (sono ganzi: 2, 7, 25 e 97).
