
public class ObstUndGemuese extends Lebensmittel {
	int gueteklasse; // 1 - 4 , wobei 1 beste
	
	public ObstUndGemuese() {
		super();
		this.gueteklasse = 0;
	}
	
	public ObstUndGemuese(int gueteklasse) {
		super();
		this.gueteklasse = gueteklasse;
	}

	public int getGueteklasse() {
		return gueteklasse;
	}

	public void setGueteklasse(int gueteklasse) {
		this.gueteklasse = gueteklasse;
	}
	
	
}
