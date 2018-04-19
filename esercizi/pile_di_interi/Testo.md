Pile di interi
==============

Descrizione
-----------

Una *pila* (di numeri interi) è una struttura dati in cui è possibile
memorizzare un insieme di numeri secondo una politica d'accesso *Last In First
Out* (o *LIFO*) nel senso che è possibile prelevare per prima dall'insieme il
numero che vi è stata aggiunto per ultima. Più precisamente, le *operazioni*
consentite sulla *pila* sono:

- `init N` che predispone la *pila* in modo che possa contenere al massimo `N`
  numeri,
- `push M` che aggiunge il numero `M` (come ultimo) sulla *pila* (o segnala un
  errore nel caso in cui la *pila* contenga già `N` numeri),
- `pop` che preleva dalla *pila* l'ultimo numero aggiunto e lo restituisce (o
  segnala un errore nel caso in cui la *pila* sia vuota),
- `top` che restituisce l'ultimo numero aggiunto alla *pila* senza toglierlo
  dalla *pila* (o segnala un errore nel caso in cui la *pila* sia vuota),
- `empty` che restituisce `true` o `false` a seconda che la *pila* sia vuota o
  meno.
- `full` che restituisce `true` o `false` a seconda che la *pila* sia piena (ossia
  contenga `N` numeri) o meno.

Ad esempio, a fronte di questa sequenza di operazioni (su una singola *pila*)

    init 3
    empty
    push 7
    push 32
    top
    push 5
    full
    push 99
    pop
    empty
    pop
    pop
    pop

andrebbe emesso

    true
    32
    true
    !full
    5
    false
    32
    7
    !empty

in quanto la *pila* è inizialmente vuota, dopo le prime due aggiunte l'ultimo
numero è `32`, quindi la teza aggiunta riempie la *pila*, per cui la successiva
aggiunta produce un errore; per prima verrà tolta l'ultimo numero `5`, il che
non svuota la *pila* e quindi verranno tolte in ordine i numeri `32` e `7` (in
ordine inverso a quello con cui sono stati aggiunti), e quindi il terzo prelievo
produrrà un errore.

Scrivete un programma che, implementata una *pila* di numeri interi, ne istanzi
diverse per poter gestire una sequenza di operazioni sulle medesime.

Più precisamente, il programma riceve un intero positivo `M` come parametro
sulla linea di comando che corrisponde al numero di pile da istanziare, quindi
nel flusso di ingresso riceve una sequenza di operazioni (come le suddette),
ciascuna preceduta dal numero di *pila* (compreso tra `1` e `M`) su cui deve
essere effettuata. Il programma emette sul flusso d'uscita il risultato delle
operazioni (senza premettere il numero di *pila*). Si vedano gli esempi per
maggiori dettagli.


Vincoli
-------

Il flusso di ingresso contiene una operazione per linea, prima dell'operazione è
presente il numero di *pila* seguito da uno spazio, quindi tra l'operazione e
l'eventuale argomento è presente uno e un solo spazio (ossia è un intero
positivo nel caso del comando `init`, o un intero nel caso del comando `push`);
l'operazione `init` compare sempre e solo per prima per ciascun numero di
*pila*.

Nel flusso di uscita deve essere presente una linea per ciascuna operazione che
emette un numero o un errore; gli errori devono essere emessi come `!empty` e
`!full` rispettivamente per la *pila* vuota e piena, i valori booleani devono
essere emessi come `true` e `false` (senza virgolette o punti esclamativi).


Esempio
-------

Eseguendo `soluzione 1` e avendo nel flusso di ingresso

    1 init 3
    1 empty
    1 push 7
    1 push 32
    1 top
    1 push 5
    1 full
    1 push 99
    1 pop
    1 empty
    1 pop
    1 pop
    1 pop

il programma emette

    true
    32
    true
    !full
    5
    false
    32
    7
    !empty

nel flusso d'uscita. Nel caso di più pile, eseguendo `soluzione 3` e avendo nel
flusso di ingresso

    1 init 5
    1 push 1
    1 push 2
    2 init 3
    2 push 3
    2 push 4
    3 init 1
    3 empty
    1 push 5
    2 full
    1 pop
    1 top
    1 pop
    3 pop
    3 pop
    2 empty
    1 pop

il programma emette

    true
    false
    5
    2
    2
    !empty
    !empty
    false
    1

nel flusso d'uscita.

Suggerimenti
------------

Potrebbe essere comodo raccogliere gli *attributi* necessari per la
rappresentazione della *pila* assieme alle *operazioni* in una apposita classe.
