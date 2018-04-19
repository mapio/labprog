Rimpiazza
=========

Descrizione
-----------

Scrivere un programma che, data una stringa di "rimpiazzo" come argomento
sulla linea di comando e un testo nel flusso in ingresso, emetta quest'ultimo
nel flusso di uscita dopo aver sostituito, di volta in volta, ogni occorrenza
del carattere `#` in ingresso con il primo carattere non ancora usato del
rimpiazzo (eventualmente ricominciando dal primo carattere del rimpiazzo se
nel testo ci sono più caratteri `#` della lunghezza del rimpiazzo).

Ad esempio, se il rimpiazzo è

    CIAO

ed il testo è

    #ome t# #m# #aro am#co

il programma emette

    Come tI AmO Caro amIco

che corrisponde al testo in cui le lettere del rimpiazzo `CIAO` compaiono
ordinatamente al posto del carattere `#` (osservate che, siccome `#` compare 6
volte nel testo, ma il rimpiazzo è lungo 4, gli ultimi due # vengono rimpiazzati
ricominciando dal primo carattere del rimpiazzo).


Vincoli
-------

Non ci sono vincoli sul numero di caratteri nel rimpiazzo, o del testo. Il testo
termina per `EOF`. Tutti i caratteri presenti nel testo e diversi da `#` devono
essere emessi immutati nel flusso di uscita.


Esempio
-------

Eseguendo `soluzione CIAO` e avendo nel flusso di ingresso

    #ome  t#
    s#lv# #ara am#ca
    mi#

il programma emette

    Come  tI
    sAlvO Cara amIca
    miA

nel flusso di uscita.
