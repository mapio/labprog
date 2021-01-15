La strana somma
===============

Descrizione
-----------

Tutti ricordiamo l'algoritmo della somma "in colonna": si scrivono i due addendi
allineandoli a destra, si procede ordinatamente da destra a sinistra sommando le
cifre degli addendi, scrivendo nel risultato la cifra delle unità così ottenuta
ed eventualmente tenendo a mente il *riporto*. Ad esempio, per sommare `103` con
`39` si procede come segue

    103 +
     39 =
    142

si sommano `3` e `9`, ottenendo 12, si scrive quindi `2` e si tiene un riporto
di `1`, ora si sommano `0`, `3` e il riporto ottenendo `4` (questa volta senza
riporto); in fine si somma `1` e `0` (si può pensare a `39` come a `039`).

Consideriamo ora una *strana somma* in cui, se il riporto a un certo passo non è
nullo, invece di scrivere la cifra delle unità nel risultato, scriveremo `9`
meno la cifra delle unità. Nell'esempio precedente, scriveremmo `7` al posto
della prima cifra del risultato (perché c'è riporto), mentre lasceremmo
inalterate le altre cifre. Il risultato sarebbe quindi `147`.

Facciamo un altro esempio, la strana somma di `1146` e `2085` è

    1146 strana somma
    2097 =
    3256

perché `6` + `7` da `13` e quindi genera riporto, per cui nel risultato si segna
`9` - `3`; poi si procede sommando `4` + `9` e il riporto `1` ottenendo `14`, di
nuovo con riporto, per cui nel risultato si segna `9` - `4`. Le ultime due cifre
del risultato (poiché non viene generato riporto), si ottengono come nella somma
usuale.

Scrivete un programma che dati due numeri interi come argomenti sulla linea di
comando, emetta la loro strana somma nel flusso di uscita.


Vincoli
-------

I numeri in ingresso non possono essere rappresentati con variabili di tipo
primitivo (`int`, o `long`).


Esempio
-------

Eseguendo `soluzione 123353048761934567234232352 53522329345273423` il programma
emette `123353048885556893579595775` nel flusso di uscita.


Suggerimenti
------------

Poiché l'operazione da compiere non è una normale somma, si sconsiglia l'uso
della classe `BigInteger` per risolvere questo esercizio; piuttosto si usino
vettori di `char`, o `int` (o le stringhe stesse avute come argomenti).
