Lunghezza media delle parole
============================

Descrizione
-----------

Scrivete un programma che, letta una sequenza di parole sulla prima linea del
flusso di ingresso, emetta nel flusso di uscita la somma delle loro lunghezze e
il loro numero. Ad esempio, se il flusso di ingresso contiene

    Le parole, non sono poche: ma tante!

il programma emette `27/7` nel flusso di uscita.


Vincoli
-------

Per *parola* si intende una sequenza massimale di lettere dell'alfabeto, ad
esempio `ciao,zazzera3bella` sono 3 parole: `ciao`, seguita da `zazzera` e
`bella` (di lunghezza complessiva pari a 16 caratteri); altrimenti detto, le
parole sono separate da qualunque carattere che non sia una lettera, non solo da
*white-space*, ma anche da segni di interpunzione, cifre e altro.

I numeri coinvolti possono essere tutti rappresentati da variabili di tipo
`int`.


Esempio
-------

Eseguendo `soluzione` e avendo

    (come) dire, amico mio, non hai capito? io credo sia semi-facile!

il programma emette `48/12` nel flusso di uscita.


Suggerimenti
------------

Scandendo i caratteri di una stringa è facile contare di quante parole è
composte: basta contare il numero di volte che un carattere che è una lettera
dell'alfabeto è preceduto da un carattere che non lo è — assumendo che il primo
carattere sia preceduto da uno che non sia una lettera.

Ad esempio, in `non, saprei` ci sono due parole perché il primo carattere `n` è
una lettera (e abbiamo assunto che non lo sia quello che lo precede) e c'è uno
spazio (che non è una lettera) prima della lettera `s`. Analogamente, in
`(ciao)` c'è una sola parola perché `c` è l'unica lettera preceduta da un
carattere che non è una lettera.

Per sapere se il carattere `c` (dichiarato di tipo `char`) è una lettera
dell'alfabeto, o meno, potete usare il metodo `Character.isLetter(c)` che
restituisce un valore booleano che è vero se e solo se `c` ha per valore un
carattere che corrisponde a una lettera dell'alfabeto.
