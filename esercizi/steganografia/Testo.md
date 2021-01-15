Steganografia
=============

Descrizione
-----------

La *steganografia* è un processo tramite il quale alcuni dati vengono nascosti
mescolandoli ad altri in modo che non sia immediatamente possibile rendersi
conto del loro nascondimento e, quindi, individuarli.

Scopo del programma è decodificare un assegnato schema steganografico secondo
cui una sequenza di caratteri (terminata da un punto) viene nascosta all'interno
di un'altra a patto di far seguire ogni carattere della sequenza da nascondere
con un asterisco.

Ad esempio, data in ingresso la sequenza di caratteri

    fhaC*asdai*sasa*sadasdo*assd *sdaM*asdda*sddm*asddm*asddaa*aaa.

il programma deve emettere

    Ciao Mamma

che è per l'appunto, la sequenza di caratteri che, nella sequenza di ingresso,
precedono un asterisco.


Vincoli
-------

Non ci sono vincoli sul numero di caratteri in ingresso. La sequenza di
caratteri è terminata da un punto.


Esempio
-------

Eseguendo `soluzione` wd avendo nel flusso di ingresso

    fhaC*asdai*sasa*sadasdo*assd *sdaM*asdda*sddm*asddm*asddaa*aaa.

il programma deve emettere nel flusso di uscita

    Ciao Mamma

oppure, avendo nel flusso di ingresso

    kasdjhalksjdfhaldjfh1*jfhas2*djfh3*sdfskdjf.

deve emettere

    123
