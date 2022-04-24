package deplacement;

/**
 * classe MERE
 * La classe moyen de transport est une classe générique abstraite qui nommera
 * le type de transport, intancie la position initiale, et vérifie la limite acceptable 
 * MoyenneDeTransport n'implementera PAS l'interface Deplacement
 */
public abstract class MoyenDeTransport {
	
	// Les Attributs
	
	static final int V_INITIAL = 10; // constante
	
	private String type;     // type du moyen de transport>
	protected int x;         // abcisse
	protected int y;         // ordonnée
	protected int vitesse;   
	
	// les méthodes pour calculer la vitesse et afficher seulement 
	
	MoyenDeTransport(String type, int x, int y, int vitesse){
		this.type = type;
		this.x = x;
		this.y = y;
		this.vitesse = vitesse;
	}
	/**
	 * Limite la vitesse maximum de l'objet utilisé
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
		System.out.println("la position du héro pour x est " + this.x);
		System.out.println("la position du héro pour y est " + this.y);
	}
	
	String getType() {
		return this.type;
	}
}
