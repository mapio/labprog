Numeri fortunati
================

Descrizione
-----------

Si consideri il seguente *crivello*, ossia procedura, per ottenere, a partire
dalla sequenza dei numeri interi positivi, la sottosequenza dei numeri
cosiddetti *fortunati*. A partire da

    1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25

si proceda dapprima cancellando i numeri di posizione multipla di `2`, ottenendo

    1 3 5 7 9 11 13 15 17 19 21 23 25

da cui si rimuovano i numeri di posizione multipla di `3` (il secondo numero tra
quelli rimasti), ottenendo

    1 3 7 9 13 15 19 21 25

e si proceda in modo analogo, rimuovendo ora i numeri di posizione multipla di
`7` (terzo numero tra quelli rimasti), ottenendo

    1 3 7 9 13 15 21 25

a questo punto, i numeri tra `1` e `25` non possono essere rimossi (dovremmo
procedere, nel caso, a rimuovere i numeri il cui posizione è multipla di `9`, ma
ne sono rimasti solo otto).

Scrivete un programma che, dato `N` come parametro sulla linea di comando,
emetta nel flusso di uscita tutti e soli i numeri felici (strettamente) minori
di `N`.


Vincoli
-------

Tutti i numeri coinvolti nel programma possono essere rappresentati con
variabili di tipo `int` e il parametro `N` è al più pari a 10000.


Esempio
-------

Eseguendo `soluzione 50` il programma emette
	
	1 3 7 9 13 15 21 25 31 33 37 43 49

nel flusso di uscita. Eseguendo `soluzione 1000` il programma emette

    1 3 7 9 13 15 21 25 31 33 37 43 49 51 63 67 69 73 75 79 87 93 99 105 111 115 127
    129 133 135 141 151 159 163 169 171 189 193 195 201 205 211 219 223 231 235 237
    241 259 261 267 273 283 285 289 297 303 307 319 321 327 331 339 349 357 361 367
    385 391 393 399 409 415 421 427 429 433 451 463 475 477 483 487 489 495 511 517
    519 529 535 537 541 553 559 577 579 583 591 601 613 615 619 621 631 639 643 645
    651 655 673 679 685 693 699 717 723 727 729 735 739 741 745 769 777 781 787 801
    805 819 823 831 841 855 867 873 883 885 895 897 903 925 927 931 933 937 957 961
    975 979 981 991 993 997

nel flusso di uscita.
