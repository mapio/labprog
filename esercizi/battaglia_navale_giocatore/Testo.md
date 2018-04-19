Battaglia navale, Giocatore
===========================

Descrizione
-----------

Questo è il quarto esercizio di una serie il cui obiettivo è sviluppare un
insieme di *classi* che rappresentino lo svolgimento di una partita a *battaglia
navale*. Prima di iniziare, recuperate i sorgenti delle classi `Posizione`,
`Nave` e `Griglia` degli esercizi precedenti e copiateli in questa directory.

Scopo di questo esercizio è implementare la classe `Giocatore` che rappresenti
uno dei due giocatori della partita.

Per garantire il rispetto delle regole, supporremo che i giocatori non
interagiscano direttamente tra loro, ma lo facciano attraverso un *arbitro* (che
sarà implementato nel prossimo esercizio di questa serie). All'inizio della
partita, l'arbitro chiederà a ciascun giocatore di comunicare la
*configurazione* delle sue navi (che ovviamente non rivelerà all'avversario),
quindi chiederà a turno a ciascuno dei giocatori che *mossa* intende fare
(ossia, che posizione vuole provare a colpire), determinerà l'*esito* della
mossa (sulla scorta della sua conoscenza della posizione delle navi) e lo
comunicherà al giocatore, affinché possa usare tale informazione per determinare
le sue prossime mosse.

Per prestarsi a tale tipo di comportamento, è sufficiente che la classe
`Giocatore` implementi:

* il metodo con segnatura

      public Nave[] navi()

  che restituisce l'elenco delle navi così come il giocatore ha deciso di
  posizionarle;

* il metodo con segnatura

      public Posizione mossa()

  invocato dall'arbitro per chiedere al giocatore la sua prossima mossa;
  qualora il giocatore abbia esaurito le sue mosse, o non intenda più giocare,
  il metodo restituisce il valore `null` per indicare tale condizione;

* il metodo con segnatura

      public void esito(char e)

  invocato dall'arbitro per informare il giocatore dell'esito della sua ultima
  mossa. Assumeremo che l'esito valga: `M`, `C` e `A` ad indicare
  rispettivamente un colpo *mancato*, *colpito* e *colpito e affondato*.

Decidere la mossa da giocare può richiedere una strategia molto complessa; per
questa ragione in questa fase assumeremo che una sorta di entità "onnisciente"
comunichi al giocatore (al momento della *costruzione* della relativa istanza)
sia la configurazione delle navi che tutte le mosse, intendiamo cioè dire che
deve essere implementato un costruttore con segnatura

    public Giocatore(final Nave[] configurazione, final Posizione[] mosse)

dove `configurazione` sarà esattamente il valore che restituirà il metodo
`navi`, mentre `mosse` è un elenco di mosse da cui il metodo `mossa` restituirà
a ogni invocazione la prima mossa non ancora restituita.

Infine, la classe deve *sovrascrivere* il metodo `toString` in modo tale che la
stringa che rappresenta una giocatore sia data da una matrice `10` x `10` di
caratteri scelti tra `.`, `M`, `C`  e `A` corrispondenti rispettivamente ad una
posizione per cui non è ancora stato comunicato un esito, oppure ad uno degli
esiti comunicati.


### La classe di test

La classe `TestRunner` (fornita assieme a questo testo e che **non deve essere
modificata**), costruisce il giocatore a partire da un elenco di navi e mosse
specificato nel flusso di ingresso e quindi procede a invocare i metodi `mossa`
e `esito`, stampando (la stringa corrispondente a) il giocatore ad ogni iterato.
Si osservi che l'esito comunicato dalla classe di test al giocatore non ha
alcuna relazione con le navi lette (che, in ogni caso, sarebbero le navi del
giocatore e non dell'avversario), ma solo con le mosse del giocatore.

Vincoli
-------

L'ordine in cui i metodi sono invocati è:

* `navi` (una sola volta, dopo la creazione dell'oggetto), quindi
* `mossa` e, qualora essa sia diversa da `null`, `esito`;

l'ultima coppia di metodi può essere eseguita (in ordine) più volte, ma non
appena `mossa` restituisce `null`, nessun altro metodo sarà invocato.


Esempio
-------

Eseguendo `soluzione` e avendo

    C3:1:V,B4:2:O,E1:2:V
    A1,E8,H3

nel flusso di ingresso, il programma emette

    M.........
    ..........
    ..........
    ..........
    ..........
    ..........
    ..........
    ..........
    ..........
    ..........

    M.........
    ..........
    ..........
    ..........
    ..........
    ..........
    ..........
    ....C.....
    ..........
    ..........

    M.........
    ..........
    .......A..
    ..........
    ..........
    ..........
    ..........
    ....C.....
    ..........
    ..........

la classe `TestRunner` interpreta infatti la prima riga come un elenco di navi
(separati da `,`), la seconda come un elenco di mosse (separate da `,`); gli
esiti sono scelti in sequenza tra gli esiti possibili.

Osservazioni
------------

Risulta cruciale osservare che il metodo `esito` non contiene alcuna posizione
in quanto il suo argomento è inteso come l'esito dell'ultima mossa, ossia
relativo alla posizione restituita dalla precedente invocazione del metodo
`mossa`.
