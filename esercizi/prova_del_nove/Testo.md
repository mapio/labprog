La prova del nove
=================

Descrizione
-----------

Alle elementari vi hanno insegnato la "prova del nove": se volete convincervi di
aver fatto bene una moltiplicazione potete agire in questo modo:

* fate la somma delle cifre del primo fattore, eventualmente ripetendo il
  procedimento finché ottenete un numero di una sola cifra,
* fate lo stesso con il secondo fattore,
* fate il prodotto delle cifre così ottenute, applicando poi il procedimento di
  cui sopra al valore ottenuto,
* applicate lo stesso procedimento al risultato e verificate che la cifra così
  ottenuta sia uguale a quella ottenuta al passo precedente.

Ad esempio, per verificare che 12345 x 56789 = 701060205 calcolereste, per gli
operandi:

* 1 + 2 + 3 + 4 + 5 = 15 da cui 1 + 5 = 6,
* 5 + 6 + 7 + 8 + 9 = 35 da cui 3 + 5 = 8,

quindi:

* fareste il prodotto 6 x 8 = 48, ottenendo 4 + 8 = 12, da cui 1 +  = 3,

infine, calcolereste:

* 7 + 0 + 1 + 0 + 6 + 2 + 0 + 5 = 21  da cui 2 + 1 = 3

e vi convincereste d'aver fatto bene, avendo ottenuto 3 come singola cifra
derivante sia del prodotto delle due cifre ottenute dai moltiplicandi, che dal
vostro risultato.

Sfortunatamente, se è vero che la prova del nove *funziona* (ossia la cifra
ottenuta dal prodotto delle cifre ottenute dai moltiplicandi è uguale alla cifra
ottenuta dal risultato) se il risultato è giusto, non è vero il viceversa: ci
sono moltiplicazioni sbagliate per cui però la prova del nove funziona!

Per convincervene, osservate che nella precedente moltiplicazione, sostituendo
il risultato corretto 701060205 con 71625 (ottenuto eliminando gli 0), la prova
del nove continuerebbe a funzionare, sebbene il risultato sarebbe ovviamente
errato!

Scrivete un programma che, dato un numero naturale `N` nel flusso di ingresso,
emetta tutte e sole le possibili terne di interi positivi `A`, `B` e `C` ciascuno
minore di `N` per cui `A` x `B` è diverso da `C`, ma la prova del nove funziona.


Vincoli
-------

Tutti i numeri coinvolti possono essere rappresentati da variabili di tipo
`int`. Il flusso di uscita contiene una terna per riga, con i tre numeri di
ciascuna terna separati da un singolo spazio. Le terne devono essere emesse in
ordine *lessicografico* (ossia il primo numero, da sinistra a destra, per cui
due terne consecutive differiscono è minore nella prima terna rispetto alla
seconda).


Esempio
-------

Eseguendo

	soluzione

e avendo `6` nel flusso di ingresso, il programma emette

    2 5 1
    3 4 3
    4 3 3
    4 5 2
    5 2 1
    5 4 2

nel flusso di uscita.


Suggerimenti
------------

Per emettere le terne in ordine lessicografico, è sufficiente usare tre cicli
annidati, la variabile di ciascuno dei quali assuma valori compresi tra 0 ed `N`
(estremi esclusi).


Osservazioni
------------

La prova del nove prende il nome dal fatto che la cifra 9 si può eliminare ogni
volta che compare in una somma, ad esempio sommando le cifre di 192 si ottiene
lo stesso risultato che si ottiene sommando le cifre di 12.

Questo potrebbe suggerirvi un modo alternativo di ottenere la cifra finale
ottenuta sommando ripetutamente le cifre: essa è uguale al resto della divisione
intera per 9 (infatti 9 diviso 9 ha resto 0). Nell'esempio precedente, 192 % 9 =
3, così come 12 % 9 = 3.
