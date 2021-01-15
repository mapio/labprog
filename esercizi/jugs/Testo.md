Travasi
=======

Descrizione
-----------

Un *travaso* tra due bottiglie d'acqua è definito come l'operazione che versa
l'acqua contenuta dalla prima bottiglia nella seconda fino a quando,
eventualmente, la seconda bottiglia risulta piena, ma senza sprechi: cioè in
modo che la quantità totale di acqua contenuta nelle due bottiglie resti la
medesima prima e dopo il travaso.

Ad esempio, dopo un travaso da una bottiglia contenente 5l in una bottiglia di
capacità pari a 4l e contenente già 1l, la prima bottiglia conterrà 2l e la
seconda sarà piena. Similmente, dopo un travaso da una bottiglia contenente 2l
in una bottiglia vuota di capacità 3l, la prima bottiglia sarà vuota, mentre la
seconda conterrà 2l.

Scrivete un programma che, date tre bottiglie etichettate con `a`, `b` e `c` che
abbiano, rispettivamente, capacità di 11l, 7l e 5l e tali per cui la prima sia
colma e le altre vuote, e data una sequenza di travasi,  determini la quantità
d'acqua contenuta nelle tre bottiglie al termine dei travasi. Ciascun travaso è
specificato dalla coppia di etichette della bottiglia di partenza e arrivo.

Ad esempio, data la sequenza di travasi nel flusso di ingresso

    a c
    c b
    a b
    a c

il porgramma emette nel flusso di uscita

    0 7 4

infatti, a seguito del primo travaso, il contenuto delle bottiglie sarà 6 0 5
(poiché il travaso riempie la terza bottiglia, ma lascia 6l nella prima), quindi
6 5 0 (perché la seconda bottiglia ha capienza sufficiente a contenere tutta
l'acqua della terza), poi 4 7 0 (perché solo 2l possono passare dalla prima
bottiglia alla seconda, prima che sia piena) e infine `0 7 4`.


Vincoli
-------

La capacità delle bottiglie è fissata a 11l, 7l e 5l; viceversa non c'è
vincolo sul numero massimo di travasi, che terminano al terminare del flusso di
ingresso. Ogni travaso è specificato da una coppia di lettere scelte tra `a`,
`b` e `c`; le lettere nel flusso di ingresso sono separate tra loro da uno, o
più, *white-space* (spazi, a-capo, segni di tabulazione…). Nel flusso di
ingresso devono essere emessi tre numeri interi corrispondenti alla quantità di
liquido nelle tre bottiglie al termine dei travasi; i numeri devono essere
separati da un solo spazio ed essere tutti sulla stessa linea.


Esempio
-------

Eseguendo `soluzione` e avendo

     a c c b a c c b

nel flusso di ingresso, il programma emette

    1 7 3

nel flusso di uscita.
