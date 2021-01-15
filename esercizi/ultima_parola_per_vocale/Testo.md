Ultima parola per vocale
========================

Descrizione
-----------

Data una sequenza di parole nel flusso di ingresso terminata dalla parola
`fine`, determinare il numero dell'ultima parola che inizia con una vocale.


Vincoli
-------

Non potete assumere alcun vincolo sul numero di parole nel flusso di ingresso
(fatto salvo che esso può essere rappresentato con una variabile di tipo `int`),
le parole sono numerate a partire da 1; ciascuna parola è lunga al più 100
caratteri ed è composta solo di caratteri minuscoli tra la `a` e la `z`; nel
flusso c'è sempre almeno una parola che inizia per vocale e  l'ultima parola
dell'elenco è `fine`.


Esempio
-------

Invocando il programma `soluzione` e avendo nel flusso di ingresso la sequenza
di parole:

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

il programma emette il numero `3` nel flusso di uscita, che corrisponde al
numero della riga in cui compare la parola `aldo` che infatto è poi seguita da
parole che iniziano tutte per consonante.
