Potenze di due
==============

Descrizione
-----------

Scrivete un programma che, dato un numero naturale N come argomento sulla linea
di comando, emetta nel flusso di uscita tutte le cifre dello sviluppo decimale
dell'N-esima potenza di 2. Ad esempio, se l'argomento è 200 il programma deve
emettere

	1606938044258990275541962092341162602522202993782792835301376


Vincoli
-------

Il programma deve funzionare per tutte le potenze tra 0 e 30000 (estremi
compresi); per questa ragione il risultato non può essere rappresentato tramite
una variabile di tipo elementare, ciononostante bastano 10000 cifre decimali per
esprimere la potenza più grande. L'esercizio va svolto *senza* adoperare tipi
più avanzati, come ad esempio `BigInteger`, o `BigDecimal`.


Esempio
-------

Eseguendo `soluzione 100` il programma emette nel flusso di uscita

	1267650600228229401496703205376

e eseguendo `soluzione 4` il programma emette `16`.


Suggerimenti
------------

Il risultato (intermedio e finale) può essere immagazzinato in un vettore di
interi in modo che l'i-esimo elemento corrisponda all'i-esima cifra dello
sviluppo decimale del numero cercato.

La potenza può essere calcolata inizializzando tale vettore con un 1
nell'elemento di posto 0 e con tutti gli altri elementi a 0 e procedendo quindi
a "moltiplicare" il vettore N volte per il valore 2.

Per farlo basta applicare l'algoritmo imparato alla scuola elementare: si
moltiplicano le cifre del risultato intermedio da destra a sinistra per 2,
tenendo conto ad ogni passo del riporto, fino ad arrivare al risultato finale.

Ad esempio, per moltiplicare il risultato intermedio 16 per 2 si deve
moltiplicare il vettore (scritto dall'ultimo al primo elemento)

	0 0 0 ... 1 6

per 2. Usando la notazione usuale della scuola elementare, al primo passo si ha

	0 0 0 ... 1 6 x
	            2 =
	----------------
	          1      riporto
	0 0 0 ... ? 2    risultato

e si inizia moltiplicando 2 * 6 ottenendo 12, la prima cifra a sinistra del
risultato è pertanto un 2, con riporto di 1. Ora si passa alla seconda cifra del
vettore, moltiplicando 2 * 1 ottenendo un 2, a cui va sommato il riporto, per un
totale di 3:

	0 0 0 ... 1 6 x
				2 =
	----------------
	0 0 0 ... 3 2    risultato

ottenendo il risulato finale, posto che N fosse uguale a 5.

Per emettere il risultato basta scorrere le cifre del vettore dall'ultima
(corrispondente alla cifra più a sinistra del numero) alla prima, iniziando a
emettere le cifre solo dopo che si sarà incontrata la prima diversa da 0.
