Conta le parole rotonde
=======================

Descrizione
-----------

Diciamo che una parola (ossia una sequenza massimale di caratteri alfabetici) è
*rotonda* se inizia e termina con lo stesso carattere. Sono ad esempio parole
rotonde

    amica, olmo, chic

mentre non lo sono

    cane, pino, gioco

Scrivere un programma che, data una sequenza di parole terminata da punto nel
flusso di ingresso, emetta nel flusso di uscita il numero di parole rotonde in
essa contenute.


Vincoli
-------

Il flusso di ingresso contiene solo lettere minuscole e spazi ed è terminato da
un punto. Le parole sono separate tra loro da uno spazio. Non si possono
assumere vincoli sulla lunghezza delle parole, viceversa il numero totale di
parole può essere rappresentato da una variabile di tipo `int`.


Esempio
-------

Eseguendo `soluzione` e avendo nel flusso di ingresso

    alberga in un olmo una alta marmotta chic.

il programma emette `4` nel flusso di uscita (sono infatti rotonde solo la
prima, quarta, sesta ed ultima parola).
