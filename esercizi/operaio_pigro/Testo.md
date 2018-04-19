Lavorare stanca
===============

Descrizione
-----------

Consideriamo un *operaio* che compia due sole attività: *lavorare* e *riposare*.
Ogni volta che ha un *turno* di riposo, gli dedica una unità di tempo; quando
esegue un turno di lavoro, se ha appena riposato impiega una unità di tempo,
altrimenti impiega il doppio del turno precedente.

Indicando con `L` e `R` le due attività, i turni della sequenza hanno durata

    R L L R L L L L R R L L R

rispettivamente pari a

    1 1 2 1 1 2 4 8 1 1 1 2 1

unità di tempo, il che comporta una durata complessiva di `26` unità di tempo
(osservate che, sebbene ci siano due `R` consecutive, il riposo dura sempre una
unità di tempo).

Scrivere un programma che, data una sequenza di attività come parametri sulla
linea di comando, emetta nel flusso di uscita il numero di unità di tempo
corrispondenti alla sua durata complessiva.


Vincoli
-------

Non ci sono vincoli sul numero di attività nella sequenza, viceversa la durata
complessiva in unità di tempo può essere rappresentata da una variabile di tipo
`long`.


Esempio
-------

Eseguendo `soluzione R L L R L L L L R R L L R` il programma emette `26` nel
flusso di uscita; eseguendo

    soluzione L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L L

il programma emette `1099511627775` nel flusso di uscita.
