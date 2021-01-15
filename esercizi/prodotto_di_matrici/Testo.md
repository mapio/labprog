Prodotto di matrici
===================

Descrizione
-----------

Dati due vettori di interi di dimensione *s*, il loro *prodotto interno* è il
numero intero che si ottiene sommando i prodotti termine a termine degli
elementi dei due vettori. Più formalmente, detti *a* e *b* i due vettori, si ha
che il loro prodotto interno è Σᵤaᵤbᵤ (con *u* che va da 1 a *s*). Ad esempio,
il prodotto interno dei vettori (3 0 4) e (2 1 5) è pari a 26 = 3 * 2 + 0 * 1 +
4 * 5.

Date due matrici *A* e *B* di numeri interi, rispettivamente di dimensione *r*
x *s* e *s* x *t*, il loro *prodotto* è la matrice di interi *C* di dimensione
*r* x *t* il cui elemento di posto `*i*, *j*` è dato dal prodotto interno
dell'*i*-esima riga di *A* e della *j*-esima colonna di *B*. Più formalmente,
per ogni *i* tra 1 e *r* e *j* tra 1 e *t*, si ha che cᵢⱼ = Σᵤaᵢᵤbᵤⱼ (con *u*
che va da 1 a *s*). Ad esempio, il prodotto di

    3 0 4
    1 2 3

e

    5 2
    6 1
    7 5

è pari a

    43 26
    38 19

dove, ad esempio, l'elemento di posto 1, 2 vale 26 essendo il prodotto interno
della prima riga di *A* pari a (3 0 4) e della seconda colonna di *B* pari a (2
1 5).


Vincoli
-------

I numeri coinvolti sono tali per cui le matrici *A* e *B* possono essere
rappresentate in memoria e gli interi coinvolti possono essere rappresentati da
variabili di tipo `int`.


Esempio
-------

Eseguendo `soluzione 2 3 2` e avendo

    1 0 0
    0 1 0
    3 4
    5 6
    7 8

nel flusso di ingresso, il programma emette

    3 4
    5 6

nel flusso di uscita.
