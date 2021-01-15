Calcolatrice RPN, Token
=======================

Descrizione
-----------

Questo è il primo esercizio di una serie il cui obiettivo è sviluppare un
insieme di *classi* che rappresentino il comportamento di una calcolatrice che
valuti *espressioni aritmetiche* in *notazione polacca inversa*.

Sin dalle elementari, avete visto espressioni aritmetiche scritte secondo la
cosiddetta *notazione infissa*, in cui l’operazione viene scritta tra gli
operandi, come in `6 + 5`, o `3 * 2`; questa notazione presenta un problema nel
caso in cui vengano "mescolate" più operazioni nella stessa espressione; ad
esempio `3 * 2 + 5` può valere `11` se eseguiamo prima `3 * 2` e quindi sommiamo
`5`, oppure `21` se eseguiamo prima `2 + 5` e quindi moltiplichiamo per `3` il
risultato parziale. Per risolvere questa ambiguità, viene usualmente definito un
concetto di *precedenza* tra le operazioni, ma implementare una calcolatrice per
espressioni infisse che tenga conto della precedenza delle operazioni non è
affatto banale.

Viceversa, come vedremo, c'è un modo elementare di implementare una calcolatrice
a patto di cambiare la notazione. Nulla vieta infatti di scrivere l’operazione
prima degli operandi, secondo la *notazione prefissa*, come in `+ 6 5` e `* 3
2`. Questa notazione è stata introdotta dal logico polacco *Jan Łukasiewicz*,
ragione per la quale è anche chiamata *notazione polacca*. Un grande vantaggio
di questa notazione è che l’operazione in qualche senso "annuncia" in anticipo
quel che dobbiamo fare, ragion per cui non c’è più alcuna ambiguità
sull'ordine in cui eseguire le operazioni.

Vediamo qualche esempio. L’espressione `+ * 3 2 5` può essere "raggruppata" (qui
con l'uso delle parentesi quadre) solo come `+ [* 3 2] 5`: non c’è nessun altro
modo che abbia senso: se si intendesse `[+ * 3] 2 5`, oppure `+ * [3 2 5]`,
questo violerebbe la convenzione per cui una espressione è data da una
operazione seguita dai suoi operandi (che possono essere a loro volta
espressioni, ma che devono sempre seguire la medesima convenzione). Stesso
discorso vale per `* 3 + 2 5`: anche in questo caso, si intende  `* 3 [+ 2 5]`,
perché non c’è altro modo legittimo di intendere l’espressione!

Come vedremo nel seguito, talvolta è comodo usare una versione di questa
notazione chiamata *notazione polacca inversa* in cui l'operatore viene scritto
*dopo* gli operandi, come in `5 2 3 * +`.  

Per il momento però concentriamoci sul primo passo utile a realizzare la
calcolatrice, che è costruire la *classe* `Token` che rappresenti uno dei
"pezzi" dell'espressione, ossia un *numero*, o un *operatore* (per semplicità ci
limiteremo a `+`, `*`, `-` e `/`). La classe deve avere un costruttore di
segnatura

    public Token(String token)

che costruisca il token corrispondete dalla stringa. La classe deve poi avere

* un metodo di segnatura:

      public boolean isNumber()

  che restituisca `true` se e solo se il token è un numero;

* un membro pubblico e immutabile `value` di tipo `int` che corrisponda al valore
  del token, se e solo se esso è un numero;

* un metodo di segnatura

      public boolean isOperator()

  che restituisca `ture` se se solo se il token è una operazione aritmetica;

* un membro pubblico e immutabile `operator` di tipo `char` che valga `+`, `*`,
  `-` o `/` a seconda del valore del token, se e solo se esso è un operatore.

I membri `value` e `operator` hanno valore sensato se e solo se il token è del
tipo relativo, ossia possono avere qualunque valore se, rispettivamente,
`isNumber` o `isOperator` restituisce `false`.

Infine, la classe deve sovrascrivere il metodo `toString` in modo che emetta
l'ovvia rappresentazione del token.


### La classe di test

La classe `TestRunner` legge una sequenza di stringhe dal flusso di ingresso,
ciascuna delle quali corrisponde a un token, costruisce un oggetto della classe
e lo emette nel flusso di uscita, prefissato da `V` se valore, o `O` se
operatore.


Vincoli
-------

I valori sono rappresentabili mediante il tipo `int`; ogni stringa corrisponde
a un token valido (ossia un numero, oppure un operatore a scelta tra quelli
possibili).


Esempio
-------

Eseguendo `soluzione` e avendo nel flusso di ingresso

    10
    + 20 -
    3 / 4
    *
    10

il programma emette

    V 10
    O +
    V 20
    O -
    V 3
    O /
    V 4
    O *
    V 10

nel flusso di uscita.
