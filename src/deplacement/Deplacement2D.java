package deplacement;

public class Deplacement2D {

	public static void main(String[] args) {
		
		// Initialisation
		Machine uneMachine = new Machine();
		Voiture uneVoiture = new Voiture("Voiture",0,0,50);
		Ascenseur unAscenseur = new Ascenseur("Ascenseur",0,10,20);
		VoitureVolante ulm = new VoitureVolante("Voiture Volante",0,25,500);
		SousMarin unSousMarin = new SousMarin("Sous Marin", 0, 0, 0, 70);
		
		// Déplacement
		uneMachine.seDeplace(5, 50);
		uneVoiture.seDeplace(25, 300);
		unAscenseur.seDeplace(0, 50);
		ulm.seDeplace(60, 700);
		unSousMarin.seDeplace(85, 102);
		
		// Affichage
		uneMachine.afficher();
		uneVoiture.afficher();
		unAscenseur.afficher();
		ulm.afficher();
		unSousMarin.afficher();

	}

}
