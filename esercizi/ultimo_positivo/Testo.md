Ultima giornata positiva
========================

Descrizione
-----------

Scopo del programma è individuare l'ultimo numero del giorno dell'anno in cui il
mercato ha chiuso con un valore positivo, a partire dai dati sulle chiusure
giornalire.

Più precisamente: dati 365 numeri interi nel flusso di ingresso, indicanti il
valore di chiusura del mercato per ogni giorno dell'anno, il programma deve
emettere nel flusso di uscita il numero dell'ulitmo giorno in cui tale valore è
positivo.


Vincoli
-------

I valori di chiusura per giorno posso essere rappresentati da una variabile di
tipo `int`, è garantito che ci sia almeno un giorno in cui la chiusura è stata
positiva ed uno in cui è stata negativa. I giorni dell'anno sono numerati da 1 a
365.


Esempio
-------

Invocando il programma `soluzione` e nel flusso di ingresso è presente la
sequenza di interi

    -4
    12
    3
    -6
    5
    3
    5
    -9
    -8
    2
    3
    4
    7
    -3
    -2

seguita dal numero `0` ripetuto 350 volte, il programma emette il numero

    13

nel flusso di uscita, che corrisponde al giorno in cui il mercato ha chiuso al
valore `7` e dopo il quale il mercato ha sempre chiuso con valori negativi.


Suggerimenti
------------

Il flusso di ingresso può essere letto tramite un ciclo che esegua esattamente
365 iterazioni (e legga un intero per ciascuna iterazione).
