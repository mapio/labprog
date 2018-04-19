Dentro al cerchio
=================

Descrizione
-----------

Dato un intero positivo `k` si consideri il settore circolare dato
dall'intersezione tra il cerchio di raggio `k` centrato nell'origine ed il primo
quadrante del piano cartesiano. Una raffigurazione approssimativa di tale
insieme è data da:

          |
    (0, k)|....
          |     '-..
          |         '-.
          |            '.
          |              '\
          |                `
          |                 `.
          |                  \
          |                   |
          |                   |
          +----------------------
         O                   (k, 0)

Scrivete un programma che, dato `k` come argomento sulla linea di comando ed una
sequenza di coordinate (espresse come coppie di interi) nel flusso di ingresso
conti quante di esse corrispondano a punti contenuti strettamente nella figura
definita come sopra (ed emetta tale numero nel flusso di uscita). Non vanno
contati i punti appartenenti alla circonferenza, o agli assi.


Vincoli
-------

Potete assumere che tutti i numeri coinvolti possano essere rappresentati come
variabili di tipo `int`; non si può assumere alcun vincolo sul numero di coppie
presenti nel flusso di ingresso.


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
dentro al settore circolare, mentre gli ultimi due no).


Suggerimenti
------------

Si ricorda che l'equazione della circonferenza centrata nell'origine ed avente
raggio `k` è

    x² + y² = k²

e quindi che per determinare se un punto è interno alla circonferenza non serve
estrarre radici quadrate.
