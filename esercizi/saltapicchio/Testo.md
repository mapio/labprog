Saltapicchio
============

Descrizione
-----------

Diremo che una sequenza di `N` > 0 numeri interi è un *saltapicchio* se e solo
se i valori assoluti delle differenze tra elementi successivi della sequenza
assumono tutti i possibili valori interi tra 1 e `N` - 1.

Ad esempio `1 4 2 3` è un saltapicchio perché le differenze (in valore
assoluto), tra le coppie successive di numeri sono rispettivamente 3, 2 e 1.
Ovviamente le sequenze composte da un solo intero sono tutte saltapicchi.

Scrivete un programma che, dato `N` come argomento sulla linea di comando e una
sequenza di `N` numeri interi nel flusso di ingresso, emetta nel flusso di
uscita `saltapicchio` se e solo se la sequenza in ingresso è un saltapicchio.


Vincoli
-------

Tutti i numeri coinvolti possono essere rappresentati da variabili di tipo `int`
e `N` vale al massimo 1024; il flusso di uscita deve contenere `saltapicchio`
seguito da *a-capo* se e solo se la sequenza in ingresso è un saltapicchio,
altrimenti deve restare vuoto.


Esempio
-------

Eseguendo

    soluzione 4

e avendo

    19 22 24 21

nel flusso di ingresso, il programma non emette nulla nel flusso di uscita,
viceversa eseguendo `soluzione 4` e avendo

    2 -1 0 2

il programma emette `saltapicchio` nel flusso di uscita.
