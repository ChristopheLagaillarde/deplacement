package deplacement;

/**
 * La classe VoitureVolante peut se déplacer à la fois sur l'axe x et y
 * @author Lagaillarde
 *
 */
public class VoitureVolante extends MoyenDeTransport implements Deplacement{

	VoitureVolante(String type, int x, int y, int vitesse) {
		super(type, x, y, vitesse);
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
}