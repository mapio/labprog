Righello
========

Descrizione
-----------

Chiamiamo *tacca* di lunghezza N una sequenza N di caratteri `-` seguiti da
"a-capo"; chiamiamo *righello* di dimensione M > 0 una tacca lunga M preceduta e
seguita da un righello di dimensione M - 1, assumendo per convenzione che un
righello di dimensione 0 non contenga alcuna tacca (o altro righello).

Ad esempio, un righello di dimensione 1 è

    -

ossia è una tacca (preceduta e seguita da null'altro); un righello di dimensione
2 è

    -
    --
    -

infatti è dato da un righello di dimensione 1 seguito da una tacca lunga 2 e
quindi da un righello di dimensione 1; un righello di dimensione 3 è

    -
    --
    -
    ---
    -
    --
    -

di nuovo, infatti, osserviamo un righello di dimensione 2, seguito da una tacca
di lunghezza 3 e quindi ancora da un righello di dimensione 2.

Scrivete un programma che, data la dimensione di un righello come intero nel
flusso di ingresso, emetta nel flusso di uscita un righello della dimensione
data.


Vincoli
-------

Tutti i numeri coinvolti possono essere rappresentati da variabili di tipo
`int`. La dimensione può essere 0, nel qual caso il programma non emette nulla.


Esempio
-------

Eseguendo

    soluzione

e avendo `4` nel flusso di ingresso, il programma emette

    -
    --
    -
    ---
    -
    --
    -
    ----
    -
    --
    -
    ---
    -
    --
    -

nel flusso di uscita.


Suggerimenti
------------

Si osservi che la definizione di righello fa riferimento, per così dire, a se
stessa, suggerendo l'uso della ricorsione come tecnica di programmazione
adatta alla soluzione dell'esercizio.
