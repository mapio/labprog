Conta linee
===========

Descrizione
-----------

Come visto a lezione, il comando `wc` conta le *linee*, le *parole* e i
*caratteri*,  contenute in un file di testo.

Create un file di nome `soluzione.sh` che contenga la corretta invocazione di
`wc` perché emetta esclusivamente il numero di linee persenti nel flusso di
ingresso.


Esempio
-------

Ponendo in esecuzione la vostra soluzione con

    bash soluzione.sh

e avendo

    chi
    non
    studia
    non
    rosica

viene emesso il numero

    5

nel flusso di uscita.


Suggerimenti
------------

Usate il comando `man` per scoprire l'opzione del comando `wc` che ne limita
l'output al solo conteggio delle linee (evitando che riporti il conteggio di
parole e caratteri).

Ricordate che, digitando da tastiera, il flusso di ingresso può essere terminato
premendo i tasti `CTRL+d` (ossia premendo il tasto `CTRL` contemporaneamente al
tasto `d`).

Se volete usare la **redirezione** per eseguire i test, pote porre in esecuzione
la soluzione usando il carattere speciale `<`, ad esempio

    bash soluzione.sh < input-1.txt

dovrebbe produrre, se la soluzione è giusta, quanto contenuto nel file
`output-1.txt`.
