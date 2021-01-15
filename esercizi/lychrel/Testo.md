I numeri di Lychrel
===================

Descrizione
-----------

Dato un numero (in base dieci) considerate la seguente trasformazione: prendete
il numero e sommategli il numero ottenuto scrivendo le sue cifre dall'ultima
alla prima. Ad esempio, dato

    59

si otterrà

    154

infatti 154 = 59 + 95. Ovviamente si può applicare la stessa trasformazione al
numero così ricavato, ottenendo ad esempio la sequenza

     59 → 154 → 605 → 1111

che si conclude con un numero palindromo (ossia che è uguale al numero ottenuto
scrivendo le sue cifre dall'ultima alla prima).

Non è detto che, partendo da un numero qualunque, si arrivi a un palindromo; i
numeri per cui ciò non succede sono detti numeri di *Lychrel*. Sebbene nessuno
abbia matematicamente dimostrato che esistano tali numeri, ci sono alcune
evidenze empiriche che questo possa essere vero; ad esempio, il numero 196 non
diventa palindromo neppure dopo diversi milioni di trasformazioni!

Scrivete un programma che, dato un numero non di Lychrel nel flusso di ingresso,
emetta nel flusso di uscita la sequenza di numeri che si ottiene a partire da
esso (compreso), con la trasformazione qui descritta, fino al primo numero
palindromo (compreso).


Vincoli
-------

Si può assumere che i numeri ottenuti dalle trasformazioni possano sempre essere
rappresentati con una variabile di tipo `long` e abbiano al più 9 cifre
decimali.


Esempio
-------

Eseguendo `soluzione` e avendo `1709` nel flusso di ingresso, il programma
emette

    1709
    10780
    19481
    37972
    65945
    120901
    229922

nel flusso di uscita, similmente, avendo `6174` nel flusso di ingresso, il
programma emette

    6174
    10890
    20691
    40293
    79497

nel flusso di uscita.


Suggerimenti
------------

Si suggerisce di implementare un metodo statico che, dato un numero, restituisca
quello ottenuto scrivendo le sue cifre dall'ultima alla prima.
