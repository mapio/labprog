Parole proibite
===============

Descrizione
-----------

Scrivete un programma che, dati due numeri interi `N` e `M` (il primo minore di
1000 e il secondo minore, o uguale, al primo) come parametri sulla linea di
comando e una sequenza di `N` parole e `M` numeri interi nel flusso di ingresso
(ciascuno minore di `N`), stampi le parole della prima sequenza che non occupino
una delle posizioni indicate da uno dei numeri della seconda sequenza.

Ad esempio, se i parametri sulla linea di comando sono `5` e `2` e il flusso di
ingresso contiene

    un
    bel
    giorno
    di
    sole
    2
    3

il programma emette

    un
    bel
    sole

nel flusso di ingresso, omettendo le parole `giorno` e `di` che occupano,
rispettivamente, le posizioni `2` e `3` della sequenza di parole (le posizioni
sono numerate da 0).

Vincoli
-------

I parametri sulla linea di ingresso sono maggiori, o uguali, a 0 e il primo è
minore di 1000, mentre il secondo è minore, o uguale, al primo; questo comporta
che ci siano al più 1000 parole nel flusso di ingresso e che le posizioni
proibite siano al più pari al numero di parole. Inoltre, i numeri nel flusso di
ingresso corrispondono sempre a posizioni valide, ossia sono compresi tra 0 e il
numero di parole (escluso). Infine, le parole sono lunghe al più 1000 caratteri
ciascuna.


Esempio
-------

Eseguendo `soluzione 5 1` e avendo nel flusso di ingresso

    un
    bel
    giorno
    di
    sole
    1

il programma emette

    un
    giorno
    di
    sole

nel flusso di uscita.
