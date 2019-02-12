Carrello
========

Descrizione
-----------

Un *carrello* è una collezione di *beni*, ciascuno presente in una determinata
*quantità*, che rappresentano gli acquisti di un utente su un sito di commercio
elettronico.

Un carrello supporta il seguente insieme di operazioni:

- `aggiungi N B`, che aggiunge `N` volte il bene `B` al carrello;
- `togli N B` che toglie `N` volte il bene `B` dal carrello (togliere un bene
  assente dal carrello non ha effetto, mentre togliere un bene presente, ma per
  un valore maggiore della sua quantità nel carrello, lo elimina dal carrello);
- `contiene B` che emette `SI` o `NO` a seconda che il carrello contenga, o meno,
  il bene `B`,
- `quanti B` che emette il numero corrispondente alla quantità del bene `B`
  presente nel carrello (o `0` se il bene non è presente),
- `vuoto` che emette `SI` o `NO` a seconda che il carrello sia, o meno, vuoto;

dove `N` è un numero intero positivo e `B` una stringa (eventualmente contenente
spazi). Ad esempio, a partire da un carrello vuoto, l'elenco di operazioni

    vuoto
    aggiungi 3 cuffia
    aggiungi 1 lettore mp3
    togli 1 cuffia
    quanti cuffia
    contiene lettore mp3
    vuoto

emette

    SI
    2
    SI
    NO

Scrivete un programma che, implementato un *carrello*, ne istanzi diversi per
poter gestire una sequenza di operazioni sui medesimi.

Più precisamente, il programma riceve un intero positivo `M` come parametro
sulla linea di comando che corrisponde al numero di carrelli da istanziare,
quindi nel flusso di ingresso riceve una sequenza di operazioni (come le
suddette), ciascuna preceduta dal numero di carrello (compreso tra `1` e `M`) su
cui deve essere effettuata. Il programma emette nel flusso di uscita il risultato
delle operazioni (senza premettere il numero di carrello). Si vedano gli esempi
per maggiori dettagli.


Vincoli
-------

Il flusso di ingresso contiene una operazione per linea, prima dell'operazione è
presente il numero di carrello seguito da uno spazio, quindi tra l'operazione e
l'eventuale `N` è presente uno e un solo spazio e l'eventuale `B` è la restante
parte della riga (che può contenente altri spazi).

Nel flusso di uscita deve essere presente una linea per ciascuna operazione che
emette un numero, oppure la stringa `SI` o `NO`.


Esempio
-------

Eseguendo `soluzione 1` e avendo

    1 vuoto
    1 aggiungi 3 cuffia
    1 aggiungi 1 lettore mp3
    1 togli 1 cuffia
    1 quanti cuffia
    1 contiene lettore mp3
    1 vuoto

nel flusso di ingresso, il programma emette

    SI
    2
    SI
    NO

nel flusso di uscita. Eseguendo `soluzione 3` e avendo

    3 vuoto
    3 togli 5 pere
    2 aggiungi 3 cuffia
    3 quanti pere
    3 aggiungi 3 pere
    2 aggiungi 1 lettore mp3
    3 quanti pere
    3 togli 2 pere
    2 togli 1 cuffie
    3 quanti pere
    3 togli 2 pere
    2 quanti cuffia
    3 contiene pere
    3 vuoto
    2 quanti lettore
    1 vuoto

nel flusso di ingresso, il programma emette

    SI
    0
    3
    1
    3
    NO
    SI
    0
    SI

nel flusso di uscita.

Suggerimenti
------------

Potrebbe essere comodo raccogliere gli *attributi* necessari per la
rappresentazione del carrello assieme alle *operazioni* in una apposita classe.
