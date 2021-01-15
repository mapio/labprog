Battaglia navale, Nave
======================

Descrizione
-----------

Questo è il secondo esercizio di una serie il cui obiettivo è sviluppare un
insieme di *classi* che rappresentino lo svolgimento di una partita a *battaglia
navale*. Prima di iniziare, recuperate il sorgente della classe `Posizione`
dell'esercizio precedente e copiatelo in questa directory.

Scopo di questo esercizio è implementare la classe `Nave` che rappresenti una
delle navi coinvolte nel gioco; una *nave* è descritta da una `Posizione` che ne
specifica l'*inizio* (ossia la posizione più in alto e a sinistra che essa
occupa nella griglia di gioco), da una *lunghezza* e da suo *orientamento* che
può essere *orizzontale* o *verticale*.

Dapprima implementate un costruttore dalla segnatura

    public Nave(Posizione inizio, int lunghezza, boolean orizzontale)

i cui parametri hanno l'ovvio significato (evidentemente, se il parametro
`orizzontale` è `false` significa che la nave è orientata in *verticale*).
Implementate poi un metodo statico

    public static Nave parseNave(String nave)

che costruisce una nave data una stringa che ne contenga l'inizio, la lunghezza
e l'orientamento (specificato da una lettera maiuscola pari a `O` per
*orizzontale* e `V` per verticale) separati da `:`; ad esempio, eseguendo

    Nave n = Nave.parseNave("C1:6:V")

si costruisce la nave `n` che inizia in posizione `(0, 2)`, è lunga `6` ed è
orientata in verticale. Si assuma che la stringa passata come argomento
corrisponda sempre a una nave "valida" (che possa cioè essere contenuta
effettivamente sul campo di gioco).

La classe deve inoltre implementare:

* il metodo con segnatura

      public boolean occupa(Posizione posizione)

   che restituisca `true` se e solo se la nave occupa la `posizione` specificata;

* il metodo con segnatura

      public void colpisci(Posizione posizione)

  che, data una `posizione` occupata dalla nave, la segna come *colpita*;

* il metodo con segnatura

       boolean colpita(Posizione posizione)

  che, data una posizione occupata dalla nave, restituisce `true` se e solo se
  la nave è stata in essa colpita;

* il metodo con segnatura

      public boolean affondata()

  che restituisce `true` se e solo se la nave è stata affondata;

* il metodo con segnatura

      public boolean interseca(Nave altra)

  che restituisce `true` se e solo se la nave occupa una o più delle posizioni
  occupate dall'`altra` nave.

Infine, la classe deve *sovrascrivere* il metodo `toString` in modo tale che la
stringa che rappresenta una nave sia data dalla stringa che rappresenta il suo
inizio seguita da una "barretta" di tanti caratteri `#` quant'è la sua
lunghezza, disposti in orizzontale, o verticale, a seconda del suo orientamento.
Ad esempio, eseguendo

	Nave n0 = new Nave(new Posizione(0,0), 2, true);
	Nave n1 = Nave.parseNave("B2:3:V");
	System.out.println(n0);
	System.out.println(n1);

viene emesso

    (0, 0)
    ##
    (1, 1)
    #
    #
    #

nel flusso di uscita.

### La classe di test

La classe `TestRunner`, oltre al precedente segmento di codice, procede nella
lettura di una serie di navi (specificate come stringhe secondo il formato
descritto in precedenza) dal flusso di ingresso e ne emette la rappresentazione
testuale nel flusso di uscita; provando quindi tutte le possibili posizioni ne
determina l'orientamento, la lunghezza e li confronta con quelli in ingresso. Se
l'implementazione della classe `Nave` risulta scorretta, tale test dovrebbe
emettere dei messaggi d'errore probabilmente utili a determinare gli eventuali
problemi.


Vincoli
-------

I metodi `colpisci` e `colpita` assumono che la posizione passata come
argomento sia una di quelle occupate dalla nave; il metodo `parseNave` assume
che l'argomento passato corrisponda ad una nave "valida".


Esempio
-------

Eseguendo  `soluzione` e avendo

    C3:1:V
    B4:2:O

il programma emette

    (0, 0)
    ##
    (1, 1)
    #
    #
    #
    (2, 2)
    #
    (3, 1)
    ##

nel flusso di uscita.
