Regine all'attacco
==================

Descrizione
-----------

Scrivete un programma che, data una rappresentazione della posizione di due
regine su una scacchiera come la seguente nel flusso di ingresso

    - - - - - - - -
    - - - - - - - -
    - - - W - - - -
    - - - - - - - -
    - - - - - - - -
    - - - - - - B -
    - - - - - - - -
    - - - - - - - -

emetta nel flusso di uscita `SI` qualora le due regine siano in posizione tale da
potersi attaccare reciprocamente (come in questo caso). Si ricorda che, nel
gioco degli scacchi, la regina può muoversi in verticale, orizzontale, o
diagonale di un numero qualunque di caselle.


Vincoli
-------

Il flusso di ingresso è composto da 8 linee, ciascuna linea è composta da 8
caratteri a scelta tra `W`, `B` (che rappresentano, rispettivamente, la regina
bianca e nera) e `-` (che rappresentano le caselle vuote) separati da uno
spazio; nel flusso di ingresso i caratteri `W` e `B` sono contenuti esattamente
una volta ciascuno. Il flusso di uscita deve contenere `SI`, oppure essere
*vuoto* (se le regine non possono attaccarsi).


Esempio
-------

Eseguendo `soluzione` e avendo

    - - - - - - - -
    - - - - - - - -
    - - - W - - - -
    - - - - - - - -
    - - - - - - - -
    - - - - B - - -
    - - - - - - - -
    - - - - - - - -

nel flusso di ingresso, il programma non emette nulla nel flusso di uscita.
