
public class Getränke extends Produkt{

	String GetränkeArt;
	int flaschengröße; //Größe der Flasche, zb. 1L 2L 5L
	int verkaufsmenge; // Anzahl der Flaschen welche Zusammen verkauf werden, z.B. 1Flasche, 5 Flaschen 11 Flaschen
	double pfand; // Wir gehen davon aus, dass nur Getränke in Pfandbehältern verkauft werden
	boolean dose; // Wenn true, wird der Pfand auf 0.10€ gesezt, wenn falsch (also eine Flasche) bleibt der Pfand auf 0.25€
	int pfandImUmlauf; // wird bei jedem Verkauf erhöht
	
	public Getränke() {
		super();
		GetränkeArt = "";
		flaschengröße = 0;
		verkaufsmenge = 0;
		pfand = 0;
		dose = false; //Standartmäßig wird angenommen, dass es sich um KEINE Dose handelt.
	}
	
	public Getränke(String GetränkeArt, int flaschengröße, int verkaufsmenge, boolean dose){
		super();
		this.GetränkeArt = GetränkeArt;
		this.flaschengröße = flaschengröße;
		this.verkaufsmenge = verkaufsmenge;
		this.dose = dose;
		
		if (dose == true) {
			this.pfand = 0.1;		
		}
		else {
			this.pfand = 0.25;
		}	
	}

	public int getFlaschengröße() {
		return flaschengröße;
	}

	public void setFlaschengröße(int flaschengröße) {
		this.flaschengröße = flaschengröße;
	}

	public int getVerkaufsmenge() {
		return verkaufsmenge;
	}

	public void setVerkaufsmenge(int verkaufsmenge) {
		this.verkaufsmenge = verkaufsmenge;
	}

	public double getPfand() {
		return pfand;
	}

	public void setPfand(double pfand) {
		this.pfand = pfand;
	}

	public boolean isDose() {
		return dose;
	}

	public void setDose(boolean dose) {
		this.dose = dose;
	}

	public int getPfandImUmlauf() {
		return pfandImUmlauf;
	}

	public void setPfandImUmlauf(int pfandImUmlauf) {
		this.pfandImUmlauf = pfandImUmlauf;
	}
	
	
	
}
