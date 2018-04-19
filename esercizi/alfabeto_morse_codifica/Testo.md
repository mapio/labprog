Alfabeto Morse: Codifica
=======================

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

Ovviamente, è possibile estendere la codifica delle singole lettere a parole di
più lettere semplicemente sostituendo ordinatamente a ciascuna lettera, o cifra,
la sua codifica — ma mantenendo separate le sequenze di punti e linee tra loro.

Scrivete un programma che, dato un testo nel flusso di ingresso, emetta la sua
codifica Morse nel flusso di uscita.

Il testo può contenere ogni tipo di carattere, prima di procedere alla codifica
sarà pertanto necessario convertire le lettere minuscole in maiuscole e quindi
"scartare" ogni carattere del testo originale cui non corrisponda alcun codice
Morse (in particolare, questo vale anche per lo spazio e le cifre decimali).

Ad esempio, su input

    Bella, questa giornata!

il programma emette

    -... . .-.. .-.. .-   --.- ..- . ... - .-  --. .. --- .-. -. .- - .-


Vincoli
-------

Il testo in ingresso termina all'EOF, non è nota la sua lunghezza massima (o se
sia contenuto su una sola linea); le sequenze di punti e linee corrispondenti a
ciascuna lettera nel testo in uscita devono essere separate da un singolo spazio
ed essere tutte sulla stessa riga (che deve pertanto concludersi con un . o un -
seguiti immediatamente dal segno di *a-capo*, senza spazio tra esso e l'ultimo
simbolo).


Esempio
-------

Eseguendo `soluzione` e avendo

    Speriamo vada
    bene questa volta!

nel flusso di ingresso, il programma emette

    ... .--. . .-. .. .- -- ---  ...- .- -.. .-  -... . -. .  --.- ..- . ... - .-  ...- --- .-.. - .-

nel flusso di uscita.


Osservazioni
------------

Il codice Morse non è un codice *prefisso*, ossia non è possibile decodificarlo
se le lettere codificate non sono separate da spazi. Sapreste spiegare perché?
