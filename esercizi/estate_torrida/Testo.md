Estate torrida
==============

Descrizione
-----------

Dato un elenco di numeri interi non negativi nel flusso di ingresso, indicante
ciascuno le precipitazioni giornaliere in millimetri di un dato periodo di
tempo, emettere nel flusso di uscita il massimo numero (eventualmente pari a
`0`) di giorni consecutivi senza pioggia (ossia in cui le precipitazioni sono
state pari a `0` millimetri) in tale periodo.


Vincoli
-------

Non ci sono vincoli sul numero di valori nel flusso di ingresso, ciascuno di
essi può essere rappresentato con una variabile di tipo `int`, così come il
massimo numero di giorni consecutivi senza pioggia. Il flusso di ingresso
contiene soltanto numeri, separati da *white-space* (spazio, a-capo, segni di
tabulazione…), mentre il flusso di uscita deve contenere solo un numero (seguito
da a-capo).


Esempio
-------

Eseguendo `soluzione` e avendo

    13 15 0 0 0 32 41 0 0 24 41 42 0 0 0 0 10 10 5 4 0 12

nel flusso di ingresso, il programma emette `4` nel flusso di uscita,
corrispondente al periodo che intercorre dalla tredicesima alla sedicesima
misurazione.

Eseguendo `soluzione` e avendo

    1
    2 3
    4

nel flusso di ingresso, il programma emette `0` nel flusso di uscita, in quanto
non ci sono periodi senza precipitazioni.


Suggerimenti
------------

Leggete il flusso di ingresso sino alla sua terminazione, che avviene per `EOF`.
