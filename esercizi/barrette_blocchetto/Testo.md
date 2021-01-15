Barrette
========

Descrizione
-----------

Chiamiamo *barretta* una sequenza composta da una sequenza di caratteri `-`
seguita da una sequenza di caratteri `+`; chiamiamo *valore* di una barretta il
numero di caratteri `+` che vi figurano e *lunghezza* il numero totale di
caratteri che la compongono.

Ad esempio

    -------+++

è una barretta di lunghezza `10` e valore `3`.

Scrivete un programma che, data una sequenza di interi positivi come argomenti
sulla linea di comando, emetta nel flusso di uscita una sequenza di barrette
(una per linea) con le seguenti proprietà:

- l'*i*-esima barretta ha valore pari all'*i*-esimo intero specificato;
- tutte le barrette hanno la stessa lunghezza;
- (almeno) una barretta ha lunghezza pari al suo valore.

Altrimenti detto, emetta delle sequenze di caratteri `+` di lunghezza
specificata, allineate a destra usando sequenze di caratteri `-` come
riempimento a sinistra.


Vincoli
-------

I numeri specificati sono rappresentabili con variabili di tipo `int`. Non si
può assumere alcun vincolo sul numero di argomenti sulla linea di comando.


Esempio
-------

Eseguendo `soluzione 5 1 3` il programma emette nel flusso di uscita

    +++++
    ----+
    --+++

le tre righe hanno infatti tutte lunghezza `5` e hanno valore rispettivamente
`5`, `1` e `3`.

Eseguendo `soluzione 5 2 10` il programma emette nel flusso di uscita

    -----+++++
    --------++
    ++++++++++
