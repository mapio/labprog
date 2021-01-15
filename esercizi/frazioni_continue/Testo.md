Frazioni continue
=================

Descrizione
-----------

La *frazione continua* ottenuta dalla sequenza a₀, a₁, …, aₙ di interi positivi
(tranne possibilmente il primo) è la frazione

    a₀ + 1 / ( a₁ + 1 / ( a2 + 1 / ( … + 1 / aₙ ) ) )

Ad esempio, la frazione continua ottenuta da -1, 5, 2, 4 è

    -1 + 1 / ( 5 + 1 / ( 2 + 1 / 4 ) )

corrispondente alla frazione "semplice" -40/49, infatti

    -1 + 1 / ( 5 + 1 / ( 2 + 1 / 4 ) ) =
    -1 + 1 / ( 5 + 1 / ( 9 / 4 ) ) =
    -1 + 1 / ( 5 + 4 / 9 ) ) =
    -1 + 1 / ( 49 / 9 ) =
    -1 + 9 / 49 =
    -1 + 9 / 49 =
    -40 / 49

Ovviamente una frazione continua è un numero razionale e si può dimostrare che
per ogni numero razionale esiste una sola frazione continua che lo rappresenti
(a meno di eventuali 1 in fondo — poiché, ad esempio a -1, 5, 2, 4 e -1, 5, 2,
3, 1 corrisponde la stessa frazione).

Scrivete un programma che, data una sequenza di numeri interi positivi come
argomenti sulla linea di comando, emetta la frazione (semplice) corrispondente
alla frazione continua ottenuta da tale sequenza.


Vincoli
-------

Tutti i numeri coinvolti nel programma possono essere rappresentati da variabili
di tipo `int`; la linea di comando contiene sempre almeno un intero. L'output
deve essere costituito dal numeratore, seguito da ` / ` (spazi compresi) e quindi dal
denominatore della frazione semplice.


Esempio
-------

Eseguendo `soluzione 1 2 3` il programma emette `10 / 7`.


Suggerimenti
------------

Le frazioni continue hanno un aspetto "auto-simile", il che suggerisce che un
approccio ricorsivo potrebbe consentire di progettare un semplice algoritmo per
risolvere questo problema.

Potrebbe essere comodo usare un vettore di due interi per rappresentare
numeratore e denominatore di una frazione, in particolare perché i metodi
possono avere anche dei vettori come valori di ritorno; ad esempio il metodo

    public static int[] frazione(int numeratore, int denominatore) {
        int[] numeratoreDenominatore = new int[2];
        numeratoreDenominatore[0] = numeratore;
        numeratoreDenominatore[1] = denominatore;
        return numeratoreDenominatore;
    }

riceve due parametri interi e restituisce un vettore che li combina.


Osservazioni
------------

Si può dimostare che a ogni numero irrazionale corrisponde un’unica frazione
continua infinita, questo fatto suggerisce l'uso delle frazioni continue
(finite, ottenute troncando quelle infinite) per ottenere approssimazioni
razionali dei numeri irrazionali.

Ad esempio, alla sequenza 3, 7, 16 corrisponde la frazione continua 355 / 133 il
cui valore 3.141592… corrisponde a quello di pi greco per le prime 6 cifre
decimali.

Sapreste dire a che numero corrisponde la frazione continua infinita 1, 1, 1, …?
Usate di nuovo l'"auto-similarità"!
