Parole inverse
==============

Descrizione
-----------

Una parola è inversa di un altra se, leggendo la prima parola dall'ultimo al
primo carattere, si ottiene la seconda. Esempi di coppie di parole inverse sono:

    asso ossa
    avara arava
    acetone enoteca
    uno onu
    otto otto

Scrivete un programma che, date due parole come argomenti sulla riga di comando,
emetta nel flusso di uscita `si` se e solo se la prima parola è inversa della
seconda„


Vincoli
-------

La parole contengono solamente i caratteri

    a, b, c, ..., x, y, z

corrispondenti alle lettere minuscole dell'alfabeto.

Il flusso di uscita deve contenere `si`, oppure essere vuoto.


Esempio
-------

Eseguendo `soluzione enoteca acetone` il programma emette `si` nel flusso di
uscita, mentre eseguendo `soluzione java ava` il programma non emette nulla.
