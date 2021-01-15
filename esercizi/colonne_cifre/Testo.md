Colonne di cifre
================

Descrizione
-----------

Scrivere un programma che, data una sequenza di cifre decimali come argomenti
sulla linea di comando, emetta nel flusso di uscita una sequenza di colonne
(separate l'una dall'altra da una colonna di spazi ed allineate al basso)
ciascuna composta di cifre consecutive che parta dal basso con la cifra `0` e
termini, rispettivamente, nella cifra indicata.


Vincoli
-------

Le cifre specificate sono comprese tra `0` e `9`. Non si può assumere alcun
vincolo sul numero di argomenti sulla linea di comando. Non devono essere emesse
linee composte solo di spazi.


Esempio
-------

Eseguendo il programma `soluzione 3 1 6 6 2` viene emesso il seguente testo nel
flusso di uscita

        6 6
        5 5
        4 4
    3   3 3
    2   2 2 2
    1 1 1 1 1
    0 0 0 0 0

ossia 5 colonne separate l'un l'altra da uno spazio, allineate al basso, che
iniziano da `0` e tali per cui la cifra che compare più in alto in ciascuna
colonna corrisponde al rispettivo argomento sulla linea di comando. Si osservi
che il numero di righe è 7 (ossia non ci sono righe completamente vuote).

Eseguendo il programma `soluzione 1 2 1 2` viene emesso il seguente testo nel
flusso di uscita

      2   2
    1 1 1 1
    0 0 0 0
