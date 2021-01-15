Somma tre centesimi
===================

Descrizione
-----------

Scrivete un programma che, dati tre importi in Euro, emetta nel flusso di uscita
la loro somma espressa separando la parte intera dai centesimi. Ad esempio, se
nel flusso di ingresso sono presenti gli importi

    0.25 0.50 0.75

il programma emette nel flusso di uscita

    1 euro e 50 centesimi

Sapete spiegare cosa succede eseguendo questo programma su ingresso

    0.1 0.2 -0.3


Vincoli
-------

Tutti i numeri nel flusso di ingresso corrispondono a una valuta i cui
importi comprendono al più i centesimi, altrimenti detto, nessuno dei numeri
avrà più di due cifre oltre la virgola. Ovviamente, il numero di centesimi
emesso in output deve risultare sempre minore o uguale a 99.


Esempio
-------

Eseguendo

    soluzione

e avendo nel flusso di ingresso

    1.25 2.25 3.5

il programma emette nel flusso di uscita

    7 euro e 0 centesimi

Attenzione: il programma deve funzionare anche quando la somma degli importi è
negativa. Eseguendo

    soluzione

e avendo nel flusso di ingresso

    1.25 0.25 -3.75

il programma deve emettere nel flusso di uscita

    -2 euro e 25 centesimi

(osservate che davanti ai centesimi non compare il segno meno).


Suggerimenti
------------

Per evitare errori di approssimazione legati alla rappresentazione in virgola
mobile, non usate dei `double` per memorizzare le valute, bensì usate degli
`int` convertendo tutti i valori in centesimi.

Detto altrimenti, memorizzate ad esempio il valore `1.20` come l'intero `120`
(centoventi centesimi, appunto, corrispondono a un euro e venti centesimi).

Per passare ai centesimi è sufficiente moltiplicare per 100, ma per poter
memorizzare in un `int` il risultato di una espressione `double` dovete
*forzare* il tipo anteponendo `(int)` all'espressione, come in

    i = (int)(d * 100)

dove `d` è una variabile `dobule`  e `i` è una variabile `int`.

Viceversa, le operazioni di divisione e modulo (che in Java si scrive `%`),
consentono di ottenere, dato un numero in centesimi, la parte intera e i
centesimi che lo compongono.

Infine, dato un numero `x`, il suo valore assoluto può essere ottenuto con
`Math.abs(x)`; ad esempio le espressioni `Math.abs(3)` e `Math.abs(-3)` valgono
entrambe `3`.


Osservazioni
------------

Sapreste spiegare perché nella conversione da euro in centesimi ottenuta
moltiplicando per 100 non si presentano errori di approssimazione?
