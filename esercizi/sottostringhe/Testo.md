Sottostringhe
=============

Descrizione
-----------

Una stringa `S`  è una *sottostringa* di una stringa `T` se e solo se si può
ottenere cancellando uno o più caratteri di  `T`. Ad esempio, le sottostringhe
di lunghezza `3` di `cane` sono: `can`, `cae`, `cne`, `ane`.

Scrivete un programma che, data una stringa `T` e una lunghezza `N` come
argomenti sulla linea di comando, emetta nel flusso di ingresso tutte e sole le
sottostringhe distinte `S` di lunghezza `N` di `T` in ordine alfabetico.


Vincoli
-------

La lunghezza della stringa `T` e la lunghezza `N` sono tali per cui tutte le
sottostringhe di `T`  di lunghezza `N` possono essere contenute in memoria
centrale.

Il flusso di uscita deve contenere una sottostringa per linea, le
sottostringhe devono essere distinte (non ci devono essere linee uguali) e le
linee devono essere in ordine alfabetico.


Esempio
-------

Eseguendo `soluzione cassa 3` il programma emette

    asa
    ass
    caa
    cas
    csa
    css
    ssa

nel flusso di uscita.

Suggerimenti
------------

Al fine di evitare i duplicati ed emettere le sottostringhe in ordine alfabetico
potete raccoglierle man mano in un `java.util.TreeSet<String>` a cui potete
aggiungere le sottostringhe col metodo `add` e che potete iterare con un
costrutto *for-each*.
