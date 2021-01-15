Il numero più pesante
=====================

Descrizione
-----------

Definiamo *peso* di un numero la somma dei suoi divisori propri, ossia la somma
di tutti i numeri positivi (escluso 1 e il numero stesso) che lo dividono in
modo esatto, senza resto. Ad esempio, di seguito è riportato un elenco di numeri
ciascuno seguito dal suo peso

    4       2
    6       5
    8       6
    9       3
    10      7
    12      15
    14      9
    15      8
    16      14
    18      20

osservate che non sono riportati i numeri primi (il cui peso è 0) e che, ad
esempio, il peso di 12 è 15 perché i divisori proprio di 12 sono: 2 3 4 6, la
cui somma da appunto 15.

Scrivete un programma che, dato un elenco di numeri interi come argomenti sulla
linea di comando, emetta nel flusso di uscita il peso del numero più pesante.


Vincoli
-------

Tutte le grandezze numeriche in gioco possono essere rappresentate con
variabili di tipo `int`.


Esempio
-------

Eseguendo `soluzione 14 9 10 12 8 16 15` il programma emette `15` nel flusso di
uscita.
