Trasmissione a pacchetti, Ricevitore
====================================

Descrizione
-----------

Questo è il terzo esercizio di una serie il cui obiettivo è sviluppare un
insieme di *classi* che rappresentino il comportamento di un *ricevitore* di
*messaggi* costituiti da una successione di *pacchetti*. Prima di iniziare,
recuperate il sorgente delle classi `Pacchetto` e `Messaggio` degli esercizi
precedenti e copiateli in questa directory.

Scopo di questo esercizio è implementare la classe `Ricevitore` che gestisca la
ricezione e concatenazione dei pacchetti dei vari messaggi coinvolti nella
trasmissione; il ricevitore riceve man mano i pacchetti e conserva un *elenco
dei messaggi completi* che può restituire su richiesta. La classe non ha un
costruttore specifico; viceversa, implementate:

* il metodo con segnatura

      public void ricevi(Pacchetto p)

  che riceve il pacchetto `p` e lo aggiunge al messaggio cui appartiene,

* il metodo con segnatura

      public boolean haProssimoCompleto()

   che restituisce `true` se e solo se l'elenco dei pacchetti completi
   contiene almeno un messaggio,

* il metodo con segnatura

      public Messaggio prossimoCompleto()

  che restituisce il primo messaggio che è stato completato e non ancora
  richiesto.

Attenzione, è cruciale che la classe restituisca i messaggi tramite il metodo
`prossimoCompleto` nell'ordine in cui sono stati completati, non in ordine di
numero identificativo (o di primo pacchetto ricevuto).


### La classe di test

La classe `TestRunner` legge dal flusso di ingresso una sequenza di quadruple
corrispondenti ai vari parametri descritti nel primo esercizio, una per linea e
separate dal carattere `^`. Man mano che riceve tutti i pacchetti di un
messaggio, ne stampa la rappresentazione come stringa.

Vincoli
-------

I pacchetti possono avere numero identificativo di messaggio diverso, ma quelli
che hanno lo stesso numero identificativo hanno lo stesso numero totale di
pacchetti; il numero progressivo del pacchetto è sempre distinto e compreso tra
`0` e il numero totale di pacchetti del messaggio cui appartiene (estremo
escluso); le parti della quadrupla sono separate dal carattere `\t` che non
compare mai nel testo del pacchetto.


Esempio
-------

Eseguendo  `soluzione` e avendo nel flusso di ingresso

    6229	7	1	ma non quello di cui ha bisogno adesso.
    6229	7	6	Un Cavaliere Oscuro.
    5181	6	2	e ho visto i raggi B balenare nel buio vicino alle porte di Tannhäuser.
    6229	7	3	Perché lui può sopportarlo.
    5181	6	3	E tutti quei momenti andranno perduti nel tempo,
    5181	6	1	navi da combattimento in fiamme al largo dei bastioni di Orione,
    6229	7	2	E quindi gli daremo la caccia.
    5181	6	4	come lacrime nella pioggia.
    5181	6	0	Io ne ho viste cose che voi umani non potreste immaginarvi:
    6229	7	4	Perché lui non è un eroe.
    5181	6	5	È tempo di morire.
    6229	7	0	Perché Batman è l'eroe che Gotham merita,
    6229	7	5	È un guardiano silenzioso che vigila su Gotham.

il programma emette nel flusso di uscita

    5181	6	0	Io ne ho viste cose che voi umani non potreste immaginarvi:
    5181	6	1	navi da combattimento in fiamme al largo dei bastioni di Orione,
    5181	6	2	e ho visto i raggi B balenare nel buio vicino alle porte di Tannhäuser.
    5181	6	3	E tutti quei momenti andranno perduti nel tempo,
    5181	6	4	come lacrime nella pioggia.
    5181	6	5	È tempo di morire.
    6229	7	0	Perché Batman è l'eroe che Gotham merita,
    6229	7	1	ma non quello di cui ha bisogno adesso.
    6229	7	2	E quindi gli daremo la caccia.
    6229	7	3	Perché lui può sopportarlo.
    6229	7	4	Perché lui non è un eroe.
    6229	7	5	È un guardiano silenzioso che vigila su Gotham.
    6229	7	6	Un Cavaliere Oscuro.

Si osservi in particolare che sebbene il primo pacchetto ricevuto appartenga al
messaggio `6229` il primo messaggio emesso è il `5181` in quanto è il primo per
cui il ricevitore vede tutti i pacchetti (alla terzultima riga dell'input).
