Ultimo giorno di pioggia
========================

Descrizione
-----------

Scopo del programma è individuare l'ultimo numero del giorno dell'anno in cui ha
piovuto, a partire dai dati sulle precipitazioni giornalire.

Più precisamente: dati 365 numeri interi positivi nel flusso di ingresso,
indicanti il numero di millimetri di pioggia caduti per ogni giorno dell'anno,
il programma deve emettere nel flusso di uscita il numero dell'ulitmo giorno in
cui abbia piovuto (ossia in cui i millimetri di pioggia siano un numero diverso
da zero).


Vincoli
-------

I millimetri di pioggia per giorno posso essere rappresentati da una variabile
di tipo `int`, è garantito che ci sia almeno un giorno in cui ha piovuto ed uno
in cui non ha piovuto. I giorni dell'anno sono numerati da 1 a 365.


Esempio
-------

Invocando il programma `soluzione` e nel flusso di ingresso è presente la
sequenza di interi

    0
    12
    3
    0
    5
    3
    5
    0
    0
    2
    3
    4
    7
    0
    0

seguita dal numero `0` ripetuto 350 volte, il programma emette il numero `13`
nel flusso di uscita, che corrisponde al giorno in cui sono piovuti `7`mm di
pioggia e dopo il quale non ci sono più state precipitazioni.


Suggerimenti
------------

Il flusso di ingresso può essere letto tramite un ciclo che esegua esattamente
365 iterazioni (e legga un intero per ciascuna iterazione).
