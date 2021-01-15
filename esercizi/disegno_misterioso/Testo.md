Disegno misterioso
==================

Descrizione
-----------

Un artista dispettoso *scompone* i suoi disegni tagliandoli in tante righe e poi
dividendo ciascuna riga in due parti, incollando la seconda parte davanti alla
prima e assemblando in fine tutte le righe.

Per facilitare chi voglia ricomporre i suoi disegni, però, incolla il carattere `|`
in cima e in fondo ad ogni riga e separa le due parti di ciascuna riga col
carattere `@`. Ad esempio,

    |efg@abcd|
    |hijklmn@|
    |u@opqrst|

è il modo in cui ha scomposto il disegno

    abcdefg
    hijklmn
    opqrstu

infatti, se guardiamo la riga `|efg@abcd|` del disegno scomposto, per ottenere
la riga del disegno originale basta prendere la parte dopo la `@` (che è `abcd`)
e rimetterla davanti a quella che viene prima della `@` (che è `efg`), ottenendo
`abcdefg`.

 Scrivete un programma che, dato nel flusso di ingresso un disegno scomposto,
emetta nel flusso di uscita il disegno originale.


Vincoli
-------

Tutte le linee nel flusso di ingresso hanno la stessa lunghezza; in ciascuna
riga il carattere `@` compare esattamente una volta, mentre il carattere `|`
compare all'inizio e alla fine, ma non è escluso che possa comparire anche in
altre posizioni.


Esempio
-------

Eseguendo `soluzione` e avendo

    |     *   @ |
    |\  @     / |
    | /   \ @   |
    |  /     \@ |
    | |==@   ==||
    |     | |  @|

nel flusso di ingresso, il programma emette

          *   
         / \  
        /   \
       /     \
       ==| |==
         | |  

nel flusso di uscita.


Suggerimenti
------------

Per conoscere la posizione del carattere `@` all'interno di una stringa potete
usare un ciclo `for`, oppure il metodo `indexOf` della classe `String`.
