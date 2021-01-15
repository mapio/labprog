Editor
======

Descrizione
-----------

Una delle funzioni più elementari provviste da un *editor* è la possibilità di
scrivere del testo e di cancellare (parte) di esso usando uno speciale tasto
"cancella".

Per descrivere in modo semplificato questa funzionalità assumiamo che i dati in
ingresso all'editor siano costituiti da una sequenza di lettere e spazi e che il
carattere di cancellazione sia `*`. A fronte della sequenza

    ki**ciao man*mma

l'editor emette come risultato finale

    ciao mamma

per farlo, ad ogni passo è come se emettesse i caratteri diversi da `*` e, per
ogni `*`, avesse cancellato l'ultimo carattere emesso (e non ancora cancellato);
tale comportamento può essere descritto, ad esempio, tramite la seguente
tabella

    ingresso     risultato
    ---------------------
    k            k
    i            ki
    *            k
    *
    c            c
    i            ci
    a            cia
    o            ciao
                 ciao
    m            ciao m
    a            ciao ma
    n            ciao man
    *            ciao ma
    m            ciao mam
    m            ciao mamm
    a            ciao mamma

dove nella colonna *ingresso* sono riportati (uno per riga/passo) i caratteri
della sequenza in ingresso e, nella colonna *risultato*, il risultato che
sarebbe prodotto man mano dall'editor ad ogni passo.

Osservate che se, ad un dato passo, il numero di cancellazioni eccede quello
di caratteri emessi, il risultato, a quel passo, resta semplicemente vuoto. Ad
esempio, a fronte della sequenza in ingresso

    ci*************mamma

il risultato è semplicemente

    mamma

Scrivete un programma che, data una linea (terminata da *a-capo*) contenente
lettere spazi e caratteri `*` nel flusso di ingresso, emetta nel flusso di
uscita il risultato finale prodotto dall'editor descritto qui sopra avendo tale
sequenza in ingresso.


Vincoli
-------

Potete assumere che la linea in ingresso sia costituita al più da 1024
caratteri.


Esempio
-------

Eseguendo `soluzione` e avendo `ki**ciao man*mma` nel flusso di ingresso, il
programma emette `ciao mamma` nel flusso di uscita.
