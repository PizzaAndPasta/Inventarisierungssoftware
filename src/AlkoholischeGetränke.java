
public class AlkoholischeGetränke extends Getränke {

	int alkoholGehalt;
	int altersfreigabe; //entsprechend der Getränkeart,bei Bier / Wein 16, Rest 18
	
	
	public AlkoholischeGetränke() {
		super();
		this.alkoholGehalt = 0;
		this.altersfreigabe = 0;
	}
	
	public AlkoholischeGetränke (int alkoholGehalt) {
		super();
		if (alkoholGehalt >= 16) {
			this.altersfreigabe = 18;
		}
		else if (alkoholGehalt > 0) {
			this.altersfreigabe = 16;		
		}
		else {
			this.altersfreigabe = 0;
		}
	}

	public int getAlkoholGehalt() {
		return alkoholGehalt;
	}

	public void setAlkoholGehalt(int alkoholGehalt) {
		this.alkoholGehalt = alkoholGehalt;
	}

	public int getAltersfreigabe() {
		return altersfreigabe;
	}

	public void setAltersfreigabe(int altersfreigabe) {
		this.altersfreigabe = altersfreigabe;
	}
	
	
	
	
}
