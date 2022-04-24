package deplacement;

public class SousMarin extends MoyenDeTransport implements Deplacement{

	int z;

	SousMarin(String type, int x, int y,int z, int vitesse) {
		super(type, x, y, vitesse);
		this.z = z;
	}
	
	void afficher() {
		System.out.println("Position avec Sousmarin");
		super.afficher();
		System.out.println("la position du héro pour z est " + this.z);
		System.out.println("\n");

	}

	@Override
	int limiter(int facteurV, int vMax){	
		int vitesse = V_INITIAL * facteurV;

		if (vMax > 80) {
			vMax = 80;
		}

		if(vMax > (V_INITIAL * 7)) {
			vMax = V_INITIAL * 7;
		}

		if (vitesse > vMax) {
			vitesse = vMax;
		}

		return vitesse;
	}

	int deplacerEnY(int origine, int destination) {
		return (origine + destination);
	}
	
	int deplacerEnZ(int origine, int destination) {
		return (origine + destination);
	}

	@Override
	public void seDeplace(int origine, int destination) {
		this.x = deplacerEnX(origine,destination);
		this.y = deplacerEnY(origine,destination);
		this.z = deplacerEnZ(origine,destination);
	}



}
