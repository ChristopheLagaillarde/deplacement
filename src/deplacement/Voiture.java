package deplacement;

 class Voiture extends MoyenDeTransport implements Deplacement{

	Voiture(String type, int x, int y, int vitesse) {
		super(type, x, y, vitesse);
	}
	
	void afficher() {
		System.out.println("Position avec Voiture");
		super.afficher();
		System.out.println("\n");

	}

	@Override
	int limiter(int facteurV, int vMax){	
		int vitesse = V_INITIAL * facteurV;
		
		if (vMax > 150) {
			vMax = 150;
		}
		
	    if(vMax > (V_INITIAL * 10)) {
			vMax = V_INITIAL * 10;
		}
	    
		if (vitesse > vMax) {
			vitesse = vMax;
		}
		
		return vitesse;
	}
	
	@Override
	public int deplacerEnX(int origine, int destination) {
		return (origine + destination);
	}
	
	@Override
	public void seDeplace(int origine, int destination) {
		this.x = deplacerEnX(origine,destination);
			
	}
	
}
