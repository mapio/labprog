Colonne di lettere
==================

Descrizione
-----------

Scrivere un programma che, data una sequenza di lettere minuscole come argomenti
sulla linea di comando, emetta nel flusso di uscita una sequenza di colonne
(separate l'una dall'altra da una colonna di spazi e allineate al basso)
ciascuna composta di lettere consecutive che parta dalla lettera `a` e termini,
rispettivamente, nella lettera indicata.


Vincoli
-------

Le lettere specificate sono comprese tra `a` e `z`. Non si può assumere alcun
vincolo sul numero di argomenti sulla linea di comando. Non devono essere emesse
linee composte solo di spazi.


Esempio
-------

Eseguendo `soluzione c a l l e` il programma emette

        l l
        k k
        j j
        i i
        h h
        g g
        f f
        e e e
        d d d
    c   c c c
    b   b b b
    a a a a a

nel flusso di uscita.

ossia 5 colonne separate l'un l'altra da uno spazio, allineate al basso, che
iniziano da `a` e tali per cui la lettera che compare più in alto in ciascuna
colonna corrisponde al rispettivo argomento sulla linea di comando. Si osservi
che il numero di righe è 12, pari alla posizione nell'alfabeto dell'argomento
ultimo in ordine alfabetico (nell'esempio, la lettera `l` che è in posizione
12).

Eseguendo `soluzione a c a b` il programma  emette

      c
      b   b
    a a a a

nel flusso di uscita.
