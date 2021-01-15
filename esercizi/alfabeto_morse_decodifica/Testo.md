Alfabeto Morse: Decodifica
==========================

Descrizione
-----------

Il codice Morse, inventato da Samuel Finley Breese Morse nel 1836, è un modo di
tradurre l'insieme di lettere dell'alfabeto e delle cifre decimali in sequenze
di due soli simboli (punto e linea):

    A .-
    B -...
    C -.-.
    D -..
    E .
    F ..-.
    G --.
    H ....
    I ..
    J .---
    K -.-
    L .-..
    M --
    N -.
    O ---
    P .--.
    Q --.-
    R .-.
    S ...
    T -
    U ..-
    V ...-
    W .--
    X -..-
    Y -.--
    Z --..

Inizialmente usato per le trasmissioni col telegrafo a filo e radiofonico, resta
un interessante esempio di codifica, anche se oggi è usato ormai solo in
contesti amatoriali.

Ovviamente, è possibile estendere la codifica delle singole lettere  parole di
più lettere semplicemente sostituendo ordinatamente a ciascuna lettera, o cifra,
la sua codifica — ma mantenendo separate le sequenze di punti e linee tra loro.

Scrivete un programma che, dato un testo nel flusso di ingresso in codice Morse,
emetta la sua decodifica nel flusso di uscita.

Ad esempio, su input

    -... . .-.. .-.. .-   --.- ..- . ... - .-  --. .. --- .-. -. .- - .-

il programma emette

    BELLAQUESTAGIORNATA


Vincoli
-------

Il testo in ingresso è contenuto su una sola linea ed è composto solo di punti o
linee; le parole del codice sono separate da un singolo spazio; il testo
decodificato deve contenere solo lettere maiuscole (terminate da un a-capo,
senza spazi).


Esempio
-------

Eseguendo

    soluzione

e avendo

    ... .--. . .-. .. .- -- ---  ...- .- -.. .-  -... . -. .  --.- ..- . ... - .-  ...- --- .-.. - .-

nel flusso di ingresso, il programma emette

    SPERIAMOVADABENEQUESTAVOLTA

nel flusso di uscita.
