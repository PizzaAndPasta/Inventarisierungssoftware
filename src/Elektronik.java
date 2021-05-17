
public class Elektronik extends Produkt {
	
	private String artDesGerätes;
	private String Hersteller;
	private int stromverbrauch;
	
	
	public Elektronik() {
		super();
		this.artDesGerätes = "";
		this.Hersteller = "";
		this.stromverbrauch = 0;
	}
	
	public Elektronik (String artDesGerätes, String Hersteller, int stromverbrauch) {
		super();
		this.artDesGerätes = artDesGerätes;
		this.Hersteller = Hersteller;
		this.stromverbrauch = stromverbrauch;
		
	}

	public String getArtDesGerätes() {
		return artDesGerätes;
	}

	public void setArtDesGerätes(String artDesGerätes) {
		this.artDesGerätes = artDesGerätes;
	}

	public String getHersteller() {
		return Hersteller;
	}

	public void setHersteller(String hersteller) {
		Hersteller = hersteller;
	}

	public int getStromverbrauch() {
		return stromverbrauch;
	}

	public void setStromverbrauch(int stromverbrauch) {
		this.stromverbrauch = stromverbrauch;
	}
	
	
}
