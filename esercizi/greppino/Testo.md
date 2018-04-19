Greppino
========

Descrizione
-----------

Definiamo una *parola* come una sequenza non vuota di caratteri scelti tra le
lettere maiuscole dell'alfabeto `A`, `B`, `C`, ..., `X`, `Y`, `Z` e un
*pattern* come una parola in cui zero o più caratteri siano stati sostituiti
dal simbolo `#`. Diremo che una parola *corrisponde* a un pattern se i suoi
caratteri sono, posto per posto, uguali a quelli del pattern, fatta eccezione per
i casi in cui nel pattern compare il simbolo `#`.

Detto in altro modo, una parola corrisponde ad un pattern se sono uguali le due
parole ottenute l'una cancellando il simbolo `#` nel pattern e l'altra le lettere
in posizioni corrispondenti nella parola.

Ad esempio, al pattern `P#ZZA` corrispondono le parole

    PIZZA
    PUZZA
    PAZZA

perché, fatta eccezione per il loro secondo carattere (che corrisponde a `#` nel
pattern), gli altri caratteri sono uguali (e nello stesso ordine) a quelli del
pattern; ossia, `PZZA` è quel che resta da pattern e parole cancellando `#` e
lettere corrispondenti.

Viceversa, la parola `ZAPPA` non corrisponde al pattern `P#ZZA` perché, ad
esempio, il primo carattere del pattern e della parola sono diversi.

Scrivete un programma che dato un pattern come argomento sulla linea di comando
e una sequenza di parole nel flusso di ingresso emetta nel flusso di uscita
tutte e sole le parole in ingresso corrispondenti al pattern specificato
(rispettando l'ordine di ingresso).


Vincoli
-------

Le parole sono separate tra loro da *white-space*, non ci sono limiti sul numero
di parole nel flusso di ingresso (che quindi termina per EOF).


Esempio
-------

Eseguendo `soluzione COZZ#` e avendo in ingresso

    COZZA
    ZUCCA
    CANNELLONI
    COZZE
    PINOLI

il programma emette

    COZZA
    COZZE


Osservazione
------------

Questo esercizio prende il nome dal comando Unix `grep`, sapreste dire a cosa
serve?
