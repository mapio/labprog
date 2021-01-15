Calcolatrice RPN, Evaluator
===========================

Descrizione
-----------

Questo è il quarto esercizio di una serie il cui obiettivo è sviluppare un
insieme di *classi* che rappresentino il comportamento di una calcolatrice che
valuti *espressioni aritmetiche* in *notazione polacca inversa*. Prima di
iniziare, recuperate i sorgenti della classe `Token`, `Tokenizer` e `IntStack`
degli esercizi precedente e copiateli in questa directory.

Siamo finalmente pronti a costruire la classe che valuterà l'espressione.
Iniziamo con un esempio, che ci servirà per illustrare l'*algoritmo di
valutazione* delle espressioni in notazione postfissa: consideriamo

    7 6 + 5 * 4 3 * +

che vale `77`: infatti si tratta di una somma (finisce per `+`) tra le due
espressioni `4 3 *` (che vale `12`) e `7 6 + 5 *` (che vale `65`); quest'ultima,
a sua volta, è un prodotto (finisce per `*`) tra `5` e l’espressione `7 6 +`
(che vale `13`).

Per ottenere tale risultato, basta usare una *pila* come segue:

* partiamo da una pila vuota,
* usando il tokenizer, leggiamo i token dell’espressione:
    * se incontriamo un numero, lo mettiamo sulla pila,
    * se incontriamo una operazione:
        * preleviamo due valori dalla pila,
        * li componiamo con l’operazione che abbiamo incontrato,
        * rimettiamo il risultato nella pila,
* al termine dell'espressione, la pila conterrà un solo valore: il *risultato*.

Provate per credere: dopo i primi due token la pila conterrà `7 6` (la cima
della pila è a destra), il terzo token è `+`, quindi la pila si svuota e riceve
`13`; al quarto token la pila diventa `13 5` e siccome il sesto token è `*` la
pila diventa `65`, i token settimo e ottavo rendono la pila `65 3 4`, il
penultimo token è un `*` che consuma i due elementi sulla cima della pila e li
rimpiazza con `12`. Siamo arrivati all'ultimo token, è un `+` che consuma gli
elementi sulla pila e vi lascia il risultato finale!

In caso di operazioni non commutative, si assume che l'ordine degli operandi
rispetti quello dell'espressione, altrimenti detto, l'espressione `4 2 -` vale
`2` e non `-2`; la divisione va intesa come divisione tra `int` e pertanto `2 4 /`
vale `0` (e non `0.5` o `2`).

Siamo arrivati alla fine! Realizzate una classe `Evaluator` che abbia un
costruttore di segnatura

    public Evaluator(String expression)

e quindi un solo metodo di segnatura

    public int eval()

  che, usando l'algoritmo descritto sopra e le classi sviluppate fin qui,
  restituisca il valore dell'espressione data.

### La classe di test

La classe `TestRunner` legge una sequenza di linee dal flusso di ingresso,
ciascuna delle quali contenente una espressione in notazione polacca inversa e
ne emette la valutazione.


Vincoli
-------

Il flusso di ingresso contiene espressioni valide e numeri rappresentabili col
tipo `int` (e viene letto fino all'EOF).


Esempio
-------

Eseguendo `soluzione` e avendo nel flusso di ingresso

    3 1 +
    2 1 -
    4 2 *
    4 2 /
    2 4 /
    1 2 3 4 + + *
    1 2 3 4 + * +
    1 2 3 4 * + +

il programma emette

    4
    1
    8
    2
    0
    9
    15
    15

nel flusso di uscita.
