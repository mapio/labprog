L'n-gramma più frequente
========================

Descrizione
-----------

Dato un numero intero `N` > 1 ed una sequenza di caratteri, i suoi `N`-grammi
sono tutte e sole le sottosequenze di `N` caratteri consecutivi che vi
compaiono. Ad esempio, i 2-grammi di `ciao*mamma` sono

    ci
    ia
    ao
    o*
    *m
    ma
    am
    mm
    ma

mentre i 3-grammi della stessa sequenza sono

    cia
    iao
    ao*
    o*m
    *ma
    mam
    amm
    mma

Come è facile notare, `ma` è il 2-gramma più frequente (perché compare due volte
nell'elenco dei 2-grammi, mentre tutti gli altri compaiono una sola volta),
mentre tutti i 3-grammi hanno la stessa frequenza.

Scrivete un programma che, dato un intero `N` > 1 come argomento sulla linea di
comando e una sequenza di almeno `N` caratteri terminata da *a-capo* nel flusso
di ingresso, stampi l'`N`-gramma più frequente (o, a parità di frequenza, quello
che si incontra per primo nella sequenza).


Vincoli
-------

La sequenza di caratteri è lunga al più 1024 caratteri (senza contare l'*a-capo*
finale, che comunque non va considerato); tutti i numeri coinvolti possono
essere rappresentati con variabili di tipo `int`.


Esempio
-------

Eseguendo `soluzione 1` e avendo `ciao*mamma` nel flusso di ingresso, il
programma emette `a` nel flusso di uscita (ci sono due 1-grammi, ossia lettere,
che occorrono 3 volte: `a` che compare per primo e `m`, tutti gli altri 1-grammi
compaiono meno di 3 volte).

Eseguendo `soluzione 5` e avendo `ammaliatamentemente` nel flusso di ingresso,
il programma emette `mente` nel flusso di uscita (esso è infatti l'unico
5-gramma che compare due volte nel testo).

In fine, eseguendo `soluzione 6` e avendo `ammaliatamentemente` nel flusso di
ingresso, il programma emette `ammali` nel flusso di uscita (dato che non ci
sono 6-grammi ripetuti, viene infatti emesso il primo tra essi, ossia l'inizio
del testo).
