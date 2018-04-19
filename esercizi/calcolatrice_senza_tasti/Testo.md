Calcolatrice senza tasti
========================

Descrizione
-----------

Uno sfortunato studente ha a disposizione una calcolatrice dove, oltre alle
cifre, sono presenti solo due tasti: `*2` e `+1` che, rispettivamente,
moltiplicano per due, o aggiungono 1, al risultato corrente.

Scrivete un programma che, dati due numeri `a` e `b` nel flusso di ingresso, lo
aiuti a trasformare il primo numero nel secondo emettendo nel flusso di uscita la
più breve sequenza di tasti di operazioni (tra i due disponibili) che, una volta
premuti, ottengano tale effetto.

Ad esempio, dati i numeri `5` e `11`, il programma emette `*2 +1`. Usando tali
tasti, infatti, lo studente, dopo aver digitato `5` sulla calcolatrice, può
ottenere il risultato intermedio 10 e quindi il risultato finale.

Similmente, dati i numeri `4` e `19`, il programma emette

    *2
    +1
    *2
    +1

che consentono di ottenere i risultati intermedi 8, 9, 18, e quindi il risultato
finale.


Vincoli
-------

Tutti i numeri coinvolti possono essere rappresentati da variabili di tipo
`int`; il flusso di ingresso contiene due numeri interi separati da
*white-space* (spazio, a-capo…) e il flusso di uscita deve contenere solo una
sequenza di `*2` e `+1` separati da a-capo.


Esempio
-------

Eseguendo `soluzione` e avendo `10 130` nel flusso di ingresso, il programma
emette

    +1
    +1
    +1
    +1
    +1
    +1
    *2
    *2
    +1
    *2

nel flusso di uscita.


Suggerimenti
------------

Si osservi che se il secondo numero è dispari, oppure minore del doppio del
primo, l'ultima operazione da svolgere è per forza `+1`; se invece il secondo
numero è pari e non è minore del doppio del primo, si può dapprima raggiungere la metà
del secondo numero e quindi eseguire l'operazione `*2`.
