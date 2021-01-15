Ultima stringa
==============

Descrizione
-----------

Scrivete un programma che, data una sequenza di stringhe nel flusso di ingresso,
emetta nel flusso di uscita l'ultima stringa in ordine alfabetico.


Vincoli
-------

Il flusso di ingresso contiene una o più stringhe, separate da un qualunque
carettare *white-space*, non necessariamente spazio o a-capo.


Esempio
-------

Eseguendo

    soluzione

e avendo nel flusso di ingresso

    che
    esercizio bello

il programma emette nel flusso di uscita

    esercizio

infatti la parola `esercizio` segue `bello` e `che` secondo l'ordine alfabetico.


Suggerimenti
------------

Lo `Scanner` è in grado di segnalare che non ci sono più stringhe nel flusso di
ingresso restituendo il valore `false` alla chiamata di `hasNext()`; un ciclo
che analizzi in sequenza tutte le stringhe del flusso di ingresso ha pertanto la
forma seguente

    while (sc.hasNext()) {
        String str = sc.next();
        ...
    }

dove `sc` è una oggetto di tipo `Scanner` opportunamente istanziato.
