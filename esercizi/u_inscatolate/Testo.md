U Inscatolate
=============

Descrizione
-----------

Scrivete un programma che, dati due interi interi N e M, con N > M > 0, come
parametri sulla linea di comando emetta nel flusso di uscita un disegno come il
seguente (qui N è pari a `4` e M a `2`):

    | +---+ |
    | |   | |
    | |   | |
    | |   | |
    | |   | |
    |       |
    |       |
    |       |
    +-------+

ossia due "U": la prima coi lati composti da 2N + 1 caratteri e rivolta verso
l'alto, la seconda coi lati composti da 2M + 1 caratteri e rivolta verso il
basso, disposta al centro della prima e allineata al suo lato superiore.


Vincoli
-------

Il vincolo sui numeri in ingresso N > M > 0 implica che N ≥ 2 e M ≥ 1, non si
possono assumere limiti superiori per N e M.


Esempio
-------

Eseguendo `soluzione 2 1` il programma emette

    |+-+|
    || ||
    || ||
    |   |
    +---+

nel flusso di uscita; eseguendo `soluzione 5 2` il programma emette

    |  +---+  |
    |  |   |  |
    |  |   |  |
    |  |   |  |
    |  |   |  |
    |         |
    |         |
    |         |
    |         |
    |         |
    +---------+

nel flusso di uscita.
