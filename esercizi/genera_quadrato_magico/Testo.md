Genera un quadrato magico
=========================

Descrizione
-----------

Un *quadrato magico* è una matrice quadrata di numeri interi in cui le somme di
ogni riga e di ogni colonna hanno lo stesso valore.

Questo si può ottenere banalmente, ad esempio, se tutti gli elementi hanno lo
stesso valore. C'è però un modo più interessante per generare una matrice di
dimensione `N` x `N` i cui elementi sono i numeri da `1` a `N`² e che è un
quadrato magico, se `N` dispari.

Si inizia mettendo `1` nella posizione centrale della prima riga e si
procede a riempire la matrice con i numeri successivi "spostandosi":

- in alto a destra, se tale posizione è vuota,
- oppure in basso;

nello "spostarsi" bisogna considerare la matrice come sopra la prima riga ci
fosse l'ultima e a destra dell'ultima colonna ci fosse la prima, altrimenti
detto come se la matrice fosse scritta su una "ciambella" ottenuta incollando
l'ultima riga alla prima e l'ultima colonna alla prima.

Ad esempio, questo metodo, per `N` pari a `7` genera la matrice

     30  39  48   1  10  19  28
     38  47   7   9  18  27  29
     46   6   8  17  26  35  37
      5  14  16  25  34  36  45
     13  15  24  33  42  44   4
     21  23  32  41  43   3  12
     22  31  40  49   2  11  20

infatti, dopo aver collocato l'`1` al centro della prima riga, si colloca il `2`
nella colonna successiva, ma dell'ultima riga, il che corrisponde ad uno
spostamento in alto a destra, tenendo conto che sopra la prima riga c'è
l'ultima; continuando a spostarsi in alto a destra, una volta raggiunto il `4`,
dall'ultima colonna si passa alla prima; poi, non potendo posizionare l'`8` in
alto a destra rispetto al `7`, lo si posiziona sotto di esso e così via fino a
riempire la matrice.

Vincoli
-------

Il numero `N` è compreso tra `1` e `100`; nel flusso di uscita i numeri di
ciascuna riga vanno separati da un singolo spazio e le righe vanno terminate con
un *a-capo*.


Esempio
-------

Eseguendo `soluzione 3` il programma emette

    8 1 6
    3 5 7
    4 9 2

nel flusso di uscita.
