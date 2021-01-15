Somma e sottrai
===============

Descrizione
-----------

Scrivete un programma che, data una sequenza di `k` + 2 interi come argomenti
sulla linea di comando

    N a_1 a_2 a_3 ... a_k M

emetta nel flusso di uscita la somma degli interi `a_i` di posto *i* multiplo di
`N` meno la somma degli interi `a_j` di posto *j* multiplo di `M`. Ad esempio,
se gli argomenti sono

    3 11 21 31 41 51 61 71 81 91 2

il programma restituisce `-21`, infatti i numeri di posto multiplo di `3` sono:
31`, 61 e 91 (la cui somma è 183) e quelli di posto multiplo di `2` sono 21, 41,
61 e 81 (la cui somma è 204).


Vincoli
-------

Tutti i numeri coinvolti possono essere rappresentati con variabili di tipo
`int`.


Esempio
-------

Eseguendo `soluzione 3 11 21 31 41 2` il programma emette `-31` infatti i numeri
di posto multiplo di `2` sommano a 62, mentre l'unico numero di posto multiplo
di `3` è 31.
