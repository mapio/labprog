Codice di Vigénère
==================

Descrizione
-----------

Un sistema di cifratura molto diffuso fin dal XVI secolo è il cosiddetto *codice
di Vigénère*, una variante polialfabetica del cifrario di Cesare.

Supponete di avere un *testo in chiaro*, costituito semplicemente da una
sequenza di caratteri alfabetici. Per applicare il codice di Vigénère, occorre
anche avere una chiave di cifratura, spesso chiamata *verme*.

Il testo in chiaro e il verme vengono scritti uno sopra l'altro (il
verme viene, se necessario, ripetuto più volte e/o troncato, in modo che
le due sequenze di caratteri abbiano la stessa lunghezza). Quindi i due
testi vengono sommati lettera per lettera. In pratica, questo
corrisponde ad identificare ogni lettera dell'alfabeto con un numero fra
0 e 25, e nell'effettuare le somme modulo 26.

Ad esempio, se il testo fosse

    ARRIVANOIRINFORZI

ed il verme fosse

    VERME

si otterrebbe

    ARRIVANOIRINFORZI
    VERMEVERMEVERMEVE
    VVIUZVRFUVDRWAVUM

Infatti `A` + `V` = `V` (essendo `A` la 0-esima lettera e `V` la  21-esima
lettera, `A` + `V` = 0 + 21 = 21 = `V`), `R` + `E` = `V` (`R` è la 17-esima
lettera e `E` la quarta, `R` + `E` = 17 + 4 = 21 = `V`) eccetera.

Scrivete un programma che, dato il verme come parametro sulla linea di comando
legga dal flusso di ingresso il testo in chiaro  ed  emetta sul flusso di uscita
il testo cifrato.


Vincoli
-------

Potete assumere che il verme ed il testo in chiaro siano costituiti solo da
lettere maiuscole

    A, B, ..., X, Y, Z

senza spazi, o altre caratteri.


Esempio
-------

Eseguendo `soluzione VERME` eavendo nel flusso di ingresso

    ARRIVANOIRINFORZI

il programma emette

    VVIUZVRFUVDRWAVUM

nel flusso di uscita. Similmente, eseguendo `soluzione FWJOW` e avendo nel
flusso di ingresso

    VVIUZVRFUVDRWAVUM

il programma emette

    ARRIVANOIRINFORZI

sul flusso di uscita.
