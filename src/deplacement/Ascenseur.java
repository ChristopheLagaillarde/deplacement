package deplacement;

import deplacement.Deplacement;
import deplacement.MoyenDeTransport;

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

}