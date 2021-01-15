Tra parentesi
=============

Descrizione
-----------

Consideriamo stringhe composte solo dai caratteri corrispondenti alle parentesi
`(`, `)`, `[`, `]`, `{`, `}`; diremo che una stringa del genere è *ben formata*
se:

 * è la stringa vuota, oppure
 * a ogni parentesi aperta di un tipo ne corrisponde una chiusa dello stesso
   tipo e tra tale coppia di parentesi è racchiusa una stringa ben formata,
   oppure
 * è la concatenzazione di stringhe ben formate.

Queste definizioni corrispondono intuitivamente alla nozione di espressioni ben
parentesizzate che avete imparato a scuola, fatto salvo che qui non si bada
alla precedenza tra i tipi di parentesi: la stringa `({})` è ben formata, anche
se le tonde racchiudono le graffe.

Sono ben foramte le stringhe

    ()()
    [{}()[()]]
    {{[[()]()]}}

mentre non lo sono

    (])
    {(})
    ([))

Scrivete un programma che, data una stringa di parentesi nel flusso di
ingresso, emetta `si` se essa è ben formata, oppure `no` altrimenti.

Vincoli
-------

Il flusso di ingresso contiene solo caratteri scelti tra le sei parentesi di cui
sopra, più il sengo di a-capo al termine della stringa. Detto altrimenti,
l'input contiene una ed una sola linea.


Esempio
-------

Eseguendo `soluzione` e avendo `[[{}()[()]]]` nel flusso di ingresso, il
programma emette `si` nel flusso di uscita.

Eseguendo `soluzione` e avendo `[][])` nel flusso di ingresso, il programma
emette `no` nel flusso di uscita.


Suggerimenti
------------

Per decidere se una stringa è ben formata basta scorrerla da sinistra a destra,
"cancellando" le parentesi aperte man mano che si incontrano le corrispondenti
parentesi chiuse, arrestandosi se si incontra una parentesi chiusa che non
corrisponde ad alcuna parentesi aperta; se alla fine di questo processo non
restano parentesi, allora la stringa è ben formata.
