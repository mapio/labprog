Ordinali di von Neuman
======================

Descrizione
-----------

John von Neumann è stato un matematico, fisico e informatico americano (di
origini ungheresi) dei primi del '900 che ha dato moltissimi contributi
fondamentali in ciascuna delle discipline in cui si è cimentato.

A von Neumann si deve la definizione secondo cui un *ordinale* è l'insieme *ben
ordinato* di tutti gli ordinali più piccoli di esso; i numeri *naturali* sono
un esempio di ordinali e possono essere denotati come segue:

    0 = {}         = {}
    1 = {0}	       = {{}}
    2 = {0, 1}     = {{}, {{}}}
    3 = {0, 1, 2}  = {{}, {{}}, {{}, {{}}}}

ossia si parte da `{}` che denota lo `0` e quindi si denota `N` come la sequenza
dei denotati dei numeri tra `0` e `N-1` (separati da `, ` e racchiusi tra `{` e `}`).

Scrivete un programma che, dato un numero naturale `N` come parametro sulla riga
di comando, emetta il suo denotato nel flusso di uscita.


Vincoli
-------

Il numero in ingresso può essere rappresentato da una variabile di tipo `int`.


Esempio
-------

Eseguendo `soluzione 4` il programma emette

    {{}, {{}}, {{}, {{}}}, {{}, {{}}, {{}, {{}}}}}

nel flusso di uscita.
