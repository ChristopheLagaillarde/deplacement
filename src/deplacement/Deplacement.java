package deplacement;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * L'interface va définir uniquement les comportements génériques possibles des classes Filles
 * Seul le programmeur va définir pour une classe fille donnée la manière dont les déplacements
 * vont se faire. Ex: pour la Classe Ascenseur on utilisera que déplacerEnY
 * La classe MERE MoyenDeTransport ne génère pas les déplacements 
 */
interface Deplacement {   // Implicitement abstract comme une classe 100% abstraite
	
	default int deplacerEnX(int origine, int destination) { // axe abcisse seulement
		
		return (origine + destination);
	};

    default int deplacerEnY(int origine, int destination) { // axe ordonnée seulement
		
		return (origine + destination);
	};
	
	default void seDeplace() { // A être overiding dans les classes filles
        Logger logger = Logger.getLogger(Deplacement.class.getName());;
		logger.log(Level.INFO, "** Objet générique se déplace en 2 dimensions");
		
		// Devra appeler deplacerEnX() ou deplacerEnY() ou les deux selons l'objet
		
	}
}

