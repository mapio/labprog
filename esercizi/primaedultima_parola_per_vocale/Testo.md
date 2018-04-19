Prima ed ultima parola per vocale
=================================

Descrizione
-----------

Scrivete un programma che, data una sequenza di parole nel flusso di ingresso
terminata dalla parola `fine`, scriva nel flusso di uscita il numero (posizione)
della prima ed ultima parola che iniziano con una vocale.


Vincoli
-------

Non potete assumere alcun vincolo sul numero di parole nel flusso di ingresso
(fatto salvo che esso può essere rappresentato con una variabile di tipo `int`),
le parole sono numerate a partire da 1; ciascuna parola è lunga al più 100
caratteri ed è composta solo di caratteri minuscoli tra la `a` e la `z`; nel
flusso c'è sempre almeno una parola che inizia per vocale e l'ultima parola
dell'elenco è `fine` (senza virgolette).


Esempio
-------

Invocando il programma `soluzione` e avendo nel flusso di ingresso la sequenza
di parole

    elena
    franco
    aldo
    mario
    vincenzo
    lucia
    carmela
    michele
    giovanna
    luigi
    giovanni
    luciano
    franca
    luigi
    margherita
    fine

il programma emette i numeri

    1 3

(sulla stessa riga, separati da uno spazio) nel flusso di uscita, che
corrispondono ai numeri delle righe in cui compaiono la parola `elena` e `aldo`
che sono, rispettivamente, la prima e l'ultima che iniziano con vocale.
