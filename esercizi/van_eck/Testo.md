La sequenza di Jan Ritsema Van Eck
==================================

Descrizione
-----------

Nel 2010 Jan Ritsema Van Eck ha sottoposto la seguente sequenza numerica
infinita

    0 0 1 0 2 0 2 2 1 6 0 5 0 2 6 0…

all'"Enciclopedia on-line delle sequenze numeriche" (*OEIS*). La sequenza è
costruita in questo modo:

- l'elemento di posto 0 vale `0`,
- l'elemento di posto *n* + 1 vale:
    - `0` se il valore al posto *n* non è mai comparso prima nella sequenza, oppure
	- `n - k` se l'ultima posizione dove è comparso il valore al posto *n* + 1 è *k*.

I primi 11 valori sono:

- `0` perché la sequenza inizia con `0` per definizione,
- `0` perché `0` non era mai comparso prima,
- `1` perché `0` era comparso `1` passo prima,
- `0` perché `1` non era mai comparso prima,
- `2` perché `0` era comparso `2` passi prima,
- `0` perché `2` non era mai comparso prima,
- `2` perché `0` era comparso `2` passi prima,
- `2` perché `2` era comparso `2` passi prima,
- `1` perché `2` era comparso `1` passo prima,
- `6` perché `1` era comparso `6` passi prima,
- `0` perché `6` non era mai comparso prima…

Scrivete un programma che, dato `N` come parametro sulla linea di comando emetta
i primi `N` termini di tale sequenza nel flusso di uscita.

Vincoli
-------

Il numero `N` è un intero positivo tale per cui un vettore di `int` di
dimensione `N` possa essere contenuto in memoria.

Esempio
-------

Eseguendo `soluzione 30` il programma emette

    0 0 1 0 2 0 2 2 1 6 0 5 0 2 6 5 4 0 5 3 0 3 2 9 0 4 9 3 6 14

nel flusso di uscita.
