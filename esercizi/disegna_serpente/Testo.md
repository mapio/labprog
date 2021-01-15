Disegna il serpente
===================

Descrizione
-----------

Scrivete un programma che, dati due numeri interi positivi `N` e `L` come
argomenti sulla linea di comando, "disegni un serpente" composto di `N` segmenti
orizzontali lunghi `L` segni `-`, che inizi e termini con `*` e abbia un `+` in
corrispondenza di ogni svolta.

Ad esempio, per `N` pari a `3` e `L` pari a `10`, il programma emette nel flusso
di uscita

    *----------+
               |
    +----------+
    |           
    +----------*

così come, per `N` e `L` pari rispettivamente a `4` e `16`, emette

    *----------------+
                     |
    +----------------+
    |                 
    +----------------+
                     |
    *----------------+


Vincoli
-------

Tutti i numeri coinvolti nel programma possono essere rappresentati da variabili
di tipo `int`.


Esempio
-------

Eseguedo `soluzione 1 5` il programma emette `*-----*` nel flusso di uscita.
Eseguendo `soluzione 3 1` il programma emette

    *-+
      |
    +-+
    |  
    +-*

nel flusso di uscita.
