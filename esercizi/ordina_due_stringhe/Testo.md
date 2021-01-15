Ordina due stringhe
===================

Descrizione
-----------

Scrivete un programma che, date due stringhe nel flusso di ingresso, emetta nel
flusso di uscita le due stringhe in ordine alfabetico.


Vincoli
-------

Il flusso di ingresso contiene solo due stringhe, separate da un qualunque
carettare *white-space*, non necessariamente spazio o a-capo. Nel flusso di
uscita, le parole devono essere separate da un solo spazio bianco (e quindi
essere sulla stessa linea).


Esempio
-------

Eseguendo

    soluzione

e avendo nel flusso di ingresso

    esercizio
    bello

il programma emette nel flusso di uscita

    bello esercizio

infatti la parola `bello` viene prima di `esercizio` secondo l'ordine alfabetico.


Suggerimenti
------------

Data una stringa `s`, per sapere se essa viene prima o dopo in ordine alfabetico
rispetto a una stringa `t`, non è possibile usare l'operatore `<` (che usereste
per confrontare, ad esempio, due numeri interi), ma è necessario usare il metodo
`compareTo` della classe `String`, invocandolo ad esempio come `s.compareTo(t)`.

Per leggere una stringa dal flusso di ingresso usate il metodo `next()` della
classe `Scanner`; l'uso del metodo `nextLine()` è corretto solo nel caso in cui
le parole siano una per linea, cosa però non garantita dal testo di questo
esercizio.
