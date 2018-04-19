Scala discendente
=================

Descrizione
-----------

Scrivete un programma che, data nel flusso di ingresso una sequenza di lunghezze
alternate per pedata ed alzata, emetta nel flusso di uscita il disegno (composto
dai caratteri `+`, `-`, `|`, spazio e *a-capo*) di una scala discendente che
rispetti tali specifiche.

Ad esempio, alla sequenza di lunghezze

    4 2 6 1 3 3

deve corrispondere il disegno della scala

    ----+
        |
        |
        +------+
               |
               +---+
                   |
                   |
                   |

dove le pedate (segmenti orizzontali disegnati con il carattere `-`) sono lunghe
4, 6 e 3, mentre le alzate (segmenti verticali disegnati col carattere `|`) sono
lunghe 2, 1 e 3.


Vincoli
-------

Le lunghezze possono essere rappresentate con variabili di tipo `int` e sono
positive, non ci sono però vincoli sul loro numero.


Esempio
-------

Eseguendo

    soluzione

e avendo

    4 3 2

nel flusso di ingresso,  il programma emette nel flusso di uscita

    ----+
        |
        |
        |
        +--
