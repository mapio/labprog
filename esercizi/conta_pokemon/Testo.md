Conta i pokemon "Kenny"
=======================

Descrizione
-----------

Scrivete uno script (ossia create un file di nome `soluzione.sh`) che contenga
la corretta invocazione dei comandi necessari affinché, dato nel flusso di
ingresso un elenco di nomi di pokemon, emetta quante volte vi compare il nome
"Kenny".

Esempio
-------

Se il flusso di ingresso contiene

    Kenny
    Saagar
    Karen
    Saagar
    Kenny

eseguendo

    bash soluzione.sh

viene emesso

    2

nel flusso di uscita, infatti sebbene ci siano 5 nomi di pokemon nel flusso
di ingresso, solo 2 corrispondono a "Kenny".

Suggerimenti
------------

Il comando `grep`, data una parola come parametro sulla linea di comando, emette
nel flusso di uscita tutte e sole le linee del flusso di ingresso che contengono
quella parola. Ad esempio, eseguendo

    grep Kenny

e avendo nel flusso di ingresso

    Karen
    Kenny
    Saagar
    Kenny

verrà emesso

    Kenny
    Kenny

nel flusso di uscita.

Ricordate poi che la **pipeline** `|` consente di dare in ingresso a un comando
l'output di un'altro. Ad esempio, eseguendo

    primo | secondo

il flusso di ingresso sarebbe inviato a `primo` e il flusso di uscita di `primo`
sarebbe dato in pasto a `secondo` che, infine, emetterebbe il risultato della
sequenza di elaborazioni nel flusso di uscita.
