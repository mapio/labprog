Cattedrale
==========

Descrizione
-----------

Chiamiamo *guglia* di altezza `N` una colonna `N` di caratteri `|`; chiamiamo
*cattedrale* di dimensione `M` > 0 una guglia alta `M` preceduta e seguita da un
cattedrale di dimensione `M` - 1, assumendo per convenzione che un cattedrale di
dimensione 0 non contenga alcuna guglia (o altra cattedrale) e che lo spazio non
occupato dalle guglie sia occupato dal carattere `@`.

Ad esempio, un cattedrale di dimensione 1 è

    |

ossia è una guglia (preceduta e seguita da null'altro); una cattedrale di
dimensione 2 è

    @|@
    |||

infatti è data da una cattedrale di dimensione 1 seguito da una guglia alta 2 e
quindi da una cattedrale di dimensione 1; una cattedrale di dimensione 3 è

    @@@|@@@
    @|@|@|@
    |||||||

di nuovo, infatti, osserviamo un cattedrale di dimensione 2, seguita da una
guglia di altezza 3 e quindi ancora da una cattedrale di dimensione 2.

Scrivete un programma che, data la dimensione di un cattedrale come parametro
sulla linea di comando, emetta nel flusso d'uscita un cattedrale della
dimensione data.


Vincoli
-------

Tutti i numeri coinvolti possono essere rappresentati da variabili di tipo
`int`. La dimensione può essere 0, nel qual caso il programma non emette nulla.

Il flusso di uscita deve essere composto da `N` righe e 2 ^ `N` - 1 colonne
composte di caratteri `|` e `@` (senza considerare il carattere *a-capo*).


Esempio
-------

Eseguendo `soluzione 4` il programma emette

    @@@@@@@|@@@@@@@
    @@@|@@@|@@@|@@@
    @|@|@|@|@|@|@|@
    |||||||||||||||

nel flusso di uscita.
