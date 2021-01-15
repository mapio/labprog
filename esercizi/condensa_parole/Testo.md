Condensa parole
===============

Descrizione
-----------

Le tecniche di compressione sfruttano la ridondanza per rappresentare certe
informazioni in modo più succinto, talvolta a scapito della fedeltà, o
precisione, della rappresentazione.

Consideriamo una tecnica per comprimere una sequenza di parole, in cui vengono
*condensate* due parole successive se la prima finisce con una sequenza di
caratteri con cui inizia la seconda; ad esempio, la sequenza di parole

    carta tagliata e matita spezzata

si può comprimere nella sequenza

    cartagliata e matita spezzata

dove le parole `carta` e `tagliata` sono state condensate nella parola
`cartagliata` perché iniziano e finiscono, rispettivamente, con `ta`.

Ovviamente è più difficile comprendere il senso, sopratutto se vengono
condensate più parole, come in

    panero solito venderettamente

che è la versione compressa di

    pane nero ero solito vendere rettamente

dove `panero` è la parola ottenuta condensando le parole `pane`, `nero` ed
`ero`.

Scrivete un programma che, data una sequenza di parole come argomenti sulla
linea di comando, emetta nel flusso di uscita la sequenza di parole compresse per
condensazione.


Vincoli
-------

Le parole sono costituite dalle lettere dell'alfabeto minuscolo; nel flusso
di uscita ogni parola (eventualmente condensata) va separata dalla successiva con
un solo spazio, e la sequenza di parole dev'essere terminata da un segno di
a-capo.


Esempio
-------

Eseguendo

    soluzione udire reali cantare un poema maestoso

il programma emette nel flusso di uscita

    udireali cantare un poemaestoso

Eseguendo

    soluzione caro romantico cosacco ti invita tamara

il programma emette nel flusso di uscita

    caromanticosacco tinvitamara
