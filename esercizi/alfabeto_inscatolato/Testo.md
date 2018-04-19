Alfabeto Inscatolato
====================

Descrizione
-----------

Scrivete un programma che, dati due interi N e M, con N > M > 0, come
parametri sulla linea di comando emetta nel flusso di uscita un disegno come il
seguente (qui N è pari a `4` e M a `2`):

    a efghi y
    b d   j x
    c c   k w
    d b   l v
    e a   m u
    f       t
    g       s
    h       r
    ijklmnopq

ossia due "U" i cui lati sono composti dalle lettere dell'alfabeto inglese:
la prima ha lati formati da 2N + 1 caratteri e rivolta verso l'alto, la seconda
coi lati formati da 2M + 1 caratteri e rivolta verso il basso, disposta al
centro della prima e allineata al suo lato superiore.


Vincoli
-------

Il vincolo sui numeri in ingresso N > M > 0 implica che N ≥ 2 e M ≥ 1, non si
possono assumere limiti superiori per N e M.


Esempio
-------

Eseguendo `soluzione 3 1` il programma emette

    a cde s
	b b f r
	c a g q
	d     p
	e     o
	f     n
	ghijklm

nel flusso di uscita.

Suggerimenti
------------

Data una variabile `c` contenente un carattere dell'alfabeto, per "spostarlo"
ciclicamente in avanti di 1 posto potete usare l’espressione

    (char)(((c - 'a') + 1) % 26 + 'a')

mentre, per "spostare" `c` ciclicamente all'indietro potete usare l'espressione

    (char)(((c - 'a') + 25) % 26 + 'a')
