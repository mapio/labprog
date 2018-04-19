Suddivisione degli URL
======================

Descrizione
-----------

Un *Uniform Resource Locator* (URL) è quello che viene informalmente definito
"indirizzo web" (ad esempio di una pagina html, o di una immagine), ad esempio:

    http://www.dsi.unimi.it/img/titolo1.jpg
    http://santini.dsi.unimi.it/
    ftp://mirror.switch.ch/pool/2/mirror/tex/systems/texlive/tlnet/00_TIME.txt

più formalmente, un URL è composto di tre parti:

- *schema*: dall'inizio dell'indirizzo ai primi due punti (esclusi),
- *host*: dalla seconda alla terza barra (escluse),
- *path*: dalla terza barra (esclusa) in poi;

ad esempio, per il primo indirizzo riportato sopra, le tre parti sono:

    http
    www.dsi.unimi.it
    img/titolo.jpg

si osservi che il *path* può essere vuoto (ma, per semplicità, qui assumiamo che
un URL contenga sempre almeno tre barre).

Scrivete un programma che legga una sequenza di URL dal flusso di ingresso ed
emetta nel flusso di uscita le sue tre parti.


Vincoli
-------

Non si possono assumere vincoli sulla lunghezza massima, o sul numero, degli URL
in ingresso; ogni linea del flusso contiene uno ed un solo URL (nella linea non
sono presenti spazi prima, dopo, o all'interno di esso).

Nel flusso di uscita vanno riportate le parti di ciascun URL, una per linea
(senza aggiungere spazi).


Esempio
-------

Eseguendo `soluzione` e evendo nel flusso di ingresso

    http://www.dsi.unimi.it/img/titolo1.jpg
    http://santini.dsi.unimi.it/
    ftp://mirror.switch.ch/pool/2/mirror/tex/systems/texlive/tlnet/00_TIME.txt

il programma emette nel flusso di uscita

    http
    www.dsi.unimi.it
    img/titolo1.jpg
    http
    santini.dsi.unimi.it

    ftp
    mirror.switch.ch
    pool/2/mirror/tex/systems/texlive/tlnet/00_TIME.txt

si noti che il flusso di uscita contiene una linea vuota se il *path* è vuoto.


Osservazioni
------------

Le API di Java prevedono una varietà di classi e metodi per operare sugli URL;
scopo di questo esercizio è fare pratica con le stringe, per questa ragione si
raccomanda di limitarsi all'uso della classe `String` e dei suoi metodi statici.
