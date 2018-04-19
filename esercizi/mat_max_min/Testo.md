Massimi e minimi
================

Descrizione
-----------

Data la dimensione di una matrice quadrata di interi come parametro sulla linea
di comando e i valori degli elementi della matrice nel flusso di ingresso,
emettere nel flusso di uscita la somma dei massimi valori per riga, meno la somma
dei minimi valori per colonna.


Vincoli
-------

Le dimensioni della matrice sono tali per cui possa essere contenuta in memoria.
Il flusso di uscita deve contenere un solo numero. Dato il parametro `N` come
argomento sulla linea di comando, il flusso di ingresso contiene N * N interi
separati da *white-space* corrispondenti ai valori della matrice, elencati per
riga.


Esempio
-------

Eseguendo `soluzione 4` e avendo


    1   2  3  4
    9  10 11 12
    5   8  7  6
    14 17 16 15

nel flusso di ingresso, il programma emette `31` pari alla differenza della
somma massimi per riga 4 + 12 + 8 + 17  = 41, meno la somma dei minimi valori
per colonna 1 + 2 + 3 + 4  = 10.
