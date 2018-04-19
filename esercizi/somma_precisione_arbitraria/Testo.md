Somma interi grandi
===================

Descrizione
-----------

Scrivete un programma che dati due numeri interi di dimensione arbitraria come
argomenti sulla linea di comando, ne emetta la somma nel flusso di uscita.

Si osservi che il programma non può usare variabili di tipo `int`, o `long`,
dato che non c'è limite sulla dimensione dei numeri in ingresso, ma deve
implementare l'algoritmo della *somma con riporto* (come insegnato nella scuola
primaria).


Vincoli
-------

Non c'è vincolo sulla dimensione degli interi in ingresso, in particolare,
dev'essere garantito di poter sommare numeri che non possono essere
rappresentati con variaibli di tipo `long`.

La soluzione non può usare alcun oggetto, o metodo, della classe
`java.math.BigDecimal` o di classi derivate.


Esempio
-------

Eseguendo

    soluzione 123123123123124125124613461412341352352 24510485180456134561239486511234

il programma emette

    123123147633609305580748022651827863586

nel flusso di uscita; similmente, eseguendo

    soluzione 1 9999999999999999999999999999999999999999999

il programma emette

    10000000000000000000000000000000000000000000

nel flusso di uscita.
