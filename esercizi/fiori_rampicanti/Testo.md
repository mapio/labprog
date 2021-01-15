Fiori rampicanti
================

Descrizione
-----------

Chiamiamo *fiore* di lunghezza `N` una sequenza `N` di caratteri `-` seguiti da `@`
e *a-capo*; chiamiamo *rampicante* di dimensione `M` > 0 un fiore lungo `M`
preceduto e seguito da un rampicante di dimensione `M` / 2, assumendo per
convenzione che un rampicante di dimensione 0 non contenga alcun fior (o altro
rampicante).„

Ad esempio, un rampicante di dimensione 1 è

    -@

ossia è un fiore (preceduto e seguito da null'altro); un rampicante di
dimensione 2 è

    -@
    --@
    -@

infatti è dato da un rampicante di dimensione 1 seguito da un fiore lungo 2 e
quindi da un rampicante di dimensione 1; un rampicante di dimensione 4 è

    -@
    --@
    -@
    ----@
    -@
    --@
    -@

di nuovo, infatti, osserviamo un rampicante di dimensione 2, seguito da un fiore
di lunghezza 4 e quindi ancora da un rampicante di dimensione 2.

Scrivete un programma che, data la dimensione di un rampicante come intero nel
flusso di ingresso, emetta nel flusso d'uscita un rampicante della dimensione
data.


Vincoli
-------

Tutti i numeri coinvolti possono essere rappresentati da variabili di tipo
`int`. La dimensione è sempre una potenza di 2 e può essere 0, nel qual caso il
programma non emette nulla.


Esempio
-------

Eseguendo

    soluzione

e avendo `8` nel flusso di ingresso, il programma emette

    -@
    --@
    -@
    ----@
    -@
    --@
    -@
    --------@
    -@
    --@
    -@
    ----@
    -@
    --@
    -@

nel flusso di uscita.
