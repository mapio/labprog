Bilancio
========

Descrizione
-----------

Si consideri una sequenza di movimenti bancari specificati da un elenco di
interi sia positivi che negativi; diciamo che il movimento *i*-esimo è
*bilanciato* se e solo se la somma dei movimenti di indice minore di *i* è
uguale alla somma dei movimenti di indice maggiore di *i* (l'indice del primo
movimento è `0` e si assume che la somma di una sequenza che non contiene nessun
movimento vale `0`). Ad esempio, data la sequenza

    0 -3 5 -4 -2 3 1 0

sono bilanciati i movimenti: `0`, `3` e `7` perché, rispettivamente

    0 = (-3) + 5 + (-4) + (-2) + 3 + 1 + 0
    0 + (-3) + 5 = -2 + 3 + 1 + 0
    0 + (-3) + 5 + (-4) + (-2) + 3 + 1 = 0

Scrivete un programma che, data una sequenza di movimenti bancari nel flusso di
ingresso, emetta tutti e soli gli indici dei movimenti bilanciati che contiene.


Vincoli
-------

Tutti i numeri coinvolti nel programma possono essere rappresentati con
variabili di tipo `int` e il numero totale di movimenti è inferiore a 1000. Il
flusso di uscita deve contenere gli indici dei movimenti bilanciati, uno per
riga e in ordine crescente.


Esempio
-------

Eseguendo `soluzione` e avendo nel flusso di ingresso

    3 -2 2 0 3 4 -6 3 5 -4 8

il programma emette `5`, infatti la somma dei primi quattro movimenti è `6`,
che è anche uguale alla somma dei movimenti dal sesto in poi.


Osservazioni
------------

Questo problema può essere risolto senza fare uso di cicli annidati (facendo un
numero di passi lineare nel numero di movimenti).
