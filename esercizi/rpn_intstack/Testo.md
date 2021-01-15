Calcolatrice RPN, IntStack
==========================

Descrizione
-----------

Questo è il terzo esercizio di una serie il cui obiettivo è sviluppare un
insieme di *classi* che rappresentino il comportamento di una calcolatrice che
valuti *espressioni aritmetiche* in *notazione polacca inversa*.

Abbiamo ora bisogno di un "contenitore" per memorizzare i risultati intermedi
della valutazione dell'espressione. Per una ragione che vi sarà chiara nel
prossimo esercizio, è comodo che tale contenitore si comporti come una *pila*,
ossia di una struttura dati in cui è possibile memorizzare un insieme di oggetti
secondo una politica d'accesso *last in first out* (o *LIFO*) nel senso che è
possibile prelevare per prima dall'insieme l'oggetto che vi è stata aggiunto per
ultimo.

Realizzate una classe `IntStack` (che vuol dire pila, in inglese), in grado di
memorizzare degli `int` e che abbia:

* un metodo di segnatura

      public void push(int value)

  che memorizzi sulla cima della pila il valore specificato;

* un metodo di segnatura

      public int pop()

  che restituisca il valore prelevato dalla cima della pila;

* un metodo di segnatura

      public boolean isEmpty()

  che restituisca `true` se e solo se la pila è vuota, ossia non contiene
  valori.

Cercando nelle API di Java potreste trovare una classe di nome `Stack` molto
simile a questa, è però un buon esercizio che la implementiate voi (senza usare
la classe  delle API).

### La classe di test

La classe `TestRunner` legge una sequenza di interi dal flusso di ingresso, la
memorizza nella pila e quindi la emette prelevandola dalla pila; l'effetto netto è
ovviamente quello di invertire l'ordine della sequenza.


Vincoli
-------

Il flusso di ingresso contiene numeri rappresentabili col tipo `int` (e viene
letto fino all'EOF).

Esempio
-------

Eseguendo `soluzione` e avendo nel flusso di ingresso

    3 2 1 9 7 8 6 10 4 5

il programma emette

    5
    4
    10
    6
    8
    7
    9
    1
    2
    3

nel flusso di uscita — come è ovvio, data la politica LIFO, il primo numero letto
sarà l'ultimo emesso (così come il secondo letto sarà il penultimo emesso e via
discorrendo).
