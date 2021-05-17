
public class Zeitschriften extends Produkt {
	
	private String Herausgeber;
	private int ausgabe;
	
	
	public Zeitschriften() {
		super();
		Herausgeber = "";
		ausgabe = 0;
		
	}
	
	public Zeitschriften(String Herausgeber, int ausgabe) {
		super(String Name, double preis, int iD, int meng);
		this.Herausgeber = Herausgeber;
		this.ausgabe = ausgabe;
		
	}
	
	public String getHerausgeber() {
		return Herausgeber;
	}
	public void setHerausgeber(String herausgeber) {
		Herausgeber = herausgeber;
	}
	public int getAusgabe() {
		return ausgabe;
	}
	public void setAusgabe(int ausgabe) {
		this.ausgabe = ausgabe;
	}
	
	
	//Funktion zum Abschließen eines Abomodelles, welches für eine übergebene Anzahl an Monaten Zeitschriften zurücklegt
	
	public int abomodell(int monate) {
		int zurueckgelegt = monate;
		this.verfügbareMenge = verfügbareMenge - zurueckgelegt;
		
		return zurueckgelegt;
	}
	
	
	
	
	
	
}
