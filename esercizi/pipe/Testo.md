Acquedotto
==========

Descrizione
-----------

Un *acquedotto* di dimensione `N` è una quadrato di lato 2 * N + 1 composto dai
caratteri `━`, `┃`, `┓`, `┏`, `.`, `┛` e `┗` corrispondenti, rispettivamente, a:
un *tubo* orizzontale, uno verticale, due curve "alte", uno *spazio* e due curve
"basse". La *descrizione* di un acquedotto è una stringa costituita dai
caratteri `a`, `s` e `g` corrispondenti, rispettivamente, alle *direzioni*:
"avanti", "su" e "giù"; tra le direzioni "su" e "giù" è sempre compresa almeno
una volta la direzione "avanti" (mentre ogni direzione può essere ripetuta,
senza cambiare, un numero arbitrario di volte).

Data la dimensione e la descrizione di un acquedotto, esso può essere
*disegnato* come segue: si inizia da un quadrato pieno di spazi e si posiziona
il primo tubo sulla prima colonna e alla riga centrale, assumendo che a sinistra
dell'acquedotto il tubo a cui collegarsi sia orizzontale. Poi, seguendo le
direzioni della descrizione, si posizionano gli altri tubi in modo che si
raccordino.

Ad esempio, un acquedotto di dimensione `2` con descrizione `asagaagga` si
disegna come segue

    .....
    .┏┓..
    ━┛┗━┓
    ....┃
    ....┗

al primo tubo orizzontale (direzione "avanti") segue una curva verso l'alto
(direzione "su") e una curva a destra (direzione "avanti") e poi verso il basso
(direzione "giù") quindi una curva a sinistra e un tubo orizzontale (due
direzioni "avanti") quindi una curva verso il basso e un tubo verticale (due
direzioni "giù") e, infine, un tubo orizzontale (direzione "avanti").

Scrivete un programma che, data la dimensione e la descrizione di un acquedotto
come argomenti sulla linea di comando, emetta il suo disegno nel flusso
di uscita.


Vincoli
-------

La dimensione dell'acquedotto è tale per cui una matrice quadrata con una
dimensione pari a 2 * N + 1 possa essere contenuta in memoria. La descrizione
dell'acquedotto è tale per cui esso non eccede mai i limiti dati dalla sua
dimensione — detto altrimenti, i tubi sono tutti contenuti nel quadrato
iniziale.


Esempio
-------

Eseguendo `soluzione 1 as` il programma emette

    ...
    ━┛.
    ...

nel flusso di uscita, eseguendo `soluzione 1 ag` il programma emette

    ...
    ━┓.
    ...

nel flusso di uscita, eseguendo `soluzione 1 agasa` il programma emette

    ...
    ━┓┏
    .┗┛

nel flusso di uscita, eseguendo `soluzione 1 asaga` il programma emette

    .┏┓
    ━┛┗
    ...

nel flusso di uscita.


Suggerimenti
------------

Qualora non riusciate a copiare da questo testo i caratteri corrispondenti ai
tubi, potete usare i letterali Unicode seguenti:

    '\u250F'
    '\u2513'
    '\u2517'
    '\u251B'
    '\u2501'
    '\u2503'
