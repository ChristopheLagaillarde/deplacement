package deplacement;

public class Voiture extends MoyenDeTransport implements Deplacement{

	Voiture(String type, int x, int y, int vitesse) {
		super(type, x, y, vitesse);
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
}
