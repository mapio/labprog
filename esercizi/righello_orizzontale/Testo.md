Righello orizzontale
====================

Descrizione
-----------

Chiamiamo *tacca* di altezza N una colonna N di caratteri `|`; chiamiamo
*righello* di dimensione M > 0 una tacca alta M preceduta e seguita da un
righello di dimensione M - 1, assumendo per convenzione che un righello di
dimensione 0 non contenga alcuna tacca (o altro righello) e che lo spazio non
occupato dalle tacche sia occupato dal carattere `.`.

Ad esempio, un righello di dimensione 1 è

    |

ossia è una tacca (preceduta e seguita da null'altro); un righello di dimensione
2 è

    .|.
    |||

infatti è dato da un righello di dimensione 1 seguito da una tacca alta 2 e
quindi da un righello di dimensione 1; un righello di dimensione 3 è

    ...|...
    .|.|.|.
    |||||||

di nuovo, infatti, osserviamo un righello di dimensione 2, seguito da una tacca
di altezza 3 e quindi ancora da un righello di dimensione 2.

Scrivete un programma che, data la dimensione di un righello come intero nel
flusso di ingresso, emetta nel flusso di uscita un righello della dimensione
data.


Vincoli
-------

Tutti i numeri coinvolti possono essere rappresentati da variabili di tipo
`int`. La dimensione può essere 0, nel qual caso il programma non emette nulla.

Il flusso di ingresso deve essere composto da N righe e 2 ^ N - 1 colonne
composte di caratteri `|` e `.` (senza considerare il carattere *a-capo*).


Esempio
-------

Eseguendo `soluzione` e avendo `4` nel flusso di ingresso, il programma emette

    .......|.......
    ...|...|...|...
    .|.|.|.|.|.|.|.
    |||||||||||||||

nel flusso di uscita.
