Calcolatrice RPN, Tokenizer
===========================

Descrizione
-----------

Questo è il secondo esercizio di una serie il cui obiettivo è sviluppare un
insieme di *classi* che rappresentino il comportamento di una calcolatrice che
valuti *espressioni aritmetiche* in *notazione polacca inversa*. Prima di
iniziare, recuperate il sorgente della classe `Token` dell'esercizio precedente
e copiatelo in questa directory.

Implementiamo ora una classe `Tokenizer` che, data una stringa contenente una
espressione, permetta di accedere ai suoi *token* uno dopo l'altro; a questo
fine la classe deve avere un costruttore di segnatura

    public Tokenizer(String expression)

che costruisca l'oggetto corrispondete dalla stringa.

La classe deve poi avere due metodi che permettano di scandire l'espressione in
modo simile a come la classe `Scanner` delle API di Java permette di scandire il
flusso di ingresso; deve ossia avere

* un metodo di segnatura

      public boolean hasNextToken()

  che restituisca `true` se e solo se è presente un ulteriore token non ancora
  restituito;

* un metodo di segnatura

      public Token nextToken()

  che restituisca il prossimo token dell'espressione non ancora restituito.


### La classe di test

La classe `TestRunner` legge una linea dal flusso di ingresso, la utilizza per
costruire il un `Tokenizer` e quindi stampa tutti i token che esso restituisce.


Vincoli
-------

L'espressione contiene solo numeri e segni di operazione, separati da uno o più
segni di spaziatura. L'espressione, però, non è necessariamente "corretta"
(quale che sia la notazione: infissa, o prefissa).


Esempio
-------

Eseguendo `soluzione` e avendo nel flusso di ingresso

    10 + 20    - 3 / 4    * 10

il programma emette

    10
    +
    20
    -
    3
    /
    4
    *
    10

nel flusso di uscita.
