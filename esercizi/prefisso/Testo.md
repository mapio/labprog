Prefisso
========

Descrizione
-----------

Una stringa è un *prefisso proprio* di un'altra quando la seconda si può
ottenere aggiungendo uno, o più, caratteri alla prima. Ad esempio `ci` è
prefisso proprio di `ciao` perché `ciao` si può ottenere aggiungendo `ao` a
`ci`; viceversa `nonno` non è prefisso di `zio` perché non si può ottenere `zio`
aggiungendo lettere a `nonno`, similmente, `ciao` non è prefisso proprio di
`ciao` perché, essendo uguale a `ciao`, non si può ottenere aggiungendo alcun
carattere.

Scrivete un programma che date due stringhe come argomenti sulla linea di
comando emetta `prefisso` nel flusso di uscita se il primo argomento è prefisso
proprio del secondo, o non emetta nulla in caso contrario.


Vincoli
-------

Non è garantito che la prima stringa sia più corta della prima.


Esempio
-------

Eseguendo `soluzione ci ciao` il programma emette `prefisso` nel flusso di
uscita, mentre eseguendo `soluzione nonno zio` il programma non emette nulla nel
flusso di uscita.
