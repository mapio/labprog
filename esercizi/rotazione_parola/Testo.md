Rotazione di una parola
=======================

Descrizione
-----------

La *rotazione semplice* di una parola avviene spostando a destra di un posto
tutti caratteri della parola, ad eccezione dell'ultimo carattere, che diventa il
primo.

Ad esempio, se la parola è `ruota` eseguendo la sua rotazione semplice si
ottiene la parola `aruot`

La rotazione `N`-esima di una parola (dato un intero `N` > 0) si ottiene
eseguendo in successione `N` rotazioni semplici.

Ad esempio, la parola è

  ruota

ruotandola rispetto a `N` = `4` si ottiene

  uotar

Scrivete un programma che legga una parola ed una sequenza di interi dal flusso
di ingresso ed emetta nel flusso di uscita una serie di parole, una per linea,
ottenute ciascuna come rotazione `N`-esima della precedente (rispetto a tali
interi), iniziando con la parola data in ingresso.


Vincoli
-------

La prima riga del flusso contiene la parola che è costituita solamente dalle
lettere minuscole dell'alfabeto, ossia una delle lettere

    a, b, c, ..., x, y, z

ed ha lunghezza al più pari a 1024. Le righe successive del flusso contengono
numeri interi positivi che possono essere rappresentati ciascuno da una
variabile di tipo `int`.


Esempio
-------

Eseguendo `soluzione` e avendo

    girotondo
    1
    1
    2
    3
    1000
    9998

nel flusso di ingresso il programma emette

    ogirotond
    dogiroton
    ondogirot
    rotondogi
    irotondog
    rotondogi

nel flusso di uscita.

Si osservi che, anche se i primi due numeri sono entrambi `1`, le prime righe
sono diverse: la prima infatti è una rotazione `1`-esima (o semplice) di
'girotondo' (la parola in input), menre la seconda è una rotazione semplice di
'ogirotond' (la prima parola in output).


Suggerimenti
------------

Si osservi che per determinare la parola ottenuta, non è di fatto necessario
eseguire N rotazioni semplici, in quanto la posizione finale di ciascun
carattere può essere calcolata.
