# Beispieldateien zum Buch »Java -- Der Grundkurs«, 2. Auflage

Copyright 2017/2018 Michael Kofler + Rheinwerk Verlag

<https://kofler.info/buecher/java-der-grundkurs/>

<https://www.rheinwerk-verlag.de/4397>

Die Beispieldateien sind urheberrechtlich geschützt. Sie sind nur für die
persönliche Nutzung gedacht. Sie dürfen nicht weitergegeben oder für Schulungen
etc. verwendet werden.

Alle Beispieldateien liegen doppelt vor:

* Das Verzeichnis `intellij` enthält alle Beispiel
  in Form von Projekten der Entwicklungsumgebung
  IntelliJ IDEA.
  
* Das Verzeichnis `beispiele` enthält die Beispiele als
  Einzeldateien, die direkt mit `javac` kompiliert und mit 
  `java` ausgeführt werden können.

Sollten Sie unter Windows oder Linux arbeiten, ignorieren Sie bitte das
Verzeichnis `__MACOSX` und die Dateien `.DS_Store`.

## Beispieldateien mit IntelliJ nutzen

Starten Sie IntelliJ, führen Sie im Startdialog *Open* bzw. im
Hauptmenü *File/Open* aus und wählen Sie das Verzeichnis mit dem
gewünschten Beispiel aus, z.B. `intellij/kap10-rechteck`.

## Beispieldateien ohne IntelliJ nutzen

Das Verzeichnis `beispiele` enthält die `*.java`-Dateien aller Beispiele, wobei
jedes Beispiel in einem eigenen Verzeichnis gespeichert ist. Der Quellcode ist
mit den Eclipse-Dateien identisch, es fehlen nur die Eclipse-Metadateien.

Um ein Beispiel auszuprobieren, wechseln Sie in das entsprechende Verzeichnis,
kompilieren das Programm und führen es aus, z.B. so:

    cd beispiele/kap10-rechteck
    javac Rechteck.java
    java Rechteck
   
Da die Beispieldateien den Zeichensatz UTF-8 verwenden, müssen Sie unter
Windows beim Kompilieren die Option `-encoding utf-8` angeben (siehe auch
S. 149):

    cd beispiele\kap10-rechteck
    javac -encoding utf-8 Rechteck.java
    java Rechteck


    


   
