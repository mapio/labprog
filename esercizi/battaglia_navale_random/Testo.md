Battaglia navale, Randomizzazione
=================================

Descrizione
-----------

Questo è l'ultimo esercizio di una serie il cui obiettivo è sviluppare un
insieme di *classi* che rappresentino lo svolgimento di una partita a *battaglia
navale*. Prima di iniziare, recuperate i sorgenti delle classi `Posizione`,
`Nave`, `Griglia` e `Arbitro` (ma non `Giocatore`) degli esercizi precedenti e
copiateli in questa directory.

Come accennato durante l'implementazione della classe `Giocatore`, la parte
veramente difficile è quella di pensare una *strategia* con cui scegliere la
prossima mossa (e collocare le proprie navi). Nell'implementazione precedente,
avevamo assunto che un "oracolo" potesse comunicare al giocatore tutte le sue
mosse (e la posizione delle navi) in anticipo, ma questo è ovviamente
irrealistico. Scopo di questo ultimo esercizio è provare diverse implementazioni
del giocatore con delle strategie di gioco più realistiche.

Per farlo, potete usare la classe `java.util.Random` delle API di Java, in
particolare i metodi:

* `nextBoolean()`, utile per le scelte binarie,
* `nextInt(int bound)`, utile per generare un numero a caso nell'intervallo `[0, bound)`,
* `nextDouble()` e `nextGaussian()` nel caso vi serva simulare distribuzioni più sofisticate;

ad esempio, se `p` è una variable di tipo `double` compresa in `(0, 1]`,
l'esecuzione del segmento di codice

    boolean coin = Random.nextDouble() < p;

è tale per cui `coin` varrà `true` con probabilità `p`. Se (per scopi di
*debugging*) volete rendere *riproducibile* l'esecuzione del vostro codice, sarà
sufficiente usare il costruttore `Random(long seed)` passando lo stesso `seed`
ad ogni esecuzione.


### Posizionamento delle navi

Usualmente i giocatori si accordano prima della partita sul numero e sulla
lunghezza delle navi da sistemare sulla griglia, per questa ragione dovrete
implementare un costruttore per il `Giocatore` che abbia segnatura

    public Giocatore(int[] lunghezze)

dove `lunghezze` è un array di interi positivi (eventualmente ripetuti) che
definiranno le navi in gioco.

Il primo compito è quindi implementare il metodo con segnatura `public Nave[]
navi() ` della classe `Giocatore` in modo che l'array di navi restituito sia
conforme al parametro di costruzione `lunghezze` e rispetti alcuni criteri di
base:

* le navi non devono sovrapporsi,
* tra una nave e l'altra deve essere presente sempre almeno uno spazio,
* tra una nave e il bordo deve essere presente sempre almeno uno spazio.

Il primo criterio è *necessario*, mentre potete decidere di implementare a
scelta gli altri due criteri. Osservate che un maggior numero di vincoli in
questa fase può rendere il codice di generazione più complesso, ma potrebbe
rendere il codice della prossima mossa molto più semplice.


### La prossima mossa

È nell'implementazione del metodo di segnatura `public Posizione mossa()` della
classe `Giocatore` che potrete dare sfogo alla vostra fantasia.

Osservate che ci sono innanzitutto due possibili approcci molto diversi a
seconda che si voglia tener conto, o meno, dell'*esito* della precedente mossa.

Evidentemente la cosa più semplice è ignorare il passato, per così dire, e
giocare ogni mossa come se fosse la prima. Alcune possibili strategie potrebbero
essere, in questo caso:

* scegliere tutte le possibili posizioni in sequenza (ad esempio, dalla
 posizione in altro a sinistra, fino a quella in basso a destra),

* scegliere le posizioni completamente a caso,

* scegliere le posizioni a caso, ma solo tra quelle non ancora usate come mosse.

Queste strategie sono banali da implementare, ma come ogni giocatore del gioco
sa bene, una volta che si è colpita una nave, è buona norma cercare di
affondarla, prima di passare a cercare altri bersagli.

Per fare questo, è necessario tenere in considerazione l'esito della mossa
precedente; qualora l'esito sia `C` (ossia la posizione della mossa precedente
apparteneva ad una nave), si può iniziare una *caccia* alle altre posizioni in
cui si trova in quella nave al fine di usarle come le successive mosse.

Per svolgere la caccia ci sono molte possibili implementazioni, potete:

* dapprima determinare l'orientamento della nave (con una mossa esplorativa), quindi
* inseguire la fine della nave (con una serie di mosse nella stessa direzione)
  fino al bordo, o alla prima mossa il cui esito sia `A` (affondata) o `M`
  (ossia abbiate colpito l'acqua)
* se avete raggiunto il bordo, o colpito l'acqua, dovete cercare nella
  direzione opposta;

osservate che se le navi possono essere collocate l'una a fianco dell'altra,
questa strategia potrebbe non essere efficace (pensate a due navi disposte a
`T`), viceversa se le navi non possono essere poste sul bordo, potete evitare
di curarvi dei bordi nella caccia (in quanto finirete sempre prima in acqua che
sul bordo).


### La classe di test

La classe `TestRunner` (fornita assieme a questo testo e che **non deve essere
modificata**), costruisce i giocatori a partire da un elenco lunghezze
specificate come argomenti sulla linea di comando e quindi procede a giocare
una partita fino al suo termine, stampando l'arbitro ad ogni passo.

Dal momento che l'implementazione dei metodi della classe `Giocatore` può
essere molto complessa, potete scrivere un metodo `main` nella classe
`Giocatore`, o aggiungere altre classi simili a `TestRunner` che (contenendo un
`main` a loro volta) potrete invocare per esercitare le vostre implementazioni
e verificarne il comportamento.


Esempio
-------

Non è possibile dare un esempio di esecuzione in quanto vi è data massima
libertà nell'implementazione delle strategie di gioco.
