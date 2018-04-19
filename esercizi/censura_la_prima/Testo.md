Censura la prima
================

Descrizione
-----------

Scrivete un programma che, data una sequenza di parole nel flusso di ingresso, le
emetta una per linea censurandone le lettere uguali alla prima, ossia
sostituendo in ciascuna parola tutte le occorrenze delle lettere uguali alla sua
prima lettera con il simbolo `#`.

Ad esempio, se il flusso di ingresso contiene le parole `mamma elegante` il
programma deve emettere nel flusso di uscita le parole

    #a##a
    #l#gant#


Vincoli
-------

Il flusso di ingresso contiene sempre almeno una parola, l'ultima parola del
flusso è `fine`, ma non si possono fare assunzioni sul numero massimo di parole
presenti. Per *parola* si intende una sequenza massimale di caratteri diversi da
*white-space* (ossia spazio, tabulazione, o a capo). Il flusso di uscita deve
contenere una parola per linea, compresa la parola `#ine` (censura dell'ultima
parola nel flusso di ingresso).


Esempio
-------

Eseguendo `soluzione` e avendo

    elementare questo
    esercizio
    filtro
    fine

nel flusso di ingresso, il programma emette

    #l#m#ntar#
    #uesto
    #s#rcizio
    #iltro
    #ine

nel flusso di uscita.
