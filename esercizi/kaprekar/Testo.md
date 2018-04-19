La costante di Kaprekar
=======================

Descrizione
-----------

Dattaraya Ramachandra Kaprekar è un matematico indiano vissuto nel secolo scorso
che si occupava di teoria dei numeri. Una delle sue scoperte più bizzarre
riguarda una costante, che porta il suo nome.

Dato un numero (in base dieci) di quattro cifre, considerate la seguente
trasformazione: prendete il numero ottenuto scrivendo le sue cifre dalla più
grande alla più piccola e sottraetegli quello ottenuto scrivendo le sue cifre
dalla più piccola alla più grande. Ad esempio, dato

    3124

si otterà

    3087

Infatti, le cifre che compongono 3124 sono 3, 1, 2, 4. Ordinandole in ordine
decrescente si ottiene il numero 4321, ordinandole in ordine crescente si ha
1234 e 4321 - 1234 = 3087.  Ovviamente, si può applicare la stessa
trasformazione al numero così ricavato, ottenendo ad esempio la sequenza

    3124 → 3087 → 8352 → 6174

dove il terzo e quarto numero si ottengono osservando che 8352 = 8730 - 0378 e
6174 = 8532 - 2358.

La cosa interessante è che se si trasforma 6174 si ottiene ancora 6147, dal
momento che 6174 = 7641 - 1467.

Ancora più interessante è che 6174 è il "punto fisso" a cui si arriva
indipendentemente dal numero da cui si parte, per questa ragione, tale numero è
stato chiamato *costante di Kaprekar*.

Scrivete un programma che, dato un numero di quattro cifre nel flusso di
ingresso, emetta nel flusso di uscita la sequenza di numeri che si ottengono a
partire da esso (compreso) con la trasformazione qui descritta fino alla
costante di Kaprekar (inclusa), uno per linea.


Vincoli
-------

I numeri in ingresso hanno almeno due cifre diverse.


Esempio
-------

Eseguendo `soluzione` e avendo `1709` nel flusso di ingresso, il programma
emette

    1709
    9531
    8172
    7443
    3996
    6264
    4176
    6174

nel flusso di uscita. Eseguendo `soluzione` e avendo `6174` nel flusso di
ingresso, il programma emette

    6174

nel flusso di uscita.


Suggerimenti
------------

Si suggerisce di implementare una metodo statico che, dato un numero, esegua un
passo della trasformazione.

Per ordinare le cifre di un numero è possibile procedere ordinando una coppia di
cifre per volta; nel caso in cui le cifre siano solo quattro, è facile
convincersi che (qualunque sia il numero di partenza), la sequenza

- ordina la coppia di caratteri in posizione 0 e 1,
- ordina la coppia di caratteri in posizione 2 e 3,
- ordina la coppia di caratteri in posizione 0 e 2,
- ordina la coppia di caratteri in posizione 1 e 3,
- ordina la coppia di caratteri in posizione 1 e 2;

è sempre sufficiente a ordinare tutte le cifre. Ad esempio, se le cifre sono
inizialmente

    4 3 5 2

e si intende ordinarle in ordine crescente, si procede come segue

    0 1 2 3
    - - - -
    4 3 2 5
    ^ ^    
    3 4 5 2
        ^ ^
    3 4 2 5
    ^   ^
    2 4 3 5
      ^   ^
    2 4 3 5
      ^ ^
    2 3 4 5

dove con `^` si è indicato a ogni passo la coppia di caratteri interessata
all'ordinamento.
