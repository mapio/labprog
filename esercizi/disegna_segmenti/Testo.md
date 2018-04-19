Disegna segmenti
================

Descrizione
-----------

Il programma deve disegnare una serie di segmenti orizzontali e verticali
utilizzando i caratteri `+`, `-` e `|` (più eventualmente il carattere spazio)
in una matrice di lato assegnato.

Ogni segmento è specificata da quattro valori:

-) un carattere, che può essere `O`, o `V` che indica se il segmento è
   rispettivamente *orizzontale*, o *verticale*;
-) una coppia di interi che rappresentano *riga* e *colonna* da cui il segmento
   ha origine;
-) un intero che rappresenta la *lunghezza* (in caratteri) del segmento.

Ad esempio, se il lato della matrice fosse `4` e venissero specificati i tre
segmenti

    V 0 0 2
    O 2 0 8
    V 1 2 3

la matrice risultante (qui riprodotta con una cornice di caratteri `#`) sarebbe

    ######
    #|   #
    #| | #
    #--+-#
    #  | #
    ######

si osservi che solo il carattere di riga 2 e colonna 2 è un `+` corrispondente
all'incrocio dei segmenti `O 2 0 8` e `V 1 2 3`, mentre il carattere di riga 2
e colonna 0 è un `-` in quanto non corrisponde ad un incrocio, ma appartiene
solamente al segmento `O 2 0 8`. Si osservi inoltre che, dato che il segmento
orizzontale ha lunghezza tale da non poter essere contenuto interamente nella
matrice, ne è stata disegnata solo una parte.

Si chiede di realizzare un programma che, specificata la dimensione della
matrice come argomento sulla linea di comando e date le specifiche dei segmenti
nel flusso di ingresso emetta nel flusso di uscita la matrice risultate
(racchiusa, come nell'esempio precedente, da una cornice di `#`).

Vincoli
-------

Il lato della matrice è pari al massimo a 1000. Non ci sono vincoli sul numero
dei segmenti.

Non ci sono vincoli sulla lunghezza dei segmenti (che può, in particolare,
eccedere le dimensioni della matrice); la riga e colonna da cui un segmento ha
origine, viceversa, sono sempre contenute nella matrice.

Esempio
-------

Eseguendo `soluzione 4` e avendo nel flusso di ingresso

    V 0 0 2
    O 2 0 8
    V 1 2 3

viene emesso nel flusso di uscita

    ######
    #|   #
    #| | #
    #--+-#
    #  | #
    ######
