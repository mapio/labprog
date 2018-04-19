Parole in numeri
================

Descrizione
-----------

Scrivere un programma che legge dal flusso di ingresso una sequenza di linee
contenenti una parola ciascuna ed emette nel flusso di uscita una sequenza di
linee contenenti ciascuna una sequenza di interi ottenuti sostituendo i
caratteri delle parole in ingresso secondo le seguenti regole:

1) ad ogni lettera è associato un unico numero intero positivo, lettere
   diverse sono associate a numeri diversi;

2) l'associazione fra lettera e numero è determinato dall'ordine in cui le
   lettere compaiono, due lettere diverse che compaiono una dopo l'altra
   corrispondono a numeri consecutivi, la prima lettera corrisponde al
   numero 1.

Ad esempio, supponiamo che la prima parola sia

    zafferano

- la prima lettera è `z` a cui viene associato il numero `1`; questo significa
  che tutte le `z` che compaiono eventualmente nelle parole della sequenza
  vanno sostituite con `1`;

- la seconda lettera è `a` a cui va associato il numero `2`,

- la terza lettera è `f` a cui va associato il numero `3`,

- la quarta lettera è `f` a cui è già stato associato il numero `3`,

- la quinta lettera è `e` a cui va associato il numero `4`.

La trascrizione procede analogamente fino al termine della parola e procede
per tutte le parole successive.


Vincoli
-------

La parole in ingresso contengono solamente i caratteri

    a, b, c, ..., x, y, z

corrispondenti alle lettere minuscolo dell'alfabeto ed hanno lunghezza massima
di 256 caratteri. Ogni linea del flusso di ingresso contiene una sola parola,
mentre il numero di parole è arbitrario.

Ogni linea del flusso di uscita corrisponde alla trascrizione in numeri della
rispettiva parola letta dal flusso di ingresso. I numeri su ciascuna linea
devono essere separati da uno ed un solo spazio.

Esempio
-------

Eseguendo il programma `soluzione` avendo nel flusso di ingresso

    zafferano
    riso
    cipolla
    burro

viene emesso nel flusso di uscita

    1 2 3 3 4 5 2 6 7
    5 8 9 7
    10 8 11 7 12 12 2
    13 14 5 5 7
