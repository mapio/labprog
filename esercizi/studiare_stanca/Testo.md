Studiare stanca
===============

Descrizione
-----------

Consideriamo uno studente che compia due sole attività: studiare e riposare.
Ogni volta che fa un riposo, gli dedica una unità di tempo; quando studia, se ha
appena riposato impiega una unità di tempo, altrimenti è così affaticato che
impiega il doppio della volta precedente.

Indicando con S e R le due attività, le attività della sequenza

	R S S R S S S S R R S S R

 hanno durata rispettivamente pari a

	1 1 2 1 1 2 4 8 1 1 1 2 1

unità di tempo, il che comporta una durata complessiva di 26 unità di tempo
(osservate che, sebbene ci siano due R consecutive, il riposo dura sempre una
unità di tempo).

Scrivere un programma che, data una sequenza di attività come parametri sulla
linea di comando, emetta nel flusso di uscita il numero di unità di tempo
corrispondenti alla sua durata complessiva.


Vincoli
-------

Non ci sono vincoli sul numero di attivtà nella sequenza, viceversa la durata
complessiva in unità di tempo può essere rappresentata da una variabile di tipo
long.


Esempio
-------

Eseguendo `soluzione R S S R S S S S R R S S R` il programma emette `26` nel
flusso di uscita; eseguendo

    soluzione S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S S

il programma emette nel flusso di uscita

    1099511627775
