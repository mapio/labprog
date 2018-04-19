Pila
====

Descrizione
-----------

Una *pila* (di stringhe) è una struttura dati in cui è possibile memorizzare un
insieme di stringhe secondo una politica d'accesso *last in first out* (o
*LIFO*) nel senso che è possibile prelevare per prima dall'insieme la stringa
che vi è stata aggiunta per ultima. Più precisamente, le *operazioni*
consentite sulla *pila* sono:

- `init N` che predispone la *pila* in modo che possa contenere al massimo `N` stringhe,
- `push S` che aggiunge la stringa `S` (come ultima) sulla *pila*
  (o segnala un errore nel caso in cui la *pila* contenga già `N` stringhe),
- `pop` che preleva dalla *pila* l'ultima stringa aggiunta e la restituisce
  (o segnala un errore nel caso in cui la *pila* sia vuota),
- `top` che restituisce l'ultima stringa aggiunta alla *pila* senza toglierla dalla pila
  (o segnala un errore nel caso in cui la *pila* sia vuota),
- `empty` che restituisce `true` o `false` a seconda che la pila sia vuota o meno.
- `full` che restituisce `true` o `false` a seconda che la pila sia piena
  (ossia contenga `N` stringhe) o meno.

Scrivete un programma che implementi una *pila* e, data una sequenza di
operazioni sulla *pila* nel flusso di ingresso, emetta i valori restituiti e gli
eventuali errori, nel flusso di uscita.

Ad esempio, a fronte di questa sequenza di operazioni

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

il programma deve emettere

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


Vincoli
-------

Il flusso di ingresso contiene una operazione per linea, tra l'operazione e
l'eventuale argomento è presente uno e un solo spazio e l'argomento non
contiene spazi (ossia è un intero positivo nel caso del comando `init`, o una
stringa senza spazi nel caso del comando `push`); l'operazione `init` compare
sempre e solo sulla prima linea.

Nel flusso di uscita deve essere presente una linea per ciascuna operazione che
emette una stringa o un errore; le stringhe vanno emesse tra virgolette `"`, gli
errori devono essere emessi come `!empty` e `!full` rispettivamente per la pila
vuota e piena, i valori booleani devono essere emessi come `true` e `false`
(senza virgolette o punti esclamativi).


Esempio
-------

Eseguendo `soluzione` e avendo nel flusso di ingresso

    init 5
    push uno
    push due
    push tre
    push quattro
    empty
    push cinque
    full
    pop
    top
    pop
    pop
    pop
    empty
    pop

il programma emette

    false
    true
    "cinque"
    "quattro"
    "quattro"
    "tre"
    "due"
    false
    "uno"

nel flusso di uscita.


Suggerimenti
------------

Potrebbe essere comodo raccogliere gli *attributi* necessari per la
rappresentazione della pila assieme alle *operazioni* in una apposita classe.
