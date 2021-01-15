Minima complessità
==================

Descrizione
-----------

Ogni numero intero positivo può essere scritto in diversi modi usando somme e
prodotti (eventualmente parentesizzati) di numeri interi positivi. Ad esempio il
numero `5678` può essere scritto come

    2 * 17 * 167
    5678
    23 * 59 + 29 * 149
    (1 + 4 * 4) * (1 + 3 * 3 * (1 + 3 * 3 * 4))
    2 * (1 + 2 * (1 + 2 * (1 + 2 * 2 * (1 + 2 * 2 * 2 * 2 * (1 + 2 * (1 + 2 * 2))))))

se chiamiamo *peso* di una espressione aritmetica del genere la somma dei numeri
che vi compaiono, le precedenti espressioni hanno, rispettivamente, peso pari a

    2 + 17 + 167 = 186
    5678
    23 + 59 + 29 + 149 = 260
    1 + 4 + 4 + 1 + 3 + 3 + 1 + 3 + 3 + 4 = 27
    2 + 1 + 2 + 1 + 2 + 1 + 2 + 2 + 1 + 2 + 2 + 2 + 2 + 1 + 2 + 1 + 2 + 2 = 30

Chiamiamo *complessità* di un numero intero positivo `N` il minor peso tra
quello delle espressioni aritmetiche (del tipo di cui sopra) che hanno valore
`N`.

Si può mostrare che, ad esempio, la complessità di `5678` è `27` (grazie alla
quarta espressione qui sopra); la complessità degli interi positivi da `1` a
`20` è

    1 2 3 4 5 5 6 6 6 7 8 7 8 8 8 8 9 8 9 9

Scrivete un programma che, dato un intero positivo come parametro sulla linea di
comando, ne stampi la complessità nel flusso di ingresso.


Vincoli
-------

Tutti i numeri coinvolti nel programma possono essere rappresentati con
variabili di tipo `int`. Il numero in ingresso è compreso tra `1` e `10000`.


Esempio
-------

Eseguendo `soluzione 6` il programma emette `5` nel flusso d'uscita; eseguendo
`soluzione 30` il programma emette `10`.


Suggerimenti
------------

Dato un intero positivo `N` enumerare tutte le espressioni aritmetiche che
abbiano valore `N` è molto oneroso (e complesso). A ben guardare, però, per
calcolare la complessità di un numero non è necessario farlo: basta osservare
che la complessità di `N` è pari alla minima somma delle complessità di due
numeri `A` e `B` tali per cui `A + B = N` o `A * B = N`. Detto altrimenti, se
`compl()` fosse la funzione che calcola la complessità, si avrebbe

    compl(N) = min(compl(A) + compl(B))

dove il `min` è calcolato al variare di tutti gli `A` e `B` tali per cui `A + B =
N` o `A * B = N`.
