Censura le più lunghe
=====================

Descrizione
-----------

Data una sequenza di parole chiameremo *censura* di *taglia* `N` la sequenza di
parole ottenuta da essa sostituendo i caratteri delle parole più lunghe di `N`
caratteri con una sequenza di caratteri `#`.

Ad esempio, la censura di taglia `4` della sequenza

    il mio nome   e buffalo bill

corrisponde a

    il mio nome   e ####### bill

mentre la censura di taglia `3` è

    il mio ####   e ####### ####

Scrivete un programma che, dato un intero `N` come parametro sulla linea di
comando ed una sequenza di parole (lettere separate da spazi) nel flusso di
ingresso emetta la sua censura di taglia `N`.


Vincoli
-------

Il flusso di ingresso contiene lettere minuscole e spazi, le parole sono
separate tra loro da uno (o più) spazi bianchi; il flusso di ingresso è lungo al
più 1024 caratteri e terminato dal carattere *a-capo* (ossia occupa solo una
linea).

Il flusso di uscita deve rispettare gli spazi, ad esempio: se due parole nel
flusso di ingresso sono separate da tre spazi, le stesse parole (eventualmente
censurate), dovranno essere separate da tre spazi anche nel flusso di uscita.


Esempio
-------

Eseguendo `soluzione 5` e avendo

    il mio  nome e buffalo    bill

nel flusso di ingresso, il programma emette

    il mio  nome e #######    bill

nel flusso di uscita.
