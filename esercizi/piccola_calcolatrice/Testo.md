Piccola calcolatrice
====================

Descrizione
-----------

Scrivete un programma che, data una semplice operazione aritmetica nel flusso di
ingresso, ne emetta il risultato nel flusso di uscita. Il programma deve
considerare solo somma `+`, differenza `-`, prodotto `*` e divisione `/` tra
due operandi interi. Nel caso della divisione il programma deve emettere il
risultato della divisione intera, seguito, in caso di resto, dalla stringa `con
resto` e quindi dal resto; se il secondo operando è `0`, invece del risultato,
il programma deve emettere la stringa `errore`.


Vincoli
-------

Tutti i numeri coinvolti possono essere rappresentati da variabili di tipo
`int`.

Gli operandi e l'operatore sono separati da *white-space*, l'operatore è una
stringa a scelta tra: `+`, `-`, `*` e `/` (non deve essere cioè gestito il caso
in cui vengano introdotte operazioni "sintatticamente errate").

L'output deve seguire esattamente il formato illustrato negli esempi.


Esempio
-------

Eseguendo

    soluzione

e avendo nel flusso di ingresso

    3 + 7

il programma emette nel flusso di uscita

    10

Eseguendo

    soluzione

e avendo nel flusso di ingresso

    10 / 3

il programma emette nel flusso di uscita

    3 con resto 1

Infine, eseguendo

    soluzione

e avendo nel flusso di ingresso

    5 / 0

il programma emette nel flusso di uscita

    errore    


Suggerimenti
------------

Potete leggere l'operazione tramite la sequenza di istruzioni

    int primoOperando = s.nextInt();
    String operatore = s.next();
    int secondoOperando = s.nextInt();

dove `s` è una variabile di tipo `Scanner` opportunamente inizializzata.

Per decidere di che operatore si tratta, potete usare il metodo `equals` della
classe `String`. Ad esempio, la seguente espressione

    operatore.equals("/")

risulterà vera se e solo se l'operatore letto è quello della divisione.
