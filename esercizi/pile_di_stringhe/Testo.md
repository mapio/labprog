Pile di stringhe
================

Descrizione
-----------

Una *pila* (di stringhe) è una struttura dati in cui è possibile memorizzare un
insieme di stringhe secondo una politica d'accesso *Last In First Out* (o
*LIFO*) nel senso che è possibile prelevare per prima dall'insieme la stringa
che vi è stata aggiunta per ultima. Più precisamente, le *operazioni* consentite
sulla *pila* sono:

- `init N` che predispone la *pila* in modo che possa contenere al massimo `N`
  stringhe,
- `push S` che aggiunge la stringa `S` (come ultima) sulla *pila* (o segnala un
  errore nel caso in cui la *pila* contenga già `N` stringhe),
- `pop` che preleva dalla *pila* l'ultima stringa aggiunta e la restituisce (o
  segnala un errore nel caso in cui la *pila* sia vuota),
- `top` che restituisce l'ultima stringa aggiunta alla *pila* senza toglierla
  dalla pila (o segnala un errore nel caso in cui la *pila* sia vuota),
- `empty` che restituisce `true` o `false` a seconda che la pila sia vuota o
  meno.
- `full` che restituisce `true` o `false` a seconda che la pila sia piena (ossia
  contenga `N` stringhe) o meno.

Ad esempio, a fronte di questa sequenza di operazioni (su una singola pila)

    init 3
    empty
    push mamma
    push ciao
    top
    push metti
    full
    push troppo
    pop
    empty
    pop
    pop
    pop

andrebbe emesso

    true
    "ciao"
    true
    !full
    "metti"
    false
    "ciao"
    "mamma"
    !empty

in quanto la *pila* è inizialmente vuota, dopo le prime due aggiunte l'ultima
stringa è `ciao`, quindi la teza aggiunta riempie la *pila*, per cui la
successiva aggiunta produce un errore; per prima verrà tolta l'ultima stringa
`metti`, il che non svuota la *pila* e quindi verranno tolte in ordine le
stringhe `ciao` e `mamma` (in ordine inverso a quello con cui sono state
aggiunte), e quindi il terzo prelievo produrrà un errore.

Scrivete un programma che, implementata una *pila* di stringhe, ne istanzi
diverse per poter gestire una sequenza di operazioni sulle medesime.

Più precisamente, il programma riceve un intero positivo `M` come parametro
sulla linea di comando che corrisponde al numero di pile da istanziare, quindi
nel flusso di ingresso riceve una sequenza di operazioni (come le suddette),
ciascuna preceduta dal numero di pila (compreso tra `1` e `M`) su cui deve
essere effettuata. Il programma emette nel flusso di uscita il risultato delle
operazioni (senza premettere il numero di pila). Si vedano gli esempi per
maggiori dettagli.


Vincoli
-------

Il flusso di ingresso contiene una operazione per linea, prima dell'operazione è
presente il numero di pila seguito da uno spazio, quindi tra l'operazione e
l'eventuale argomento è presente uno e un solo spazio e l'argomento non contiene
spazi (ossia è un intero positivo nel caso del comando `init`, o una stringa
senza spazi nel caso del comando `push`); l'operazione `init` compare sempre e
solo per prima per ciascun numero di pila.

Nel flusso di uscita deve essere presente una linea per ciascuna operazione che
emette una stringa o un errore; le stringhe vanno emesse tra virgolette `"`, gli
errori devono essere emessi come `!empty` e `!full` rispettivamente per la pila
vuota e piena, i valori booleani devono essere emessi come `true` e `false`
(senza virgolette o punti esclamativi).


Esempio
-------

Eseguendo `soluzione 1` e avendo nel flusso di ingresso

    1 init 3
    1 empty
    1 push mamma
    1 push ciao
    1 top
    1 push metti
    1 full
    1 push troppo
    1 pop
    1 empty
    1 pop
    1 pop
    1 pop

il programma emette

    true
    "ciao"
    true
    !full
    "metti"
    false
    "ciao"
    "mamma"
    !empty

nel flusso di uscita. Nel caso di più pile, eseguendo `soluzione 3` e avendo nel
flusso di ingresso

    1 init 5
    1 push uno
    1 push due
    2 init 3
    2 push tre
    2 push quattro
    3 init 1
    3 empty
    1 push cinque
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
    "cinque"
    "due"
    "due"
    !empty
    !empty
    false
    "uno"

nel flusso di uscita.

Suggerimenti
------------

Potrebbe essere comodo raccogliere gli *attributi* necessari per la
rappresentazione della pila assieme alle *operazioni* in una apposita classe.
