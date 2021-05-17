import java.util.Scanner;
import java.util.ArrayList;

public class Inventar {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);
		ArrayList<Produkt> produkte = new ArrayList<Produkt>(); //Neue Liste mit Produkt Objekten
	//	int produktID = 0;
		
		while (true)
		{
			System.out.println("Inventarmanagement System V.1");
			System.out.println("---------------------------");
			System.out.println("Was möchten Sie tun?");
			System.out.println("1 - Lagerbestand einsehen");
			System.out.println("2 - Produkt hinzufügen");
			System.out.println("3 - Produkt löschen");
			System.out.println("4 - Programm beenden");
			System.out.println("---------------------------");
			
			if (Scan.nextInt() == 1) {
				
				if (produkte.size() == 0)
				{
					System.out.println("Keine Produkte im Inventar.");
					//break;
					
				}	
				else {
					for (int i = 0; i < produkte.size(); i++)
					{
						if (produkte.get(i) instanceof ObstUndGemuese) {
						System.out.println("Name: " + produkte.get(i).Name + " Preis: " + produkte.get(i).preis + "€. Menge: " + produkte.get(i).verfügbareMenge + " Stück. Haltbarkeitsdatum: " + ((ObstUndGemuese)produkte.get(i)).getHaltbarkeitsdatum() + " Hersteller: " + ((ObstUndGemuese)produkte.get(i)).getHersteller() + " Güteklasse: " + ((ObstUndGemuese)produkte.get(i)).getGueteklasse());
						}
						else if(produkte.get(i) instanceof TierischeLebensmittel) {
							System.out.println("Art: " + ((TierischeLebensmittel)produkte.get(i)).getArt() + " Name: " + produkte.get(i).Name + " Preis: " + produkte.get(i).preis + "€. Menge: " + produkte.get(i).verfügbareMenge + " Stück. Haltbarkeitsdatum: " + ((TierischeLebensmittel)produkte.get(i)).getHaltbarkeitsdatum() + " Hersteller: " + ((TierischeLebensmittel)produkte.get(i)).getTier());
						}
						else if(produkte.get(i) instanceof TierischeLebensmittel) {
							System.out.println("Art: " + ((TierischeLebensmittel)produkte.get(i)).getArt() +  " Name: " + produkte.get(i).Name + " Preis: " + produkte.get(i).preis + "€. Menge: " + produkte.get(i).verfügbareMenge + " Stück. Haltbarkeitsdatum: " + ((TierischeLebensmittel)produkte.get(i)).getHaltbarkeitsdatum() + " Hersteller: " + ((TierischeLebensmittel)produkte.get(i)).getTier());
						}
						else if (produkte.get(i) instanceof AlkoholischeGetränke) {
							System.out.println("Name: " + produkte.get(i).Name + " Preis: " + produkte.get(i).preis + "€. Menge: " + produkte.get(i).verfügbareMenge + " Stück. Flaschengröße: " + ((AlkoholischeGetränke)produkte.get(i)).getFlaschengröße() + " Verkaufsmenge: " +
						((AlkoholischeGetränke)produkte.get(i)).getVerkaufsmenge() + " Pfand: " + ((AlkoholischeGetränke)produkte.get(i)).getPfand() + " Alkoholgehalt: " + ((AlkoholischeGetränke)produkte.get(i)).getAlkoholGehalt()   );
						}
						else if (produkte.get(i) instanceof Getränke) {
								System.out.println("Name: " + produkte.get(i).Name + " Preis: " + produkte.get(i).preis + "€. Menge: " + produkte.get(i).verfügbareMenge + " Stück. Flaschengröße: " + ((Getränke)produkte.get(i)).getFlaschengröße() + " Verkaufsmenge: " +
							((Getränke)produkte.get(i)).getVerkaufsmenge() + " Pfand: " + ((Getränke)produkte.get(i)).getPfand() );
						}
					
					}
					break;
				}
			}
			
			if (Scan.nextInt() == 2) {
				System.out.println("Wählen Sie die Produktart:");
				System.out.println("1 - Lebensmittel");
				System.out.println("2 - Getränke");
			//	System.out.println("3 - Elektronik");
			//	System.out.println("4 - Zeitschriften");
				
				if (Scan.nextInt() == 1){
					System.out.println("Welches Lebensmittel?");
					System.out.println("1 - Obst oder Gemüse");
					System.out.println("2 - Fleisch oder Fisch");
					System.out.println("3 - Käse");
					
					if (Scan.nextInt() == 1)
					{
						/*
						 * ZurZeit muss für jedes Produkt alles neu eingegeben werden. In Zukunft wird eine Möglichkeit implementiert bereits vorhandene Artikel um eine Menge X zu erhöhen.
						 * 
						 * 
						 */
						
						System.out.println("Bitte geben Sie die Produktdaten ein: ");
						
						
						ObstUndGemuese ne = new ObstUndGemuese();
						//Fortlaufende ID
					//	ne.produktID = produktID++;
						
						//Attribute von Produkt
						System.out.println("Name:");
						ne.Name = Scan.next();
						System.out.println("Preis:");
						ne.preis = Scan.nextDouble();
						System.out.println("Menge:");
						ne.verfügbareMenge = Scan.nextInt();
						
						//Attribute von Lebensmittel1
						
						System.out.println("Haltbarkeitsdatum:");
						ne.Haltbarkeitsdatum = Scan.next();
						System.out.println("Hersteller:");
						ne.Hersteller = Scan.next();
						System.out.println("biologisch ? 1 für ja 0 für Nein");
						int bool = Scan.nextInt();
						if (bool >= 1 ) {
							ne.biologisch = true;
						}
						else {
							ne.biologisch = false;
						}
						
						
						//Attribute von ObstUndGemuese
						
						System.out.println("GüteKlasse:");
						ne.gueteklasse = Scan.nextInt();
						
						
						produkte.add(ne);
						//System.out.println("Name: " + produkte.get(0).Name + " Preis: " + produkte.get(0).preis + " Menge: " + produkte.get(0).verfügbareMenge);
				
						
					}
					else if (Scan.nextInt() == 2) {
						
						System.out.println("Bitte geben Sie die Produktdaten ein: ");
						
						
						TierischeLebensmittel ne = new TierischeLebensmittel();
						//Fortlaufende ID
					//	ne.produktID = produktID++;
						
						
						System.out.println("Art des Lebensmittels? 1 für Fleisch, 2 für Fisch: ");
						if (Scan.nextInt() == 1)
							{
							ne.setArt("Fleisch");
							}
						else {
							ne.setArt("Fisch");
						}
						
						//Attribute von Produkt
						System.out.println("Name:");
						ne.Name = Scan.next();
						System.out.println("Preis:");
						ne.preis = Scan.nextDouble();
						System.out.println("Menge:");
						ne.verfügbareMenge = Scan.nextInt();
						
						//Attribute von Lebensmittel
						
						System.out.println("Haltbarkeitsdatum:");
						ne.Haltbarkeitsdatum = Scan.next();
						System.out.println("Hersteller:");
						ne.Hersteller = Scan.next();
						System.out.println("biologisch ? 1 für ja 0 für Nein");
						int bool = Scan.nextInt();
						if (bool >= 1 ) {
							ne.biologisch = true;
						}
						else {
							ne.biologisch = false;
						}
						
						
						//Attribute von TierischeLebensmittel
						
						System.out.println("Tier: ");
						ne.setTier(Scan.next());
						System.out.println("Haltungsstufe? 1 sehr gut bis 4 sehr schlecht: ");
						ne.setHaltung(Scan.nextInt());
						
						
						
						produkte.add(ne);
						
						
						
					}
					else if (Scan.nextInt() == 3) {
						
						System.out.println("Bitte geben Sie die Produktdaten ein: ");
						
						
						TierischeLebensmittel ne = new TierischeLebensmittel();
						//Fortlaufende ID
					//	ne.produktID = produktID++;
						
						
						ne.setArt("Käse");
						//Attribute von Produkt
						System.out.println("Name:");
						ne.Name = Scan.next();
						System.out.println("Preis:");
						ne.preis = Scan.nextDouble();
						System.out.println("Menge:");
						ne.verfügbareMenge = Scan.nextInt();
						
						//Attribute von Lebensmittel
						
						System.out.println("Haltbarkeitsdatum:");
						ne.Haltbarkeitsdatum = Scan.next();
						System.out.println("Hersteller:");
						ne.Hersteller = Scan.next();
						System.out.println("biologisch ? 1 für ja 0 für Nein");
						int bool = Scan.nextInt();
						if (bool >= 1 ) {
							ne.biologisch = true;
						}
						else {
							ne.biologisch = false;
						}
						
						
						//Attribute von TierischeLebensmittel
						
						System.out.println("Tier: ");
						ne.setTier(Scan.next());
						System.out.println("Haltungsstufe? 1 sehr gut bis 4 sehr schlecht: ");
						ne.setHaltung(Scan.nextInt());
						
						
						
						produkte.add(ne);
						
					}
					
				}
				else if(Scan.nextInt() == 2) {
					System.out.println("Handelt es sich um ein alkoholisches Getränk? 1 Ja, 2 Nein");
					
					if (Scan.nextInt() == 1 ) {
						
						
						System.out.println("Bitte geben Sie die Produktdaten ein: ");
						
						
						AlkoholischeGetränke neG = new AlkoholischeGetränke();
						//Fortlaufende ID
					//	ne.produktID = produktID++;
						
						
				
						//Attribute von Produkt
						System.out.println("Name:");
						neG.Name = Scan.next();
						System.out.println("Preis:");
						neG.preis = Scan.nextDouble();
						System.out.println("Menge:");
						neG.verfügbareMenge = Scan.nextInt();
						
						//Attribute von Getränke
						
						System.out.println("Flaschengröße in Liter:");
						neG.flaschengröße = Scan.nextInt();
						System.out.println("Verkaufsmenge in Flaschen: ");
						neG.verkaufsmenge = Scan.nextInt();
						System.out.println("Flasche oder Dose? 1 für Flasche, 2 für Dose:");
						int bol = Scan.nextInt();
						if (bol == 1) {
							neG.dose = false;
						}
						else {
							neG.dose = true;
						}
						
						
						
						//Attribute von AlkoholischeGetränke:
						
						System.out.println("Alkoholgehalt: ");
						neG.setAlkoholGehalt(Scan.nextInt());
				
						produkte.add(neG);
						
						
					}
					else {
						System.out.println("Bitte geben Sie die Produktdaten ein: ");
						
						
						Getränke neG = new Getränke();
						//Fortlaufende ID
						//	ne.produktID = produktID++;
						
						
				
						//Attribute von Produkt
						System.out.println("Name:");
						neG.Name = Scan.next();
						System.out.println("Preis:");
						neG.preis = Scan.nextDouble();
						System.out.println("Menge:");
						neG.verfügbareMenge = Scan.nextInt();
						
						//Attribute von Getränke
						
						System.out.println("Flaschengröße in Liter:");
						neG.flaschengröße = Scan.nextInt();
						System.out.println("Verkaufsmenge in Flaschen: ");
						neG.verkaufsmenge = Scan.nextInt();
						System.out.println("Flasche oder Dose? 1 für Flasche, 2 für Dose:");
						int bol = Scan.nextInt();
						if (bol == 1) {
							neG.dose = false;
						}
						else {
							neG.dose = true;
						}
				
						produkte.add(neG);
					}
					
					
				}
				
				
				
			}
			
			
			
		}
		Scan.close();
		
	}

}
