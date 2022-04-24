package deplacement;

/**
 * La classe VoitureVolante peut se déplacer à la fois sur l'axe x et y
 * @author Lagaillarde
 *
 */
public class VoitureVolante extends Voiture implements Deplacement{

	VoitureVolante(String type, int x, int y, int vitesse) {
		super(type, x, y, vitesse);
	}
	
	void afficher() {
		System.out.println("Position avec Voiture volante");
		System.out.println("la position du héro pour x est " + this.x);
		System.out.println("la position du héro pour y est " + this.y);
		System.out.println("\n");

	}

	@Override
	int limiter(int facteurV, int vMax){	
		int vitesse = V_INITIAL * facteurV;
		
	    if(vMax > (V_INITIAL * 100)) {
			vMax = V_INITIAL * 100;
		}
	    
		if (vMax > 1200) {
			vMax = 1200;
		}
		
		if (vitesse > vMax) {
			vitesse = vMax;
		}
		
		return vitesse;
	}
	
	private int deplacerEnY(int origine, int destination) {
		return (origine + destination);
	}
	
	@Override
	public void seDeplace(int origine, int destination) {
		this.x = super.deplacerEnX(origine,destination);
		this.y = deplacerEnY(origine,destination);
	}
}