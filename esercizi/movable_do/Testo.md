Scala maggiore
==============

Descrizione
-----------

Per gli scopi di questo esercizio assumiamo che le 12 *note* musicali della
*scala cromatica* siano denotate dalla sequenza

    C  C#  D  D#  E  F  F#  G  G#  A  A#  B

L'intervallo tra ogni coppia consecutiva di queste note è chiamato un
*semitono* e la sequenza è "chiusa ad anello", ossia dopo la `B` la sequenza
ricomincia dalla `C`.

Ad esempio, `E` è `1` semitono sopra `D#`, `C` è `1` semitono sopra `B`, `F#` è
`4` semitoni sopra `D` e `C#` è `10` semitoni sopra `D#`; osservate che ogni
nota è `12` semitoni sopra se stessa.

Una *scala maggiore* comprende `7` delle `12` note della scala cromatica, ci
sono `12` diverse scale maggiori, una per ciascuna nota; per esempio, la scala
maggiore `D` è composta dalle note

    D  E  F#  G  A  B  C#

Le note in una scala maggiore sono le note che sono

    0 2 4 5 7 9 11

semitoni sopra la nota che dà il nome alla scala. Nel sistema di solfeggio detto
*movable do solfège* queste note della scala maggiore sono chiamate
rispettivamente coi nomi

    Do Re Mi Fa So La Ti

Ad esempio `Mi` nella scala maggiore `D` corrisponde a `F#`, perché `F#` è `4`
semitoni sopra la `D` e `Mi` indica la nota che si trova `4` semitoni sopra
quella che dà il nome alla scala.

Scrivete un programma che, dato il nome di una scala maggiore e una delle note
del solfeggio come argomenti sulla riga di comando, emetta nel flusso di uscita
la nota corrispondente della scala cromatica.


Vincoli
-------

Gli argomenti della riga di comando sono sempre due e corrispondono a una nota
della scala cromatica e a una nota della scala del *movable do solfège*; il
flusso di uscita deve contenere una sola nota (della scala cromatica).


Esempio
-------

Eseguendo `soluzione C Mi` il programma emette `E` nel flusso di uscita,
eseguendo `soluzione A# Fa` il programma emette `D#` nel flusso di uscita.


Osservazioni
------------

Chi conosce la teoria musicale sa che le note possono avere più di un nome, ad
esempio `A#` è anche nota col nome `B♭`; usualmente, a seconda del contesto, uno
dei due nomi è più appropriato dell'altro. Ad esempio non sentirete mai parlare
della scala maggiore `A#`, quanto piuttosto di quella `B♭`. Per semplicità, in
questo esercizio, fate riferimento ai soli nomi dati nella descrizione.
