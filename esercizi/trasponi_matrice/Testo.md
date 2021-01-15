Trasponi matrice
================

Descrizione
-----------

Una *matrice* **A** a valori interi di dimensioni `N` x `M` è una "tabella" di
`N` righe contenenti ciascuna `M` numeri interi. La *trasposta* **T** di una
matrice **A** a valori interi di dimensione `N` x `M` è una matrice a valori
interi di dimensione `M` x `N` il cui *j*-esimo elemento della *i*-esima riga è
l'elemento *i*-esimo della *j*-esima riga della matrice **A**. Ad esempio, la
trasposta di

    1 2
    3 4
    5 6

è

    1 3 5
    2 4 6

Scrivete un programma che, dati `N` e `M` come argomenti sulla linea di comando
e `N` righe di `M` valori interi nel flusso di ingresso, emetta nel flusso di
uscita le `M` righe di `N` numeri interi corrispondenti alla trasposta della
matrice in ingresso.


Vincoli
-------

Tutte le grandezze coinvolte nel programma possono essere rappresentate da
variabili di tipo `int`, le dimensioni della matrice sono positive e tali per
cui la matrice possa essere contenuta in memoria. I numeri in ingresso sono
separati da spazi (su ogni riga) e *a-capo* tra una riga e l'altra. Il flusso di
uscita deve contenere numeri separati da uno spazio (per riga) e un *a-capo* tra
righe (e al termine dell'ultima riga).


Esempio
-------

Eseguendo `soluzione 1 3` e avendo `1 2 3` nel flusso di ingresso, il programma
emette

    1
    2
    3

nel flusso di uscita.
