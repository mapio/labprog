Code di stringhe
================

Descrizione
-----------

Una *coda* (di stringhe) è una struttura dati in cui è possibile memorizzare un
insieme di stringhe secondo una politica d'accesso *First In First Out* (o
*FIFO*) nel senso che è possibile prelevare per prima dall'insieme la stringa
che vi è stata aggiunta per prima. Più precisamente, le *operazioni* consentite
sulla *coda* sono:

- `init N` che predispone la *coda* in modo che possa contenere al massimo `N`
  stringhe,
- `enqueue S` che aggiunge la stringa `S` (come ultima) nella *coda* (o segnala un
  errore nel caso in cui la *coda* contenga già `N` stringhe),
- `dequeue` che preleva dalla *coda* la prima stringa aggiunta e la restituisce (o
  segnala un errore nel caso in cui la *coda* sia vuota),
- `empty` che restituisce `true` o `false` a seconda che la *coda* sia vuota o
  meno.
- `full` che restituisce `true` o `false` a seconda che la *coda* sia piena (ossia
  contenga `N` stringhe) o meno.

Ad esempio, a fronte di questa sequenza di operazioni (su una singola *coda*)

    init 3
    empty
    enqueue mamma
    enqueue ciao
    enqueue metti
    full
    enqueue troppo
    dequeue
    empty
    dequeue
    dequeue
    dequeue

andrebbe emesso

    true
    true
    !full
    "mamma"
    false
    "ciao"
    "metti"
    !empty

in quanto la *coda* è inizialmente vuota, dopo le prime tre aggiunte è
piena, per cui la successiva aggiunta produce un errore (`!full`); per prima
verrà tolta la stringa `mamma`, il che non svuota la *coda* e quindi verranno
tolte in ordine le stringhe `ciao` e `metti` (in ordine uguale a quello con
cui sono state aggiunte), e quindi il terzo prelievo, essendo vuota la
*coda* produrrà un errore (`!empty`).

Scrivete un programma che, implementata una *coda* di stringhe, ne istanzi
diverse per poter gestire una sequenza di operazioni sulle medesime.

Più precisamente, il programma riceve un intero positivo `M` come parametro
sulla linea di comando che corrisponde al numero di code da istanziare, quindi
nel flusso di ingresso riceve una sequenza di operazioni (come le suddette),
ciascuna preceduta dal numero di *coda* (compreso tra `1` e `M`) su cui deve
essere effettuata. Il programma emette sul flusso d'uscita il risultato delle
operazioni (senza premettere il numero di *coda*). Si vedano gli esempi per
maggiori dettagli.


Vincoli
-------

Il flusso di ingresso contiene una operazione per linea, prima dell'operazione è
presente il numero di *coda* seguito da uno spazio, quindi tra l'operazione e
l'eventuale argomento è presente uno e un solo spazio e l'argomento non contiene
spazi (ossia è un intero positivo nel caso del comando `init`, o una stringa
senza spazi nel caso del comando `enqueue`); l'operazione `init` compare sempre
e solo per prima per ciascun numero di *coda*.

Nel flusso di uscita deve essere presente una linea per ciascuna operazione che
emette una stringa o un errore; le stringhe vanno emesse tra virgolette `"`, gli
errori devono essere emessi come `!empty` e `!full`, rispettivamente per la *coda*
vuota e piena, i valori booleani devono essere emessi come `true` e `false`
(senza virgolette o punti esclamativi).

L'implementazione non può basarsi su nessuna classe delle API di Java che
implementi l'interfaccia `java.util.Queue` — pena l'annullamento dell'esercizio.


Esempio
-------

Eseguendo `soluzione 1` e avendo nel flusso di ingresso

    1 init 3
    1 empty
    1 enqueue mamma
    1 enqueue ciao
    1 enqueue metti
    1 full
    1 enqueue troppo
    1 dequeue
    1 empty
    1 dequeue
    1 dequeue
    1 dequeue

il programma emette

    true
    true
    !full
    "mamma"
    false
    "ciao"
    "metti"
    !empty

nel flusso d'uscita. Nel caso di più code, eseguendo `soluzione 3` e avendo nel
flusso di ingresso

    1 init 5
    1 enqueue uno
    1 enqueue due
    2 init 3
    2 enqueue tre
    2 enqueue quattro
    3 init 1
    3 empty
    1 enqueue cinque
    2 full
    1 dequeue
    1 full
    1 dequeue
    3 dequeue
    3 dequeue
    2 empty
    1 dequeue

il programma emette

    true
    false
    "uno"
    false
    "due"
    !empty
    !empty
    false
    "cinque"

nel flusso d'uscita.

Suggerimenti
------------

Potrebbe essere comodo raccogliere gli *attributi* necessari per la
rappresentazione della *coda* assieme alle *operazioni* in una apposita classe.
Può essere comodo usare una `java.util.ArrayList` come punto di partenza per
l'implementazione della *coda*.
