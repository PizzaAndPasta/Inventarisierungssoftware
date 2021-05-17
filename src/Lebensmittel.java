
public class Lebensmittel extends Produkt{

	protected String Haltbarkeitsdatum;
	protected String Hersteller;
	protected boolean biologisch;
	
	public Lebensmittel() {
		super();
		this.Haltbarkeitsdatum = "";
		this.Hersteller = "";
		this.biologisch = false;
	}
	
	public Lebensmittel(String Haltbarkeitsdatum, String Hersteller, boolean biologisch)
	{
		super();
		this.Haltbarkeitsdatum = Haltbarkeitsdatum;
		this.Hersteller = Hersteller;
		this.biologisch = biologisch;
	}

	public String getHaltbarkeitsdatum() {
		return Haltbarkeitsdatum;
	}

	public void setHaltbarkeitsdatum(String Haltbarkeitsdatum) {
		this.Haltbarkeitsdatum = Haltbarkeitsdatum;
	}

	public String getHersteller() {
		return Hersteller;
	}

	public void setHersteller(String hersteller) {
		Hersteller = hersteller;
	}

	public boolean isBiologisch() {
		return biologisch;
	}

	public void setBiologisch(boolean biologisch) {
		this.biologisch = biologisch;
	}
	
	
}
