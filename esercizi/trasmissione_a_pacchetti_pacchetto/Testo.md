Trasmissione a pacchetti, Pacchetto
===================================

Descrizione
-----------

Questo è il primo esercizio di una serie il cui obiettivo è sviluppare un
insieme di *classi* che rappresentino il comportamento di un *ricevitore* di
*messaggi* costituiti da una successione di *pacchetti*.

L'input del ricevitore è una sequenza di quadruple, ciascuna composta dal:

* *numero identificativo* del messaggio,
* *numero totale* di pacchetti del messaggio,
* *numero progressivo* del pacchetto all'interno del messaggio,
* *testo* del pacchetto.

Compito del ricevitore è ricostruire ed emettere il testo di ogni messaggio
riunendo in modo ordinato (in base al numero progressivo di ciascun pacchetto)
il testo dei pacchetti che lo compongono. Se ad esempio l'input fosse:

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

il ricevitore dovrebbe emettere

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

Scopo di questo primo esercizio è realizzare la classe `Pacchetto` che deve
avere un costruttore con segnatura

    public Pacchetto(int id, int totale, int progressivo, String testo)

in cui i parametri hanno l'ovvio significato; il pacchetto deve esporre tali
valori come membri *public final*. Definite inoltre un metodo con segnatura

    public static Pacchetto parsePacchetto(String pacchetto)

che restituisca un pacchetto data una sua rappresentazione come stringa (ossia
una quadrupla con i valori separati da `\t`).

Infine, sovrascrivete il metodo `toString` in modo che restituisca una stringa
composta concatenando il numero progressivo del pacchetto e il suo testo,
separati dal segno di tabulazione `\t`.


### La classe di test

La classe `TestRunner` legge una sequenza di linee dal flusso di ingresso,
ciascuna delle quali contenente un pacchetto (con le parti della quadrupla
separate dal carattere `\t`), crea i relativi messaggi e man mano li emette nel
flusso di uscita.


Vincoli
-------

I numeri che caratterizzano un pacchetto sono rappresentabili mediante il tipo
`int`; la classe `Pacchetto` non deve fare alcuna altra assunzione sul valore
massimo, o minimo, che tale valori possono assumere. Il testo del pacchetto
*non* contiene mai il carattere `\t`.

Esempio
-------

Eseguendo `soluzione` e avendo nel flusso di ingresso

    6229	7	1	ma non quello di cui ha bisogno adesso.
    6229	7	6	Un Cavaliere Oscuro.
    5181	6	2	e ho visto i raggi B balenare nel buio vicino alle porte di Tannhäuser.
    6229	7	3	Perché lui può sopportarlo.
    5181	6	3	E tutti quei momenti andranno perduti nel tempo,

il programma emette lo stesso contenuto nel flusso di uscita.
