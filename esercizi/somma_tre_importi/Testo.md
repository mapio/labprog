Somma tre importi
=================

Descrizione
-----------

Scrivete un programma che, dati tre importi in una data valuta, emetta nel
flusso di uscita la loro somma. Ad esempio, se nel flusso di ingresso sono
presenti gli importi

    0.125 0.50 0.75

il programma emette nel flusso di uscita

    1.375

Osservate che il programma deve funzionare correttamente su input

    0.1 0.2 -0.3

ossia deve restituire `0`.


Vincoli
-------

Poiché la valuta non è specificata, non si può assumere che non ci siano importi
minori al centesimo, detto altrimenti, i numeri in ingresso potrebbero avere un
numero arbitrario di cifre dopo la virgola.


Esempio
-------

Eseguendo

    soluzione

e avendo nel flusso di ingresso

    1.25 2.25 3.5

il programma emette nel flusso di uscita

    7.0

Attenzione: il programma deve funzionare anche quando la somma degli importi è
negativa. Eseguendo

    soluzione

e avendo nel flusso di ingresso

    1.25 0.25 -3.75

il programma deve emettere nel flusso di uscita

    -2.25


Suggerimenti
------------

Non conoscendo la frazione più piccola da trattare, non è possibile (o è molto
laborioso) memorizzare gli importi in variabili di tipo `int`.

Le API di Java mettono a disposizione la classe `BigDecimal` che, viceversa,
permette di rappresentare un numero decimale con precisione arbitraria. Si può
ottenere un oggetto di tale classe a partire da una stringa `s` usando il
costruttore `new BigDecimal(s)` — oppure a partire da un numero in doppia
precisione `d` con il metodo statico `BigDecimal.valueOf(d)`.

Potete leggere una sequenza di stringhe dal flusso di ingresso invocando
ripetutamente il metodo `next()` della classe `Scanner` che funziona quale che
sia il *white-space* che separa una stringa dall'altra (ossia funziona sia se
le stringhe siano separate da spazi, sia se sono separate da a-capo).
