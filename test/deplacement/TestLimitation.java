package deplacement;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestLimitation {

	@Test
	void test() {
		
		// Test pour les voitures
		Voiture toyota = new Voiture("Voiture", 0, 0, 20);
		int vitesseActuel = toyota.limiter(10, 150);
		assertEquals(vitesseActuel,100);
		
		Voiture renault = new Voiture("Voiture", 0, 0, 20);
		vitesseActuel = renault.limiter(10, 99);
		assertEquals(vitesseActuel,99);
		
		// Test pour les ascenseurs
		Ascenseur ascenseurRapide = new Ascenseur("Ascenseur", 0, 0, 5);
		vitesseActuel = ascenseurRapide.limiter(5, 50);
		assertEquals(vitesseActuel,50);
		
		Ascenseur ascenseurLent = new Ascenseur("Ascenseur", 0, 0, 1);
		vitesseActuel = ascenseurLent.limiter(4, 40);
		assertEquals(vitesseActuel,40);

		// Test pour les voitures volantes
		VoitureVolante tesla = new VoitureVolante("Voiture volante", 0, 0, 1200);
		vitesseActuel = tesla.limiter(120, 1000);
		assertEquals(vitesseActuel,1000);
		
		VoitureVolante deLorean = new VoitureVolante("Voiture volante", 0, 0, 1200);
		vitesseActuel = deLorean.limiter(90, 900);
		assertEquals(vitesseActuel,900);


	}

}
