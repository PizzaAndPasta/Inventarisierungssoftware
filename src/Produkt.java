
public abstract class Produkt {

	protected String Name;
	protected double preis;
	protected int produktID;
	protected int verfügbareMenge;
	
	
	public Produkt() {
		Name ="";
		preis = 0;
		produktID=0;
		verfügbareMenge = 0;
	}
	
	public Produkt(String Name, double preis, int iD, int menge) {
		this.Name = Name;
		this.preis = preis;
		this.produktID = iD;
		this.verfügbareMenge = menge;
	}
	
	
	//Get und Set Methoden
	public String getName() {
		return Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public double getPreis() {
		return preis;
	}


	public void setPreis(double preis) {
		this.preis = preis;
	}


	public int getProduktID() {
		return produktID;
	}


	public void setProduktID(int produktID) {
		this.produktID = produktID;
	}


	public int getVerfügbareMenge() {
		return verfügbareMenge;
	}


	public void setVerfügbareMenge(int verfügbareMenge) {
		this.verfügbareMenge = verfügbareMenge;
	}


	
	
	/*Eine Funktion, die eine Alter und das benötigte Alter nimmt und einen boolean Freigabewert zurück gibt
	public boolean Altersfreigabe(int alter, int altersbeschränkung)
	{
		if ( alter >= altersbeschränkung)
		{
			return true;
		}
		else
			return false;
	}
	*/
	
	
	
}
