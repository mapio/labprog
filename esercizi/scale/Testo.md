Scale ascendenti e discendenti
==============================

Descrizione
-----------

Una sequenza non vuota di note si dice *ascendente* se ogni nota della sequenza
è (strettamente) più acuta della precedente, similmente si dice *discendente*
se ogni nota della sequenza è (strettamente) meno acuta della precedente. Se,
viceversa, capita sia che ci siano note più acute, che meno acute, o uguali
alle precedenti, la sequenza non è né ascendente, né discendente.

Per semplicità consideriamo solo le sette note: `do`, `re`, `mi`, `fa`, `sol`,
`la`, `si` (senza alterazioni e tutte nella medesima ottava).

Scrivete un programma che, data una sequenza non vuota di note nel flusso di
ingresso, emetta nel flusso di uscita `-1`, `1`, o `0` a seconda che la sequenza
sia rispettivamente: una sequenza discendente, ascendente, o non sia nessuna
delle due cose (nel precedente senso).

Ad esempio, data nel flusso di ingresso una delle tre sequenze

    si sol mi re
    sol do la si
    do mi sol la

il programma deve, rispettivamente, emettere nel flusso di uscita

    -1
    0
    1


Vincoli
-------

Il flusso contiene una sequenza di stringhe scelte tra

    do re mi fa sol la si

una per riga; non ci sono vincoli sul numero massimo di note nella sequenza
(che termina per `EOF`).


Esempio
-------

Eseguendo `soluzione` e avendo

    si
    sol
    mi
    re

nel flusso di ingresso il programma emette `-1` nel flusso di uscita.
