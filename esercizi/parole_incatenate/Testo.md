Parole incatenate
=================

Descrizione
-----------

Diciamo che una sequenza di parole costituisce una *catena* se le ultime due
lettere di ogni parola coincidono con le prime due lettere della parola
successiva.

Ad esempio, sono catene `caro romano notevole levriero`, `caso sommo
moderatamente testardo` e `dono nobile`, mentre non lo sono `gatto gaffoso` o
`uomo ottimo ovale`.

Scrivere un programma che, data una sequenza di parole nel flusso di ingresso,
emetta nel flusso di uscita `si` se esse costituiscono una catena, o `no`
altrimenti.


Vincoli
-------

Il flusso di ingresso contiene solo lettere minuscole e spazi e contiene sempre
almeno due parole. Per *parola* si intende una sequenza (massimale) di
caratteri che non contenga spazi, le parole possono essere separate tra loro da
uno o più *wihte-space* (spazi, o a-capo). Non si possono assumere vincoli
sulla lunghezza delle parole o sul loro numero massimo.


Esempio
-------

Eseguendo `soluzione` e avendo nel flusso di ingresso

	albergo ovale   eretto ove emerga aria

il programma emette `no` nel flusso di uscita.
