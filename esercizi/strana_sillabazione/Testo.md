La strana sillabazione
======================

Descrizione
-----------

Si consideri un ipotetico metodo di sillabazione secondo cui una sillaba è la
più lunga sequenza di caratteri consecutivi che rispettano l'ordine alfabetico.

Per esempio, la parola

    ambire

viene sillabata come

    am-bir-e

infatti la lettera `a` precede la lettera `m` nell'ordine alfabetico, le lettere
`b`, `i` e `r` rispettano anch'esse l'ordine alfabetico, ma `b` viene prima di
`m` e `e` viene prima di `r`.

Scrivere un programma che, ricevendo una parola nel flusso di ingresso, emetta
nel flusso di uscita la parola sillabata secondo tale metodo.


Vincoli
-------

Potete assumere che la parola data sia costituita solo dalle lettere minuscole

    a, b, ..., x, y, z


Esempio
-------

Eseguendo `soluzione` e avendo `sotterfugio`, o `amore`, o `medicina`, o
`scafroglia` nel flusso di ingresso, emette rispettivamente `s-ott-er-fu-gio`, o
`amor-e`, o `m-e-di-cin-a`, o `s-c-afr-o-gl-i-a` nel flusso di uscita.
