Divisibile per quattro
======================

Descrizione
-----------

Un numero è divisibile per quattro se le sue ultime cifre decimali `...du` sono
tali che 2`d` + `u` è un divisibile per quattro; ad esempio `57941` non è
divisibile per 4 perché 2`4` + `1` = 9 non è divisibile per quattro, ma `73524` è
divisibile per quattro essendolo 2`2` + `4` = 8.

Detto altrimenti, è possibile determinare se un numero decimale è divisibile per
4 osservando soltanto le sue ultime due cifre (questo non è vero in generale, ad
esempio può essere necessario osservare tutte le cifre di un numero decimale per
sapere se è divisibile per 11).

Scrivete un programma che, dato nel flusso di ingresso un numero decimale,
emetta nel flusso di uscita `divisibile`, o `non divisibile`, a seconda che il
numero immesso sia, o meno, divisibile per 4.


Vincoli
-------

Il numero introdotto non può essere rappresentato con una variabile di tipo
`long`, potrebbe infatti avere un numero molto elevato di cifre.

Il programma non deve contenere alcuna operazione di divisione `/` o modulo `%`.


Esempio
-------

Eseguendo `soluzione` e avendo

    1231124412412322312355348235070125712141123111251251123173524

nel flusso di ingresso, il programma emette `divisibile` nel flusso di uscita.


Suggerimenti
------------

Data la dimensione del numero in ingresso, l'unico modo di immagazzinarlo è in
una variabile di tipo `String`.

Data una stringa `s`, per accedere al suo carattere in posizione `i` potete
usare il metodo `charAt` (della classe `String`); esso restituisce un
valore di tipo `char`; valori di questo tipo possono essere trattati come
"piccoli interi", possono cioè comparire nelle espressioni aritmetiche.

Facciamo un esempio: al termine dell'esecuzione di questo segmento di codice

    String s = "a3b";
    int x = s.charAt(1) - '0'

la variabile `x` ha valore (intero, non `char`) pari a 3.

Poiché le cifre decimali variano tra `0` e `9`, l'espressione 2`d` + `u` può
assumere valori che vanno da `0` a `27`, tra tali numeri, solo 7 risultano
divisibili per quattro.
