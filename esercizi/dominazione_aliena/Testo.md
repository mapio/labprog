Dominazione aliena
==================

Descrizione
-----------

Una potenza aliena si appresta a dominare un pianeta rivale. Per farlo invia sul
pianeta un certo numero di robot di due tipi: *combattenti* e *costruttori*.
Ogni robot costruttore impiega `4` unità temporali per essere in grado di
iniziare a costruire nuovi robot, dopodiché in ogni unità temporale successiva
costruisce `14` nuovi robot di cui `5` combattenti e `9` costruttori. I robot
vengono inviati quando hanno già `2` unità di vita e ogni robot si autodistrugge
raggiunte le `50` unità temporali di vita.

La riga *i*-esima della seguente tabella riporta sulla *j*-esima colonna, il
numero di robot costruttori che hanno *j* unità temporali di vita dopo *i* unità
temporali dall'inizio dell'invasione, supponendo di partire da un solo robot
costruttore.

      |  0  1  2  3  4  5  6  7  8  9
    --+------------------------------
    0 |  0  0  1  0  0  0  0  0  0  0
    1 |  0  0  0  1  0  0  0  0  0  0
    2 |  0  0  0  0  1  0  0  0  0  0
    3 |  9  0  0  0  0  1  0  0  0  0
    4 |  9  9  0  0  0  0  1  0  0  0
    5 |  9  9  9  0  0  0  0  1  0  0
    6 |  9  9  9  9  0  0  0  0  1  0
    7 |  9  9  9  9  9  0  0  0  0  1
    8 | 90  9  9  9  9  9  0  0  0  0

La prima riga, che corrisponde all'inizio dell'invasione, infatti reca un `1` in
corrispondenza della terza colonna che conta i robot con `2` unità di tempo di
vita. Bisogna attendere fino alla quarta riga prima che nella prima colonna, che
conta i robot con `0` unità temporali di vita (ossia quelli appena generati),
compaiano i `9` robot costruiti dal primo robot costruttore che ha raggiunto
all'unità temporale precedente la sua capacità costruttiva. Sull'ultima riga, si
notano sulla prima colonna `99` robot pari alla somma di `9` generati dal primo
robot inviato e `81` generati complessivamente dai `9` di seconda generazione.
Osservate che se i robot vivessero solo `10` unità temporali, invece di `50`, il
primo robot arrivato sarebbe autodistrutto ed il numero di robot sul pianeta
sarebbe dato dalla somma degli elementi dell'ultima riga, pari a `135`.

Il pianeta rivale è *domìnato* se il numero complessivo di robot supera una
certa soglia, che dipende dalla potenza del rivale.

Scrivete un programma che, dati sulla linea di comando:

- il numero iniziale di robot *combattenti*,
- il numero iniziale di robot *costruttori*,
- la *soglia* necessaria alla dominazione,

emetta nel flusso di uscita il numero di unità temporali necessarie ad avere un
numero complessivo di robot in vita pari o superiore alla soglia.

Vincoli
-------

Tutti i numeri coinvolti nel programma possono essere gestiti con variabili di
tipo `long`, ma non necessariamente `int`. Gli argomenti sulla riga di comando
sono sempre tre e sono numeri interi positivi.

Esempio
-------

Eseguendo `soluzione 2 4 1000000000` il programma emette `32` nel flusso di
uscita; eseguendo `soluzione 2 4 15000000000` il programma emette `36` nel
flusso di uscita.


Suggerimenti
------------

Una soluzione molto facile si può
