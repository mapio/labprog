Suffisso
========

Descrizione
-----------

Una stringa è un *suffisso proprio* di un'altra quando la seconda si può
ottenere cancellando uno, o più, caratteri dall'inizio della prima.

Ad esempio `ao` è suffisso proprio di `ciao` perché `ao` si può ottenere
cancellando `ci` da `ciao`; viceversa `nonno` non è suffisso di `zio` perché non
si può ottenere `zio` cancellando lettere a `nonno`, similmente, `ciao` non è
suffisso proprio di `ciao` perché, essendo uguale a `ciao`, non si può ottenere
cancellando alcun carattere.

Scrivete un programma che date due stringhe come argomenti sulla linea di
comando emetta `suffisso` nel flusso di uscita se il primo argomento è suffisso
proprio del secondo, o non emetta nulla in caso contrario.


Vincoli
-------

Non è garantito che la prima stringa sia più corta della prima.


Esempio
-------

Eseguendo `soluzione ao ciao` il programma emette `suffisso` nel flusso di
uscita, mentre eseguendo `soluzione nonno zio` il programma non emette nulla nel
flusso di uscita.
