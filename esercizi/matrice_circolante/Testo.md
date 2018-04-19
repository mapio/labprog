Matrice circolante
==================

Descrizione
-----------

Data una sequenza di `N` numeri interi

    a_1 a_2 ... a_(N-1) a_N

la sua "rotazione" è la sequenza

    a_N a_1 a_2 ... a_(N-1)

e la sua *matrice circolante* è la tabella di `N` x `N` numeri interi che ha
tale sequenza come prima riga e per cui ciascuna riga è una rotazione della
precedente.

Ad esempio, data la sequenza

    4 6 3 5

la sua matrice circolante è

    4 6 3 5
    5 4 6 3
    3 5 4 6
    6 3 5 4

Scrivere un programma che, data una sequenza di interi nel flusso di ingresso,
emetta la sua matrice circolante nel flusso di uscita.


Vincoli
-------

I numeri coinvolti sono rappresentabili con variabili di tipo `int`, inoltre la
sequenza ha un numero di elementi compreso tra 1 e 1000 estremi inclusi.

Su ciascuna riga, ogni numero dev'essere seguito da un solo spazio, ogni riga
dev'essere terminata da un solo *a-capo*.


Esempio
-------

Eseguendo `soluzione` e avendo `1 2 3` nel flusso di ingresso, il programma
emette nel flusso di uscita

    1 2 3
    3 1 2
    2 3 1
