Somma tre numeri reali
======================

Descrizione
-----------

Scrivete un programma che, dati tre numeri reali nel flusso di ingresso, emetta
la loro somma nel flusso di uscita.

Ad esempio, se il flusso di ingresso contiene

    0.25 0.5 0.75

il programma emette `1.5` nel flusso di uscita; osservate che i numeri potrebbero
essere negativi, ad esempio, all'ingresso

    0.125 -0.5 0.75

corrisponde l'uscita `0.375`.

Sapreste spiegare l'output prodotto dal vostro programma su ingresso

    0.1 0.2 -0.3


Esempio
-------

Eseguendo

    soluzione

e avendo nel flusso di ingresso

    1.25 2.25 3.5

il programma emette nel flusso di uscita

    7.0


Suggerimenti
------------

Potete leggere un numero reale (in doppia precisione) con il metodo `nextDouble`
della classe `Scanner` e memorizzarlo in una variabile di tipo `double`.

Fate attenzione: ci sono diversi modi di "scrivere" un numero reale, in alcuni
paesi si usa il punto `.` come separatore tra la *parte intera* e quella
*frazionaria*, in altri la virgola `,`. Questo, tra l'altro, comporta che se il
vostro sistema è configurato per usare la virgola e nel flusso di ingresso
invece usate il punto, verrà emesso un errore.

Per forzare il sistema a utilizzare il punto (che è quello contenuto dei file di
test), se invece di usare `soluzione` (che si prende cura della questione),
volete invocare direttamente la JVM, usate l'opzione `-Duser.language=ROOT`;
detto altrimenti, o testate il codice con

    soluzione < input-1.txt

oppure con

    java -Duser.language=ROOT Soluzione < input-1.txt

(supponendo che abbiate implementato la vostra soluzione in una classe di nome
`Soluzione`).
