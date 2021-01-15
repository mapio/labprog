Tanto sole
==========

Descrizione
-----------

Data una sequenza di lettere uguali a `P` o `S` (indicanti rispettivamente un
giorno di pioggia, o di sole) chiameremo *periodo di sole* una sottosequenza di
lettere `S` in cui non compaia la lettara `P` e chiameremo *durata* il numero di
lettere `S` di cui è composta.

Scrivere un programma che, data una sequenza di 365 lettere `P` o `S` nel flusso
di ingresso, emetta nel flusso di uscita il numero che corrisponde alla più
lunga durata di un periodo di sole in essa contenuto.


Vincoli
-------

Il flusso di ingresso contiene solo lettere `P`, `S` ed eventualmente il
carattere di *a-capo*.


Esempio
-------

Eseguendo `soluzione` e avendo nel flusso di ingresso

    PSSPSSSPSPPPPPSSSSSSSSSSPPPPPPPPPP...PSSPPP

(dove i ... corrispondono a 325 lettere `P`) il programma emette `10` nel flusso
di ingresso.
