package deplacement;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * classe MERE
 * La classe moyen de transport est une classe g�n�rique abstraite qui nommera
 * le type de transport, intancie la position initiale, et v�rifie la limite acceptable 
 * MoyenneDeTransport n'implementera PAS l'interface Deplacement
 */
public abstract class MoyenDeTransport {
	
	// Les Attributs
	
	static final int V_INITIAL = 10; // constante
	
	private String type;     // type du moyen de transport>
	protected int x;         // abcisse
	protected int y;         // ordonn�e
	protected int vitesse;   
	
	// les m�thodes pour calculer la vitesse et afficher seulement 
	
	MoyenDeTransport(String type, int x, int y, int vitesse){
		this.type = type;
		this.x = x;
		this.y = y;
		this.vitesse = vitesse;
	}
	/**
	 * Limite la vitesse maximum de l'objet utilis�
	 * @param facteurV
	 * @param vMax
	 * @return vitesse
	 */
	int limiter(int facteurV, int vMax){
		if (V_INITIAL < vMax) {
			vitesse = facteurV * V_INITIAL;
		}
		else {
			vitesse = vMax;
		}
		return vitesse;
	}
	
	/**
	 * Affiche la position sur l'axe x et/ou y de l'objet  
	 */
	void afficher() {
        Logger logger = Logger.getLogger(MoyenDeTransport.class.getName());
		logger.log(Level.INFO,String.format("la position du h�ro pour x est %i", this.x));
		logger.log(Level.INFO,String.format("la position du h�ro pour y est %i", this.y));

	}
	
	String getType() {
		return this.type;
	}
}
