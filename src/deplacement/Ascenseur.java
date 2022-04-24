package deplacement;

/**
 * La classe Ascenseur ne peut se déplacer que sur l'axe y
 * @author Lagaillarde
 *
 */
public class Ascenseur extends MoyenDeTransport implements Deplacement{

	Ascenseur(String type, int x, int y, int vitesse) {
		super(type, x, y, vitesse);
	}
	
	@Override
	void afficher() {
		System.out.println("Position avec Ascenseur");
		super.afficher();
		System.out.println("\n");

	}

	@Override
	int limiter(int facteurV, int vMax){	
		int vitesse = V_INITIAL * facteurV;

		if(vMax > (V_INITIAL * 5)) {
			vMax = V_INITIAL * 5;
		}

		if (vMax > 50) {
			vMax = 50;
		}

		if (vitesse > vMax) {
			vitesse = vMax;
		}

		return vitesse;
	}

	int deplacerEnY(int origine, int destination) {
		return (origine + destination);
	}

	@Override
	public void seDeplace(int origine, int destination) {
		this.y = deplacerEnY(origine,destination);

	}

}