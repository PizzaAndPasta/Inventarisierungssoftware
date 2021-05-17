
public class TierischeLebensmittel extends Lebensmittel {
	private String Tier;
	private String Art;
	private int haltung;
	
	/* ein Int Wert für die Haltung, 1 - 4 sind für Fleisch und Käse (1 beste), 5 und 6 für Fisch (5 Zucht, 6 Freifang)
	 * Art beschreibt die Art des Lebensmittels, "Käse" "Fleisch "Fisch"
	 */
	
	public TierischeLebensmittel() {
		super();
		this.Tier = "";
		this.Art = "";
		this.haltung = 0;
	}
	
	public TierischeLebensmittel(String Tier, String Art, int haltung) {
		super();
		this.Tier = Tier;
		this.Art = Art;
		this.haltung = haltung;
	}

	public String getTier() {
		return Tier;
	}

	public void setTier(String tier) {
		Tier = tier;
	}

	public String getArt() {
		return Art;
	}

	public void setArt(String art) {
		Art = art;
	}

	public int getHaltung() {
		return haltung;
	}

	public void setHaltung(int haltung) {
		this.haltung = haltung;
	}
	
	
	
}
