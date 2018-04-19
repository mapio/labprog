Trenino
=======

Descrizione
-----------

Chiamiamo *vagoni* sequenze di (un numero variabile di) caratteri `=` delimitati
dai segni `<` o `>`, come ad esempio

    <=====>
    <=<
    >===<
    >=======>

e chiamiamo *trenino* una sequenza di vagoni separati l'uno dall'altro da un
singolo spazio. Diciamo che un trenino è *ben formato* se e solo se l'ultimo ed
il primo carattere di due vagoni consecutivi sono uguali. Ad esempio, sono ben
formati i trenini

    <==> >==> >===< <===>
    >==> >==<
    <===> >===< <===>

ma non lo sono

    <===> <===< <===>

perché il primo vagone finisce con `>` ma il successivo inizia con `<` e

    <==> >==> >===< >===>

perché il penultimo vagone finisce con `<`, ma il successivo inizia con `>`.

Scrivere un programma che, dato un trenino nel flusso di ingresso, emetta `si`
se esso è ben formato, o `no` altrimenti.


Vincoli
-------

Il flusso di ingresso contiene solo le lettere `>`, `<`, `=`, ` ` ed è terminato
da `EOF`. Non si possono assumere vincoli sulla quantità di caratteri in
ingresso, sulla lunghezza dei vagoni, o sul loro numero; è però garantito che
sia sempre presente almeno un vagone.


Esempio
-------

Eseguendo `soluzione` e avendo nel flusso di ingresso

    <==> >==> >===< <===>

il programma emette `si` nel flusso di uscita.
