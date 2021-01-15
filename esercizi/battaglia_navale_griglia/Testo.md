Battaglia navale, Griglia
=========================

Descrizione
-----------

Questo è il terzo esercizio di una serie il cui obiettivo è sviluppare un
insieme di *classi* che rappresentino lo svolgimento di una partita a *battaglia
navale*. Prima di iniziare, recuperate i sorgenti della classe `Posizione` e
`Nave` degli esercizi precedenti e copiateli in questa directory.

Scopo di questo esercizio è implementare la classe `Griglia` che rappresenti un
insieme di navi in una fase del gioco; tale classe (per cui sarà sufficiente il
costruttore implicito) deve implementare:

* il metodo con segnatura

      public boolean aggiungi(Nave nuova)

  che aggiunge la `nuova` nave alla griglia e restituisce `true` se e solo essa
  non interseca nessuna delle navi già presenti sulla griglia, altrimenti lascia
  immutata la griglia e restituisce `false`;

* il metodo con segnatura

      public boolean occupata(Posizione posizione)

  che restituisce `true` se e solo se la `posizione` specificata è occupata da
  una delle navi sulla griglia;

* il metodo con segnatura

      public void colpisci(Posizione posizione)

  che, qualora la `posizione` specificata sia occupata da una nave, la colpisca
  dove specificato;

* il metodo con segnatura

      public boolean colpita(Posizione posizione)

  che, se la `posizione` specificata è occupata da una nave, restituisce `true`
  se e solo la nave è stata colpita dove specificato;

* il metodo con segnatura

      public boolean affondata(Posizione posizione)

  che, se la `posizione` specificata è occupata da una nave, restituisce `true`
  se e solo se tale nave è stata affondata;

* il metodo con segnatura

      public boolean tutteAffondate()

  che restituisce `true` se e solo se tutte le navi sulla griglia sono state
  affondate.

Infine, la classe deve *sovrascrivere* il metodo `toString` in modo tale che la
stringa che rappresenta una griglia sia data da una matrice `10` x `10` di
caratteri scelti tra `.`, `#`  e `*` corrispondenti rispettivamente ad una
posizione non occupata, occupata e colpita.

### La classe di test

La classe `TestRunner` (fornita assieme a questo testo e che **non deve essere
modificata**), popola la griglia con una serie di navi specificate nel flusso di
ingresso e quindi procede a colpire sistematicamente tutte le posizioni
verificando che il numero di posizioni colpite e affondate sia coerente con il
numero di posizioni occupate e che la griglia riporti correttamente
l'affondamento di tutte le navi.


Vincoli
-------

La `posizione` che compare come parametro dei metodi di questa classe può
corrispondere a qualunque posizione valida (ossia che abbia riga e colonna
comprese tra `0` e `9` estremi inclusi).


Esempio
-------

Eseguendo `soluzione` e avendo

    C3:1:V
    B4:2:O

nel flusso di ingresso, il programma emette

    Occupate: 3, libere: 97, colpite: 3, affondate: 3.

nel flusso di uscita.
