Pochi zero
==========

Descrizione
-----------

Scrivete un programma che, data una sequenza di numeri decimali come argomenti
sulla linea di comando, emetta nel flusso d'uscita il primo tra i numeri che
contengono il minor numero (non nullo) di cifre `0`, o non emetta nulla se
nessuno dei numeri contiene la cifra `0`.


Vincoli
-------

Gli argomenti sulla linea di comando sono costituiti solo da cifre decimali, non
c'è vincolo sul numero, o lunghezza degli argomenti. In caso più numeri
contengano la stessa quantità di `0`, va emesso il primo tra quelli di quantità
minima.


Esempio
-------

Eseguendo `soluzione 1001 23 420 1` il programma emette `420` nel flusso
d'uscita (perché è l'unico numero che contiene un solo `0`); eseguendo
`soluzione 200 100 300` il programma emette `200` nel flusso d'uscita (perché è
il primo numero che contiene due `0`).
