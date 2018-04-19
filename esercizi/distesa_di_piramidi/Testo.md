Distesa di piramidi
===================

Descrizione
-----------

Chiamiamo *piramide* di altezza N una figura come la sequente

    *
    **
    ***
    ****
    ***
    **
    *

in cui N vale `4`; chiamiamo *distesa di piramidi* di dimensione M > 0 una
piramide alta M preceduta e seguita da un distesa di piramidi di dimensione
M - 1, assumendo per convenzione che un distesa di piramidi di dimensione `0`
non contenga alcuna piramide (o altre distese di piramidi).

Ad esempio, una distesa di piramidi di dimensione `1` è

    *

ossia è una piramide (preceduta e seguita da null'altro); una distesa di piramidi
di dimensione `2` è

    *
    *
    **
    *
    *

infatti è data da una distesa di piramidi di dimensione `1` seguita da una
piramide alta `2` e quindi da una distesa di piramidi di dimensione `1`; una
distesa di piramidi di dimensione `3` è

    *
    *
    **
    *
    *
    *
    **
    ***
    **
    *
    *
    *
    **
    *
    *


di nuovo, infatti, osserviamo una distesa di piramidi di dimensione `2`, seguita
da una piramide di altezza `3` e quindi ancora da una distesa di piramidi di
dimensione `2`.

Scrivete un programma che, data la dimensione di un distesa di piramidi come
intero nel flusso di ingresso, emetta nel flusso di uscita una distesa di piramidi
della dimensione data.


Vincoli
-------

Tutti i numeri coinvolti possono essere rappresentati da variabili di tipo
`int`. La dimensione può essere `0`, nel qual caso il programma non emette nulla.


Esempio
-------

Eseguendo `soluzione` e avendo `4` nel flusso di ingresso, il programma emette

    *
    *
    **
    *
    *
    *
    **
    ***
    **
    *
    *
    *
    **
    *
    *
    *
    **
    ***
    ****
    ***
    **
    *
    *
    *
    **
    *
    *
    *
    **
    ***
    **
    *
    *
    *
    **
    *
    *

nel flusso di uscita.
