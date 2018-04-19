Display
=======

Descrizione
-----------

Scrivete un programma che, dato un elenco di parole come argomenti sulla linea
di comando, emetta nel flusso di uscita una *visualizzazione* di tali parole
emettendone ogni lettera secondo la seguente *visualizzazione* delle singole lettere

    ____ ___  ____ ___  ____ ____ ____ _  _
    |__| |__] |    |  \ |___ |___ | __ |__|
    |  | |__] |___ |__/ |___ |    |__] |  |
    _  _ _  _ _    _  _ _  _ ____ ___  ____
    |  | |_/  |    |\/| |\ | |  | |__] |  |
    | _| | \_ |___ |  | | \| |__| |    |_\|
    ____ ____ ___ _  _ _  _ _ _ _ _  _ _   _ ___
    |__/ [__   |  |  | |  | | | |  \/   \_/    /
    |  \ ___]  |  |__|  \/  |_|_| _/\_   |    /__

Ad esempio, le parole `salve mondo` sono visualizzate come

    ____ ____ _    _  _ ____   _  _ ____ _  _ ___  ____
    [__  |__| |    |  | |___   |\/| |  | |\ | |  \ |  |
    ___] |  | |___  \/  |___   |  | |__| | \| |__/ |__|

come si osserva, non viene fatta distinzione tra maiuscole e minuscole.


Vincoli
-------

C'è sempre almeno un parametro sulla linea di comando e ciascun parametro è
costituito solo da lettere minuscole. Il flusso di uscita deve contenere solo i
caratteri necessari a visualizzare le lettere; in particolare, lo spazio tra due
lettere è preservato, ossia visualizzato come una colonna di uno spazio, mentre
lo spazio tra parole è visualizzato come una colonna di tre spazi.


Esempio
-------

Eseguendo

    soluzione bravo chi legge

il programma emette

    ___  ____ ____ _  _ ____   ____ _  _ _   _    ____ ____ ____ ____
    |__] |__/ |__| |  | |  |   |    |__| |   |    |___ | __ | __ |___
    |__] |  \ |  |  \/  |__|   |___ |  | |   |___ |___ |__] |__] |___

nel flusso di uscita.


Suggerimenti
------------

Per memorizzare il carattere `\` in una stringa Java è necessario farne
l'*escape*, ossia prefissarlo con `\`, altrimenti detto `"\"` non è un letterale
stringa valido, ma lo è `"\\"` e, stampandolo, verrà emesso `\`.

Le visualizzazioni delle lettere possono essere memorizzate in un array di
quattro stringhe (ciascuna contenente una riga della visualizzazione); le
lettere possono essere "ritagliate" da tale vettore a patto di conoscere la
"larghezza" di ciascuna lettra (che può essere memorizzata in un vettore di
interi).
