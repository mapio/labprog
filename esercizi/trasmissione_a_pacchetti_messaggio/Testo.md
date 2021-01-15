Trasmissione a pacchetti, Messaggio
===================================

Descrizione
-----------

Questo è il secondo esercizio di una serie il cui obiettivo è sviluppare un
insieme di *classi* che rappresentino il comportamento di un *ricevitore* di
*messaggi* costituiti da una successione di *pacchetti*. Prima di iniziare,
recuperate il sorgente della classe `Pacchetto` dell'esercizio precedente e
copiatelo in questa directory.

Scopo di questo esercizio è implementare la classe `Messaggio` che rappresenti
uno dei messaggi coinvolti nella trasmissione; ogni messaggio è descritto dal
suo *numero identificativo* e dalla collezione di pacchetti che gli sono stati
aggiunti.

Implementate il costruttore con segnatura

    public Messaggio(Pacchetto p)

che predisponga un messaggio che contiene `p` e cui potranno essere aggiunti
tutti i pacchetti con lo stesso numero identificativo di messaggio del pacchetto
`p`; il messaggio deve avere esporre un membro *public final* di nome `id` pari
al suo numero  identificativo.

Implementate quindi:

* il metodo con segnatura

       public int totale()

  che restituisce il numero totale di pacchetti che il messaggio comprende
  (ossia il valore del membro `totale` dei suoi pacchetti);

* il metodo con segnatura

      public void aggiungi(Pacchetto p)

  che aggiunge il pacchetto specificato al messaggio; si assuma che tale metodo
  venga invocato su pacchetti che hanno numero progressivo distinto e compreso
  tra `0` e il numero totale di pacchetti del messaggio (estremo escluso);

* il metodo con segnatura

      public Pacchetto pacchetto(int progressivo)

  che restituisce il pacchetto con il numero progressivo specificato, se
  aggiunto in precedenza al messaggio, oppure `null`;

* il metodo con segnatura

       public boolean completo()

   che restituisce `true` se e solo se il numero di pacchetti aggiunti al
   messaggio coincide con il numero totale di pacchetti.

Infine, la classe deve *sovrascrivere* il metodo `toString` in modo tale che la
stringa che rappresenta una messaggio sia data dal una sequenza di linee, una
per ogni pacchetto ricevuto (in ordine di numero progressivo), ciascuna
corrispondente alla rappresentazione stringa del pacchetto.


### La classe di test

La classe `TestRunner` legge una sequenza di linee dal flusso di ingresso,
ciascuna delle quali contenente un pacchetto di un *singolo messaggio* (ossia
con un solo numero identificativo) che aggiunge al messaggio. Ad ogni linea
letta, emette il valore restituito dal metodo `completo` seguito dal messaggio
come stringa.


Vincoli
-------

Tutti i pacchetti hanno lo stesso numero identificativo di messaggio e lo stesso
numero totale di pacchetti; il numero progressivo del pacchetto è sempre
compreso tra `0` e il numero totale di pacchetti del messaggio (estremo
escluso); le parti della quadrupla sono separate dal carattere `\t` che non
compare mai nel testo del pacchetto.


Esempio
-------

Eseguendo  `soluzione 6229 7` e avendo nel flusso di ingresso

    5181	6	2	e ho visto i raggi B balenare nel buio vicino alle porte di Tannhäuser.
    5181	6	3	E tutti quei momenti andranno perduti nel tempo,
    5181	6	1	navi da combattimento in fiamme al largo dei bastioni di Orione,
    5181	6	4	come lacrime nella pioggia.
    5181	6	0	Io ne ho viste cose che voi umani non potreste immaginarvi:
    5181	6	5	È tempo di morire.

il programma emette nel flusso di uscita

    false
    5181	6	2	e ho visto i raggi B balenare nel buio vicino alle porte di Tannhäuser.
    false
    5181	6	2	e ho visto i raggi B balenare nel buio vicino alle porte di Tannhäuser.
    5181	6	3	E tutti quei momenti andranno perduti nel tempo,
    false
    5181	6	1	navi da combattimento in fiamme al largo dei bastioni di Orione,
    5181	6	2	e ho visto i raggi B balenare nel buio vicino alle porte di Tannhäuser.
    5181	6	3	E tutti quei momenti andranno perduti nel tempo,
    false
    5181	6	1	navi da combattimento in fiamme al largo dei bastioni di Orione,
    5181	6	2	e ho visto i raggi B balenare nel buio vicino alle porte di Tannhäuser.
    5181	6	3	E tutti quei momenti andranno perduti nel tempo,
    5181	6	4	come lacrime nella pioggia.
    false
    5181	6	0	Io ne ho viste cose che voi umani non potreste immaginarvi:
    5181	6	1	navi da combattimento in fiamme al largo dei bastioni di Orione,
    5181	6	2	e ho visto i raggi B balenare nel buio vicino alle porte di Tannhäuser.
    5181	6	3	E tutti quei momenti andranno perduti nel tempo,
    5181	6	4	come lacrime nella pioggia.
    true
    5181	6	0	Io ne ho viste cose che voi umani non potreste immaginarvi:
    5181	6	1	navi da combattimento in fiamme al largo dei bastioni di Orione,
    5181	6	2	e ho visto i raggi B balenare nel buio vicino alle porte di Tannhäuser.
    5181	6	3	E tutti quei momenti andranno perduti nel tempo,
    5181	6	4	come lacrime nella pioggia.
    5181	6	5	È tempo di morire.
