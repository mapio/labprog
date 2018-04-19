Dentro al triangolo
===================

Descrizione
-----------

Dato un intero positivo `k` si consideri il triangolo delimitato sul primo
quadrante del piano cartesiano dagli assi e dalla retta `x + y = k`, ossia il
triangolo rettangolo isoscele avente per cateti i segmenti staccati sugli assi
dall'origine e dai punti (0, `k`) e (`k`, 0). Una raffigurazione approssimativa di
tale triangolo è data da:

          |
          |
    (0, k)|\
          | \
          |  \
          |   \
          +----------
         O   (k, 0)

Scrivete un programma che, dato `k` come argomento sulla linea di comando ed una
sequenza di coordinate (espresse come coppie di interi, una per linea) nel
flusso di ingresso conti il numero di esse che corrispondono a punti contenuti
strettamente nel triangolo definito come sopra (ed emetta tale numero nel
flusso di uscita). Non vanno contati i punti appartenenti ai lati del
triangolo.


Vincoli
-------

Potete assumere che tutti i numeri coinvolti possano essere rappresentati come
variabili di tipo `int`; non si può viceversa assumere alcun vincolo sul numero
totale di coppie presenti nel flusso di ingresso.


Esempio
-------

Eseguendo il programma `soluzione 10` e avendo nel flusso di ingresso

    1 1
    2 2
    2 1
    1 2
    10 10
    0 0

il programma emette `4` nel flusso di uscita (infatti i primi quattro punti sono
dentro il triangolo, mentre l'ultimo no).
