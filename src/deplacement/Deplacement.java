package deplacement;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * L'interface va d�finir uniquement les comportements g�n�riques possibles des classes Filles
 * Seul le programmeur va d�finir pour une classe fille donn�e la mani�re dont les d�placements
 * vont se faire. Ex: pour la Classe Ascenseur on utilisera que d�placerEnY
 * La classe MERE MoyenDeTransport ne g�n�re pas les d�placements 
 */
interface Deplacement {   // Implicitement abstract comme une classe 100% abstraite
	
	default int deplacerEnX(int origine, int destination) { // axe abcisse seulement
		
		return (origine + destination);
	};

    default int deplacerEnY(int origine, int destination) { // axe ordonn�e seulement
		
		return (origine + destination);
	};
	
	default void seDeplace() { // A �tre overiding dans les classes filles
        Logger logger = Logger.getLogger(Deplacement.class.getName());;
		logger.log(Level.INFO, "** Objet g�n�rique se d�place en 2 dimensions");
		
		// Devra appeler deplacerEnX() ou deplacerEnY() ou les deux selons l'objet
		
	}
}

