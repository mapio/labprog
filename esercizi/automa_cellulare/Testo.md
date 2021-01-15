Automa cellulare
================

Descrizione
-----------

Considerate una colonia di *binormiche* (formiche binarie) che vivono su un
anello suddiviso in N celle rappresentato con una stringa di `N` caratteri scelti
tra `-` e `*` che indicano, rispettivamente, una cella vuota ed una in cui si
trova una binormica. Ad esempio, la stringa

    *-*---*-**

rappresenta un anello con 10 celle su cui vivono 5 binormiche; osservate che il
primo e l'ultimo carattere della stringa corrispondono a celle adiacenti
sull'anello: in questa rappresentazione figurano ai lati opposti della stringa
perché è come se avessimo "tagliato" l'anello in un punto e l'avessimo così
trasformato in una striscia.

Ogni anno, le binormiche possono dare vita a nuove binormiche, oppure morire;
questo avviene secondo una semplice regola basata sul numero di binormiche
presenti in un cella e le sue due celle adiacenti: se tale numero è pari a 2,
l'anno seguente nella cella ci sarà una binormica, se è pari a 3 la cella
diventerà vuota (se il numero è 0, o 1 l'anno successivo la cella conserverà
immutato il suo contenuto attuale).

I primi due anni di vita di una colonia di binormiche sono rappresentati dalle
seguenti due stringhe (cui abbiamo sovrapposto per comodità l'elenco delle loro
posizioni)

    0123456789
    *-*---*-**
    ***---***-

osservate, ad esempio, che nella cella di posto 1 nasce una binormica perché
nelle celle di posto 0, 1 e 2 l'anno prima c'erano 2 binormiche; viceversa,
nella cella di posto 9 la binormica muore perché nelle celle 8, 9 e 0 l'anno
prima c'erano 3 binormiche.

Scrivete un programma che, data una stringa di caratteri `-`  e `*` nel flusso di
ingresso e un numero `N` > 1 come parametro sulla linea di comando emetta nel
flusso di uscita `N` stringhe corrispondenti ad `N` anni di vita della colonia, uno
per riga.


Vincoli
-------

Il flusso di ingresso contiene esclusivamente i caratteri `-` e `*` e (al
termine) il carattere a-capo. Il numero `N` può essere rappresentato con una
variabile di tipo `int`.


Esempio
-------

Eseguendo `soluzione 4` e avendo

    -****-***--*--

nel flusso di ingresso, il programma emette

    -*--***-*--*--
    -*--*-***--*--
    -*--***-*--*--
    -*--*-***--*--

nel flusso di uscita.


Suggerimenti
------------

Si osservi che la stringa dell'anno successivo dipende solo dal contenuto
della stringa all'anno corrente: per decidere se una cella contiene, o meno,
una binormica al prossimo anno si deve controllare solo il contenuto delle
celle adiacenti ad essa dell'anno corrente.
