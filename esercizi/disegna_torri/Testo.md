Disegna delle torri
===================

Descrizione
-----------

Scrivete un programma che disegni delle *torri* di dimensione assegnata. Le
torri hanno la stessa larghezza e la stessa distanza l'una dall'altra, possono
invece avere altezze differenti.

Il programma riceve sulla linea di comando una sequenza di interi

    b d h₁ h₂ ...

con n >= 1 (quindi ci devono essere almeno 3 interi), dove:

- `b` è la misura della base delle torri,

- `d` è la distanza fra una torre e l'altra,

- `hᵢ` è l'altezza della *i*-esima torre.


Vincoli
-------

I parametri scritti sulla linea di comando sono interi maggiori di 0.


Esempio
-------

Eseguendo `soluzione 3 4 2 10 4 7 6 3` il programma emette

           ***
           ***
           ***
           ***           ***
           ***           ***    ***
           ***           ***    ***
           ***    ***    ***    ***
           ***    ***    ***    ***    ***
    ***    ***    ***    ***    ***    ***
    ***    ***    ***    ***    ***    ***

Ciascuna torre ha base di lunghezza `3` e la distanza fra una torre e l'altra è di `4` spazi.
Le altezze delle torri sono rispettivamente `2`, `10`, `4`, `7`, `6`, `3`.

Non vanno inoltre stampate linee vuote, o che contengano solo spazi.
