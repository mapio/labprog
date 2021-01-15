Potenze intere
==============

Descrizione
-----------

Dato il numero intero `x`, la potenza `x^n` è definita come il prodotto iterato
di `x` per se stesso `n` volte. Sebbene questa definizione suggerisca
immediatamente un algoritmo (iterativo) per calcolare `x^n`, il numero di
moltiplicazioni che esso richiede è elevato.

Si consideri, ad esempio, il caso della potenza sedicesima: la sequenza di
istruzioni

    a = x;
    b = a * a;
    c = b * b;
    d = c * c;

calcola tale potenza con sole 3 moltiplicazioni (contro le 16 necessarie
all'algoritmo iterativo); infatti `b = x^2`, quindi `c = x^4` da cui `d = x^16`.

Questo metodo è detto delle "quadrature successive" perché applica ripetutamente
l'osservazione che

    x^2n = (x^n)^2 = x^n * x^n

ovviamente questo è possibile banalmente nel caso in cui n sia una potenza di 2
(per cui n/2 è sempre intero, come avviene nell'esempio precedente dove n = 16 =
2^4), ma può essere "aggiustato" per funzionare nel caso generale osservando che

    x^(2n+1) = x * x^n * x^n

Scrivete un programma che, dati due interi non negativi `x` e `n` nel flusso di
ingresso, emetta `x^n` nel flusso di uscita usando il minor numero possibile di
moltiplicazioni.


Vincoli
-------

I numeri in ingresso possono essere rappresentati da variabili di tipo `int`, ma
questo non è garantito per la potenza, per la quale è pertanto necessario usare
la classe `BigInteger`.


Esempio
-------

Eseguendo `soluzione` e avendo

    2 256

nel flusso di ingresso, il programma emette

    115792089237316195423570985008687907853269984665640564039457584007913129639936

nel flusso di uscita; eseguendo `soluzione` e avendo

    3 81

nel flusso di ingresso, il programma emette

    443426488243037769948249630619149892803

nel flusso di uscita.


Suggerimenti
------------

Il metodo delle quadrature successive suggerisce una soluzione ricorsiva.
Attenzione però: tenete da parte il risultato intermedio, non calcolatelo due
volte!


Osservazioni
------------

Provate ad aggiungere un "contatore" che vi dica, oltre alla potenza, quante
moltiplicazioni ha utilizzato per calcolarla. Sapreste esprimere il numero di
moltiplicazioni necessarie in funzione di `x`, o `n`?

Esiste ovviamente un metodo statico della classe `BigInteger` che calcola la
potenza, ma la vostra soluzione non deve adoperarlo!
