Conta le sottostringhe
======================

Descrizione
-----------

Scrivete un programma che, date due stringhe come argomenti sulla linea di
comando, conti il numero di volte che la prima compare nella seconda senza
sovrapposizioni.

Attenzione alle sovraposizioni: è ovvio che `ab` compare due volte in
`abbondaba`, ma la stringa `aba` compare una sola volta in `ababa` all'inizio,
perché l'occorrenza che inizia al terzo carattere è sovrapposta alla prima.


Vincoli
-------

Non ci sono vincoli sulla lunghezza delle stringhe, il numero di ripetizioni può
essere però rappresentato da una variabile di tipo `int`.


Esempio
-------

Eseguendo `soluzione pino apinomerpinocolapinone` il programma emette `3` nel
flusso di uscita, mentre eseguendo `soluzione aa aaaa` il programma emette `2`
nel flusso di uscita (infatti `aa` compare all'inizio e alla fine di `aa`,
perché l'occorrenza in mezzo alla stringa è sovrapposta alle altre due).
