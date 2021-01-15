La barretta più lunga
=====================

Descrizione
-----------

Data una stringa composta dai simboli `#` e `-` chiamiamo *barretta* una
sequenza consecutiva di simboli `#` e chiamiamo *lunghezza* di una barretta il
numero di `#` che la compongono. Ad esempio, la stringa

    ----####-##-######----

contiene tre barrette di lunghezza, rispettivamente, `4`, `2` e `6`.

Scrivete un programma che legga una stringa con tale formato dal flusso di
ingesso ed emetta nel flusso di uscita la lunghezza della barretta più lunga.


Vincoli
-------

Non si può assumere alcun limite sulla lunghezza della stringa nel flusso di
ingresso; il flusso di ingresso contiene solo  `#` e `-` ed eventualmente (ma
non necessariamente) "a capo" (e termina esclusivamente al raggiungimento
dell'`EOF`).


Esempio
-------

Eseguendo `soluzione` avendo nel flusso di ingresso

    ----####-##-######----

il programma emette `6` nel flusso di uscita (infatti le barrette sono lunghe `4`,
`2`  e `6` che è quella di lunghezza massima).
