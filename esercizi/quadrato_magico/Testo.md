Quadrato magico
===============

Descrizione
-----------

Un quadrato magico è una matrice di numeri interi in cui le somme di ogni riga e
di ogni colonna hanno lo stesso valore. Ad esempio, nel quadrato

    8 1 6
    3 5 7
    4 9 2

tutte le righe e tutte le colonne sommano a 15.

Scrivete un programma che data una matrice nel flusso di ingresso emetta nel
flusso di uscita `magico` se e solo se la matrice letta è un quadrato magico (e
non emetta nulla in caso contrario).


Vincoli
-------

Potete assumere che tutti i numeri interi in oggetto siano rappresentabili con
variabili di tipo `int`, e che la matrice abbia al più dimensione 1000 x 1000.

Assumete inoltre che la prima linea del flusso contenga un solo intero `N` pari
alla dimensione della matrice (numero di righe e colonne) e che tutte le
successive linee nel flusso di ingresso contengano `N` numeri interi (separati
da spazi) e che ci siano `N` linee.


Esempio
-------

Eseguendo `soluzione` e avendo nel flusso di ingresso

    3
    8 1 6
    3 5 7
    4 9 2

il programma emette `magico`, mentre eseguendo `soluzione` e avendo nel flusso
di ingresso

    2
    1 2
    3 4

il programma non emette nulla.
