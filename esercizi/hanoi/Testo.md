Hanoi
=====

Descrizione
-----------

Una leggenda narra che dei monaci in un tempio Indù siano costantemente
indaffarati a spostare (secondo precise regole) sessantaquattro dischi
impilandoli da una palo a un altro e che, al termine della loro opera, il
mondo finirà. In realtà, si tratta solo di una trovata pubblicitaria con cui è
stato presentato un rompicapo, chiamato *Torre di Hanoi*, inventato dal
matematico francese Edouard Lucas nel 1883.

Il rompicapo prevede che, dati alcuni dischi forati di dimensione crescente
impilati sul primo di tre pali, il giocatore li sposti sull'ultimo palo seguendo
le seguenti regole:

- ogni mossa consiste nello sfilare da un palo il disco più in alto e infilarlo
  sulla cima un altro palo,
- si può muovere un solo disco per volta,
- non si può mettere un disco sopra uno di dimensioni minori.

Si osserva facilmente che una mossa è completamente specificata dalla coppia di
pali di partenza ed arrivo (il disco da spostare è univocamente determinato dal
contenuto dei pali). Nel caso di due dischi, se i pali sono numerati da 0 a 2,
la soluzione del rompicapo è data dalla sequenza di mosse

    0 -> 1
    0 -> 2
    1 -> 2

che può essere "raffigurata" come segue

      *|*    |     |  
     **|**   |     |  
    ------------------

       |     |     |  
     **|**  *|*    |  
    ------------------

       |     |     |  
       |    *|*  **|**
    ------------------

       |     |    *|*
       |     |   **|**
    ------------------

Scrivete un programma che, dato il numero di dischi come intero nel flusso di
ingresso, emetta la sequenza di mosse che risolvono il rompicapo nel flusso
di uscita.


Vincoli
-------

Tutti i numeri coinvolti nel programma possono essere rappresentati con
variabili di tipo `int`. I pali sono numerati da 0 a 2, e i dischi vanno
spostati dal palo numero 0 al palo numero 2.  L'output deve contenere una mossa
per riga, con il numero del palo di partenza seguito da ` -> ` (compresi i due
spazi) e quindi dal numero del palo d'arrivo.


Esempio
-------

Eseguendo `soluzione` e avendo `3` nel flusso di ingresso, il programma emette

    0 -> 2
    0 -> 1
    2 -> 1
    0 -> 2
    1 -> 0
    1 -> 2
    0 -> 2

nel flusso di uscita; come è facile controllare, le mosse possono essere
raffigurate come segue e sono, in effetti, una soluzione del rompicapo

       *|*      |       |   
      **|**     |       |   
     ***|***    |       |   
    ------------------------

        |       |       |   
      **|**     |       |   
     ***|***    |      *|*  
    ------------------------

        |       |       |   
        |       |       |   
     ***|***  **|**    *|*  
    ------------------------

        |       |       |   
        |      *|*      |   
     ***|***  **|**     |   
    ------------------------

        |       |       |   
        |      *|*      |   
        |     **|**  ***|***
    ------------------------

        |       |       |   
        |       |       |   
       *|*    **|**  ***|***
    ------------------------

        |       |       |   
        |       |     **|**
       *|*      |    ***|***
    ------------------------

        |       |      *|*  
        |       |     **|**
        |       |    ***|***
    ------------------------


Suggerimenti
------------

Il compito di spostare N dischi dal palo A al palo B (usando il palo C come
appoggio) può essere ridotta al compito di spostare "temporaneamente" N-1
dischi dal palo A al palo C (usando il palo B come appoggio), seguito dallo
spostamento dell'ultimo disco rimasto dal palo A al palo B, seguito infine dallo
spostamento degli N-1 dischi temporaneamente infilati sul palo C al palo B
(usando il palo A come appoggio). Questa idea sembra suggerire una elementare 
soluzione ricorsiva.
