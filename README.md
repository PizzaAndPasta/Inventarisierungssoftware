# Inventarisierungssoftware
Eine einfache Inventarisierungssoftware. Ziel war es so viel wie möglich mit abgeleiteten Klassen zu arbeiten. Jede Unterklasse hat neue Attribute oder Methoden. "AlkoholischeGetränke"
z.B. erweitert "Getränke" um den Alkoholgehalt und damit verbunden um eine Altersgrenze.


Es können neue Gegenstände dem Inventar hinzugefügt werden und man kann sich vorhandene Gegenstände anzeigen  lassen.
Die Gegenstände werden in einer ArrayList<Produkt> mit Objekten der Unterklassen gefüllt.

Produkt
|
|--Lebensmittel
|   |
|   |--TierischeLebensmittel
|   |--ObstUndGemüse
|
|---Getränke
|   |
|   |--Alkoholische Getränke
|
|--Elektronik
|--Zeitschriften


"Elektronik" und "Zeitschriften" sind noch gar nicht implementiert.
