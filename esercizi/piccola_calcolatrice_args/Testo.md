Piccola calcolatrice
====================

Descrizione
-----------

Scrivete un programma che, data una semplice operazione come argomento sulla
linea di comando, ne emetta il risultato nel flusso di uscita. Il programma deve
considerare solo somma `+`, differenza `-`, prodotto `x` e divisione `/` tra due
operandi interi. Nel caso della divisione il programma deve emettere il
risultato della divisione intera, seguito, in caso di resto, dalla stringa `con
resto` e quindi dal resto; se il secondo operando è `0`, invece del risultato,
il programma deve emettere la stringa `errore`.


Vincoli
-------

Tutti i numeri coinvolti possono essere rappresentati da variabili di tipo
`int`.

Gli argomenti da linea di comando sono sempre tre, corrispondenti agli operandi
e all'operatore, l'operatore è una stringa a scelta tra: `+`, `-`, `x` e `/`
(non deve essere cioè gestito il caso in cui vengano introdotte operazioni
"sintatticamente errate").

L'output deve seguire esattamente il formato illustrato negli esempi.


Esempio
-------

Eseguendo

    soluzione 3 + 7

il programma emette nel flusso di uscita

    10

Eseguendo

    soluzione 10 / 3

il programma emette nel flusso di uscita

    3 con resto 1

Infine, eseguendo

    soluzione 5 / 0

il programma emette nel flusso di uscita

    errore
