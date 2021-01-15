Riconosci l'operazione
======================

Descrizione
-----------

Dato un operatore logico scelto tra `AND`, `OR` e `XOR` e due stringhe della
stessa lunghezza composte dei caratteri scelti tra `0` e `1`, si può definire
una terza stringa (sempre composta di caratteri scelti tra `0` e `1`) come il
risultato dell'applicazione di tale operatore "carattere per carattere".

Ad esempio, date le due stringhe

    00101
    10011

il risultato dell'`AND` è

    00001

quello dell'`OR` è

    10111

e, infine, quello dello `XOR` è

    10110

Scrivete un programma che, date tre stringhe nel flusso di ingresso, emetta nel
flusso di uscita `AND`, `OR`, `XOR` a seconda che la terza stringa sia,
rispettivamente, il risultato dell'`AND`, `OR` o `XOR` delle prime due, oppure
emetta `ERR` nel caso che la terza stringa non sia il risultato di nessuna delle
tre operazioni precedenti.


Vincoli
-------

Le stringhe in ingresso sono tre, hanno la stessa lunghezza (pari al massimo a
100 caratteri), sono composte solo dai caratteri `0`, `1` e sono terminate dal
carattere *a-capo*. Si assuma che ogni tripla di stringhe conduca sempre ad un
solo output tra quelli possibili.


Esempio
-------

Eseguendo `soluzione` e avendo nel flusso di ingresso

    010101
    111111
    000000

il programma emette `ERR` nel flusso di uscita.
