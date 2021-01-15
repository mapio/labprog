Suffisso di una sequenza
========================

Descrizione
-----------

Una sequenza di parole è un *suffisso proprio* di un'altra quando si può
ottenere cancellando una, o più, parole (intere) dall'inizio dell'altra.

Ad esempio

    mamma mia

è suffisso proprio di

    ciao mamma mia

perché si può ottenere cancellando `ciao` da `ciao mamma mia`; viceversa

    bella zio

non è suffisso di

    ciao raga

perché non si può ottenere cancellando parole da `ciao raga`.

Osservate che quel che contano sono le parole, non i singoli caratteri:

    un cane puzzolente

non è un suffisso di

    alcun cane puzzolente

perché non si può ottenere `un` cancellando una parola intera da quest'ultima
sequenza.

In fine,

    pizza e fichi

non è suffisso proprio di

    pizza e fichi

perché, essendo uguale, non si può ottenere cancellando alcuna parola.

Scrivete un programma che date due sequenze di parole su due linee successive
nel flusso di ingresso comando emetta `suffisso` nel flusso di uscita se la
sequenza sulla prima linea è suffisso proprio di quella sulla seconda, o non
emetta nulla in caso contrario.


Vincoli
-------

Per parola si intende una sequenza massimale di caratteri che non contiene lo
spazio. Non è garantito che la prima sequenza contenga meno parole della
seconda. Il flusso di ingresso contiene due linee, su ciascuna linea le parole
sono separate da spazi (non necessariamente uno solo). Le linee sono lunghe al
più 1024 caratteri.


Esempio
-------

Eseguendo `soluzione` d avendo

    mamma mia
    ciao mamma    mia

nel flusso di ingresso, il programma emette `suffisso` nel flusso di uscita,
mentre eseguendo `soluzione` e avendo

    bella    zio
    ciao raga

nel flusso di ingresso, il programma non emette nulla nel flusso di uscita.
