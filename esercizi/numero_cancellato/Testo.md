Numero cancellato
=================

Descrizione
-----------

Data una sequenza di cifre, alcune delle quali eventualmente seguite da un
singolo carattere `#`, nel flusso di ingresso, il programma deve emettere nel
flusso di uscita il doppio del numero ottenuto concatenando tutte e sole le
cifre nell'argomento che non sono seguite da un `#`.

Ad esempio, se l'ingresso è

    12#56#7

il programma emette

    314

che è il doppio di 157, il numero che si ottiene concatenando `1`, `5` e `7` che
sono le cifre non seguite da `#`.


Vincoli
-------

Il numero ed il suo doppio possono essere rappresentati da una variabile di tipo
`int`. Nella sequenza è sempre presente almeno una cifra. L'argomento ha una
lunghezza massima di 256 tra lettere e cifre.


Esempio
-------

Eseguendo `soluzione` e avendo `21#3` nel flusso di ingresso, il programma
emette nel flusso di uscita `46` che è il doppio del numero `23` ottenuto
concatenando tutte e sole le cifre non seguite da `#`.
