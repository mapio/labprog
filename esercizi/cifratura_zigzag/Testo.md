Cifratura a zigzag
==================

Descrizione
-----------

La cifratura è una tecnica tramite la quale si traduce un testo *in chiaro* in
una versione più difficile da comprendere, ma in modo tale che il testo
*cifrato* così ottenuto possa essere ritrasformato (conoscendo l'opportuno
procedimento), nel testo in chiaro.

La cifratura a *zigzag* funziona in questo modo: supponendo di partire dal
messaggio

    Ci hanno scoperti, fuggiamo!

per prima cosa si eliminano tutti i caratteri non alfabetici (spazi compresi) e
si tramutano tutte le lettere in maiuscole, si scrive quindi la stringa così
ottenuta con un andamento "a zigzag" su tre righe

    C . . . N . . . C . . . R . . . U . . . A . .
    . I . A . N . S . O . E . T . F . G . I . M .
    . . H . . . O . . . P . . . I . . . G . . . O

infine, si copiano i caratteri alfabetici sulla prima riga, seguiti da quelli
sulla seconda e poi terza, ottenendo

    CNCRUAIANSOETFGIMHOPIGO

Scrivete un programma che, dato un testo in chiaro sulla prima linea del flusso
di ingresso, emetta il corrispondente testo cifrato nel flusso di uscita.


Vincoli
-------

Il testo in chiaro è contenuto sulla prima linea, il testo cifrato deve essere
emesso senza spazi e seguito da un *a-capo*.


Esempio
-------

Eseguendo `soluzione` e avendo

    Chissa', saro' bravo?

nel flusso di ingresso, il programma emette

    CSRAHSAAORVISBO

nel flusso di uscita, che corrisponde alla disposizione a zigzag

    C . . . S . . . R . . . A . .
    . H . S . A . A . O . R . V .
    . . I . . . S . . . B . . . O


Suggerimenti
------------

Non c'è davvero bisogno di disporre i caratteri a zigzag, basta osservare con
che "cadenza" vengono prelevati dal testo in chiaro i caratteri disposti su
ciascuna riga, ossia la distanza nella testo in chiaro tra due caratteri
consecutivi sulle varie righe.
