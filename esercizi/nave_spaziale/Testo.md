Nave spaziale
=============

Descrizione
-----------

Una nave spaziale che si muove in uno spazio monodimensionale a coordinate
intere deve andare dal punto di coordinate `a` al punto di coordinate `b`; il
sistema di guida è molto elementare e ha solo il comando `P` con cui la nave fa
un passo, che ha l'effetto di aumentare di una unità la coordinata corrente, e
il comando `S`, con cui la nave effettua un salto nell'iperspazio, che ha
l'effetto di quadruplicare la coordinata corrente.

Scrivete un programma che, date le coordinate `a` e `b`, come parametri sulla
linea di comando, emetta nel flusso di uscita la più breve sequenza di comandi
`P` ed `S` che porti l'astronave dalla prima alla seconda coordinata.

Ad esempio, date le coordinate `5` e `81`, il programma emette `SSP`. Usando
tali comandi, infatti, la nave parte da 5, arriva a 20 col primo salto e a 80
con il secondo e poi arriva a destinazione con l'ultimo passo.

Similmente, date le coordinate `4` e `15`, il programma emette `PPPPPPPPPPP`
perché la prima coordinata è già troppo grande per consentire salti
nell'iperspazio.


Vincoli
-------

Tutti i numeri coinvolti possono essere rappresentati da variabili di tipo
`int`; il flusso di uscita deve contenere solo una sequenza di `P` e `S` (senza
spazi) terminata da a-capo.


Esempio
-------

Eseguendo `soluzione 10 130` nel flusso di ingresso, il programma emette
`PPPPPPPPPPPPPPPPPPPPPPSPP` nel flusso di uscita, infatti la nave prima si porta
alla coordinata 32 facendo 22 passi, poi fa un salto nell'iperspazio e in fine
in due passi arriva a destinazione.


Suggerimenti
------------

Si osservi che se la seconda coordinata è dispari, oppure minore del quadruplo
della prima, l'ultimo comando da impartire è per forza `P`; se invece la seconda
coordinata è pari e non è minore del quadruplo della prima, si può dapprima
raggiungere un quarto della seconda coordinata e quindi eseguire impartire il
comando `S`.
