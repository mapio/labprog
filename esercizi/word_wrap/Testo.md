Word wrap
=========

Descrizione
-----------

Una delle funzioni di base di tutti gli editor di testo e *word processor* è la
capacità di spezzare il testo su più righe, in modo che ciascuna riga non superi
una certa lunghezza data.

Scrivete un programma che, dato un numero positivo `N` come parametro sulla
linea di comando e una sequenza di parole (composte ciascuna da caratteri
dell'alfabeto minuscolo) nel flusso di ingresso, le emetta nel flusso di uscita
nello stesso ordine in cui compaiono nel flusso di ingresso, ma in modo che
ciascuna riga:

- contenga complessivamente al più `N` caratteri e sia composta due o più
  parole separate da un singolo spazio, oppure
- contenga una sola parola (di lunghezza pari o superiore a `N`),
- il numero complessivo di righe sia il minore possibile.

Supponendo che il flusso di ingresso contenga:

    trinciate una grossa         cipolla e tenetela
             per piu di mezz ora
    nell
    acqua fresca

    indi asciugatela e gettatela      in padella con olio   o lardo
    quando e        cotta mettetela
    da parte

Se il parametro sulla linea di comando è `40`, il flusso di uscita deve contenere

    trinciate una grossa cipolla e tenetela
    per piu di mezz ora nell acqua fresca
    indi asciugatela e gettatela in padella
    con olio o lardo quando e cotta
    mettetela da parte

mentre se è `6`, il flusso di uscita deve contenere

    trinciate
    una
    grossa
    cipolla
    e
    tenetela
    per
    piu di
    mezz
    ora
    nell
    acqua
    fresca
    indi
    asciugatela
    e
    gettatela
    in
    padella
    con
    olio o
    lardo
    quando
    e
    cotta
    mettetela
    da
    parte

osservate che, in questo caso, `per piu` non sono sulla stessa riga perché la
lunghezza complessiva (spazio compreso) sarebbe `7`, ma lo sono `piu di` e
`olio o`; osservate inoltre come le parole di `6` o più caratteri sono una per
riga.


Vincoli
-------

Il numero `N` è un intero positivo, non ci sono vincoli sul suo valore massimo,
o sul numero e lunghezza di parole in ingresso. Il flusso di ingresso contiene
solo lettere minuscole e *white-sapce*.

Esempio
-------

Eseguendo `soluzione 20` e avendo

    we flatter our men with our pain we
    bow before them we make ourselves
    dolls for their amusement

nel flusso di ingresso, il programma emette

    we flatter our men
    with our pain we bow
    before them we make
    ourselves dolls for
    their amusement

nel flusso di uscita.
