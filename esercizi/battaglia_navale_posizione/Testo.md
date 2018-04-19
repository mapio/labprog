Battaglia navale, Posizione
===========================

Descrizione
-----------

Scopo di questa serie di esercizi è sviluppare un insieme di *classi* che
rappresentino lo svolgimento di una partita a *battaglia navale*.

Ciascuno di questi esercizi chiede di sviluppare una *classe* il cui **nome** e
i cui **membri**, **costruttori** e **metodi** sono *precisamente specificati*
nel testo dell'esercizio. Diversamente dal solito, tale classe **non** deve
contenere il metodo `main` in quanto ad ogni esercizio è  associata una classe
di nome `TestRunner` (predisposta dal docente e che **non deve essere
modificata**) la quale, istanziando opportunamente la classe da voi
implementata, ne eserciterà le funzionalità, adoperando al solito i vari file di
testo provvisti; maggiori informazioni sul comportamento di tale classe di
*test* sono presenti al termine della descrizione dell'esercizio.

Per iniziare, dovrete implementare la classe di nome `Posizione` che abbia un
costruttore con segnatura

    public Posizione(int riga, int colonna)

che rappresenti una delle possibili posizioni della battaglia navale (in cui,
ricordiamo, ci sono `10` righe e colonne, che qui saranno numerate a partire da
`0`, fino a `9` incluso); tale classe deve inoltre avere due membri *immutabili*
e *pubblici* di nome `riga` e `colonna` che consentano di accedere ai relativi
valori (al posto dei consueti *getter*).

Tale classe deve avere inoltre un metodo *statico*

    public static Posizione parsePosizione(String posizione)

che, a partire da una posizione specificata da una lettera maiuscola compresa
tra `A` e `J` che indica la colonna immediatamente seguita da un numero compreso
tra `1` e `10` che indica la riga, restituisca l'oggetto di classe `Posizione`
corrispondente; ad esempio, dopo l'esecuzione di

    Posizione p = Posizione.parsePosizione("B10");

l'oggetto `p` avrà `p.colonna` pari a `1` e `p.riga` pari a `9`.

Per finire, tale classe deve *sovrascrivere* il metodo `toString` in modo che la
rappresentazione testuale di una posizione sia data dalla coppia `riga` e
`colonna` (separate da `, `  e racchiusa tra parentesi tonde); nell'esempio
precedente

    p.toString()

corrisponde alla stringa `(9, 1)`.

### La classe di test

La classe `TestRunner` (fornita assieme a questo testo e che **non deve essere
modificata**), se posta in esecuzione col comando `soluzione` istanzia la
posizione `(0, 0)` e ne stampa riga e colonna, poi usa il metodo
`parsePosizione` per ottenere la posizione data dal primo argomento sulla linea
di comando e lo stampa (come stringa).


Vincoli
-------

La classe `Posizione` deve contenere almeno i membri, il costruttore e i metodi
sopra specificati, ma può contenere ogni altro membro, costruttore, o metodo che
sia ritenuto utile per la sua implementazione.


Esempio
-------

Eseguendo `soluzione B10` la classe `TestRunner` emetterà

    0
    0
    (9, 1)

nel flusso di uscita.
