Stampante configurabile
=======================

Descrizione
-----------

Scopo dell'esercizio è scrivere una "stampante" in cui possa essere specificato
non solo il *testo* da stampare, ma anche il *font* con cui stamparlo.

Assumiamo che il *testo* che la stampante è in grado di gestire sia composto a
partire da `K` caratteri distinti che essa riceve in ingresso, codificati come
numeri compresi tra `0` e `K`-1.

Assumiamo inoltre che il *font* sia specificato indicando, per ciascuno dei `K`
caratteri, un numero `F` di stringhe che la stampante emetterà (una per riga) in
corrispondenza di ogni carattere del *testo* da stampare.

Se, per esempio, `K` è pari a 2 e `F` pari a 3 e il *font* è dato da

    ####
    |  |
    ####

per il primo carattere e

    \ /
     X
    / \

per il secondo, dato il *testo* `0 1 0`, la stampante emette

    #### \ / ####
    |  |  X  |  |
    #### / \ ####

In modo analogo, se `K` e `F` sono 3 e i *font* sono

    ____
    |__|
    |  |

per il primo carattere

    ___
    |__]
    |__]

per il secondo e

    ____
    |   
    |___

per il terzo, dato il testo `1 0 2 2 0` la stampante deve emettere

    ___  ____ ____ ____ ____
    |__] |__| |    |    |__|
    |__] |  | |___ |___ |  |


Scrivete un programma che, dati `K`, `F` e i caratteri del *testo* come interi
sulla riga di comando e il *font* come `K` x `F` righe nel flusso di ingresso,
stampi il *testo* dato con il *font* specificato.


Vincoli
-------

Potete assumere che tutti i numeri in gioco siano rappresentabili con variabili
di tipo `int`.

Gli argomenti sulla linea di comando sono numeri, `K` e `F` sono positivi e gli
interi che corrispondono ai caratteri del testo *testo* sono compresi tra `0` e
`K`-1.

Nel flusso di ingresso sono presenti esattamente `K` x `F` linee, l'*i*-esimo
gruppo di `F` linee corrispondono al *font* dell'*i*-esimo carattere; osservate
che non è detto che le linee siano tutte della stessa lunghezza (l'*ampiezza* di
un carattere è pari alla lunghezza della stringa più lunga tra le `F` del sul
*font*).

Il flusso di uscita deve contenere il testo stampato che deve occupare `F`
linee, tra la stampa di un carattere ed il successivo deve essere presente
esattamente uno spazio (cosicché il numero totale di colonne risulti pari alla
somma delle ampiezze dei caratteri del testo, più il numero di caratteri del
testo meno uno).


Esempio
-------

Eseguendo

    soluzione 2 3 0 1 0

e avendo

    ####
    |  |
    ####
    \ /
     X
    / \

nel flusso di ingresso, il programma emette

    #### \ / ####
    |  |  X  |  |
    #### / \ ####

nel flusso di uscita. Eseguendo

    soluzione 8 1 0 1 4 2 4 3 0 7 5 6   

e avendo

    A
    B
    C
    D
    E
    I
    O
    R

nel flusso di ingresso, il programma emette

    A B E C E D A R I O

nel flusso di uscita.
